class SkiPass {

    private static int counter_id;
    private int id = counter_id++;
    private boolean ban = false;

    public boolean isBan() {
        return ban;
    }

    public int getId() {
        return id;
    }
}
