class SkiPassFather {

    private int counter;
    private static int counter_id;
    private int id = counter_id++;



    public boolean isBan() {
        return ban;
    }

    private boolean ban = false;


    public void minus_counter(){
            counter--;
    }

    public boolean check_counter(){
        return counter>0 && !ban;
    }




}
