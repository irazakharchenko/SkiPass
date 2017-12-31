class SkiPassWorkDays extends SkiPass {
    private KindSkiPass skipass_type ;
    private int counter;
    private static int counter_id;
    private int id = counter_id++;
    private String day_start = "";
    private boolean ban = false;

    public SkiPassWorkDays(KindSkiPass type){
        if(type.skipass_type().equals("subscription"))
            ban = true;
        this.skipass_type = type;
        this.counter = type.toInt();
    }
}
