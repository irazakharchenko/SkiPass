public class Turnstile {


    private boolean canMove(SkiPass sp){
        if(sp.isBan())
            return false;
        return true;
    }

    public void want_go(SkiPass sp){
        if(canMove(sp))
            System.out.println("Congratulations!");
        else
            System.out.println("You can't go sorry.");
    }
}
