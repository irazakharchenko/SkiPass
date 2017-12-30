import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SkiPassFather implements SkiPass {
    private KindSkiPass skipass_type ;
    private int counter;
    private static int counter_id;
    private int id = counter_id++;
    private String day_start = "";
    private boolean ban = false;



    public String get_skipass_type(){
        return skipass_type.skipass_type();
    }

    public String getDay_start(){
        return day_start;
    }


    public String today(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate localDate = LocalDate.now();
        return dtf.format(localDate);
    }

    public void minus_counter(){
        if(check_counter())
            counter--;
    }

    public boolean check_counter(){
        return counter>0 && !ban;
    }
}
