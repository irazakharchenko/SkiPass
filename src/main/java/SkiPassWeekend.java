class SkiPassWeekend extends SkiPassFather {
    private KindSkiPass skipass_type ;
    private int counter;
    private static int counter_id;
    private int id = counter_id++;
    private String day_start = "";
    private boolean ban = false;

    public SkiPassWeekend(KindSkiPass type){
        if(type.toInt() == 5)
            ban = true;
        this.skipass_type = type;
        this.counter = type.toInt();
    }


    public boolean canMove(){
        if(ban)
            return false;
        switch (skipass_type.skipass_type()){
            case "day":
                if (!day_start.equals("")) {
                    if(!day_start.equals(today())) {
                        if (counter > 0){
                            counter--;
                            day_start = today();
                            return true;
                        }
                        else
                            return false;
                    }
                    else
                        return true;

                } else {
                    day_start = today();
                    return true;

                }

            case "hoist":
                if (counter > 0){
                    counter--;
                    return true;
                }
                else
                    return false;
            case "subscription":
                return true;
            default: return false;
        }


    }




}
