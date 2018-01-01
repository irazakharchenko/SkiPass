import java.util.Random;

public class Date {
    private final Random random = new Random();
    private int day;
    private int month;
    private int year;
    private int weekday;

    public Date() {
        day = random.nextInt(31);
        month = random.nextInt(12);
        year = 2018;
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
        weekday = day % 7;
    }

    int getWeekday() {
        return weekday;
    }

    boolean before(Date other) {
        // if dates equal return true
        if (other.year > year)
            return true;
        if (other.year == year) {
            if (other.month > month)
                return true;
            if (other.month == month) {
                if (other.day > day) {
                    return true;
                }
                if (other.day == day)
                    return true;

            }

        }
        return false;
    }

    Date add_day(int number_days) {
        int da, m, y;
        da = (day + number_days) % 30;
        m = (month + (day + number_days) / 30) % 12;
        y = year + (month + (day + number_days) / 30) / 12;
        return new Date(da, m, y);
    }

    Date add_season() {
        int m, y;
        m = (month + 3) % 12;
        y = year + (month + 3) / 12;
        return new Date(day, m, y);
    }

    boolean equal(Date other) {
        return year == other.year && day == other.day && month == other.month;
    }

    @Override
    public String toString() {
        return day + "/" + (month) + "/" + year;
    }


}
