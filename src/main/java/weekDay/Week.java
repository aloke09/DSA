package weekDay;

public class Week {
    private Queue<WeekDay> days;

    public Week() {
        days = new Queue<>();
    }

    public void addWeekDay(String day, String date) {
        days.enqueue(new WeekDay(day, date));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Queue<WeekDay> tempQueue = new Queue<>();
        while (!days.isEmpty()) {
            WeekDay wd = days.dequeue();
            sb.append(wd.toString()).append(" ");
            tempQueue.enqueue(wd);
        }
        while (!tempQueue.isEmpty()) {
            days.enqueue(tempQueue.dequeue());
        }
        return sb.toString().trim();
    }
}
