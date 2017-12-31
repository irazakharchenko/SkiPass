import java.util.Calendar;

class SkiPassFather {
    private KindSkiPass skipass_type ;
    private int counter;
    private static int counter_id;
    private int id = counter_id++;
    private String day_start = "";


    public boolean isBan() {
        return ban;
    }

    private boolean ban = false;

    public String get_skipass_type(){
        return skipass_type.skipass_type();
    }

    public String getDay_start(){
        return day_start;
    }

    public int today(){
        Calendar cal = Calendar.getInstance();
        int day = cal.get(Calendar.DAY_OF_MONTH);

        return day;
    }

    public void minus_counter(){
            counter--;
    }

    public boolean check_counter(){
        return counter>0 && !ban;
    }

    public void make_day_start_today(){
        minus_counter();
        //day_start = today();
    }

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int day = cal.get(Calendar.DAY_OF_MONTH);
        cal.add(Calendar.DAY_OF_MONTH, -3);
        int dsay1 = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(cal.before(cal) +" "+ day);
    }
}
