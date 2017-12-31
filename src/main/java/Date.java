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

    private int day, month, year;
    private final Random random = new Random();
    public Date(){
        day = random.nextInt(31) ;
        month = random.nextInt(12)  ;
        year = 2018;
    }

    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
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
    public Date add(int number_days){
        int da,m,y;
        da = (day+number_days ) % 30;
        m = (month + (day+number_days ) / 30)%12;
        y = year + (month + (day+number_days ) / 30)/12;
        return new Date(da, m,y);
    }


    @Override
    public String toString() {
        return day+1+ "/"+month+1+ "/"+year;
    }


}
