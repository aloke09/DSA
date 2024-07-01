package weekDay;

public class WeekDay
{
    private String day;
    private String date;

    public WeekDay(String day, String date) {
        this.day = day;
        this.date = date;
    }

    public String getDay() {
        return day;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return day + "(" + date + ")";
    }
}
