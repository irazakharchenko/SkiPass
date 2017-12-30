import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SkiPassWeekend implements SkiPass {
    private Weekend skipass_type;
    private int counter;
    private static int counter_id;
    private int id = counter_id++;
    private String day_start = null;

    public SkiPassWeekend(Weekend type){
        this.skipass_type = type;
        this.counter = type.toInt();
    }

    public void getrides() {

    }

    public void getdays() {

    }

    public boolean canMove(){
        switch (skipass_type.skipass_type()){
            case "day":
                if (!day_start.equals(null)) {
                    if(!day_start.equals(today())) {
                        if (counter > 0){
                            counter--;
                            day_start = today();
                            return true;
                        }
                        else
                            return false;
                    }
                    else{
                        return true;
                    }
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
}
