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
        day = random.nextInt(31);
        month = random.nextInt(12);
        year = random.nextInt(2019);
    }

    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
}
