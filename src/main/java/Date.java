import java.util.Calendar;
import java.util.Random;

public class Date{
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    private int day;
    private int month;
    private int year;
    private int weekday;
    private final Random random = new Random();

    public int getWeekday() {
        return weekday;
    }

    public Date(){
        day = random.nextInt(31) ;
        month = random.nextInt(12)  ;
        year = 2018;
    }

    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
        weekday = day%7;
    }

    public boolean before(Date other){
        // if dates equal return true
        if(other.year > year )
            return true;
        if (other.year == year){
            if(other.month > month)
                return true;
            if(other.month == month){
                if(other.day > day){
                    return true;
                }
                if(other.day == day)
                    return true;

            }

        }
        return false;
    }
    public Date add_day(int number_days){
        int da,m,y;
        da = (day+number_days ) % 30;
        m = (month + (day+number_days ) / 30)%12;
        y = year + (month + (day+number_days ) / 30)/12;
        return new Date(da, m,y);
    }

    public Date add_season(){
        int m,y;
        m = (month + 3)%12;
        y = year + (month + 3)/12;
        return new Date(day, m,y);
    }

    public boolean equal(Date other){
        return year == other.year && day == other.day && month == other.month;
    }

    @Override
    public String toString() {
        return day+1+ "/"+month+1+ "/"+year;
    }


}
