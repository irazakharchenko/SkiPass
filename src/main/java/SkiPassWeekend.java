import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SkiPassWeekend implements SkiPass {
    private Weekend skipass_type ;
    private int counter;
    private static int counter_id;
    private int id = counter_id++;
    private String day_start = "";

    public SkiPassWeekend(Weekend type){
        this.skipass_type = type;
        this.counter = type.toInt();
    }

    public String get_skipass_type(){
         return skipass_type.skipass_type();
    }

    public String getDay_start(){
        return day_start;
    }

    public boolean canMove(){

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

    public String today(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate localDate = LocalDate.now();
        return dtf.format(localDate);
    }

    public void minus_counter(){
        counter--;
    }

    public boolean check_counter(){
        return counter>0;
    }
}
