public class Turnstile {


    private boolean canMove(SkiPassFather sp){
        if(sp.isBan())
            return false;
        switch (sp.get_skipass_type()){
            case "day":
                if (!sp.getDay_start().equals("")) {
                    if(!sp.getDay_start().equals(sp.today())) {
                        if (sp.check_counter()){
                            sp.make_day_start_today();
                            return true;
                        }
                        else
                            return false;
                    }
                    else
                        return true;

                } else {
                    sp.make_day_start_today();
                    return true;

                }

            case "hoist":
                if (sp.check_counter()){
                    sp.minus_counter();
                    return true;
                }
                else
                    return false;
            case "subscription":
                return true;
            default: return false;
        }


    }

    public void want_go(SkiPassFather sp){
        if(canMove(sp))
            System.out.println("Congratulations!");
        else
            System.out.println("You can't go sorry.");
    }
}
