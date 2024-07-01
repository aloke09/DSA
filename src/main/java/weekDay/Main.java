package weekDay;

public class Main {
    public static void main(String[] args) {
        // Create a week and add WeekDay objects
        Week week1 = new Week();
        week1.addWeekDay("S", "1");
        week1.addWeekDay("M", "2");
        week1.addWeekDay("T", "3");
        week1.addWeekDay("W", "4");
        week1.addWeekDay("Th", "5");
        week1.addWeekDay("F", "6");
        week1.addWeekDay("Sa", "");

        // Display the week
        System.out.println("Week 1: " + week1);

        // Create another week and add WeekDay objects
        Week week2 = new Week();
        week2.addWeekDay("S", "");
        week2.addWeekDay("M", "8");
        week2.addWeekDay("T", "9");
        week2.addWeekDay("W", "10");
        week2.addWeekDay("Th", "11");
        week2.addWeekDay("F", "12");
        week2.addWeekDay("Sa", "13");

        // Display the week
        System.out.println("Week 2: " + week2);

        // Queue to store Week objects
        Queue<Week> calendar = new Queue<>();
        calendar.enqueue(week1);
        calendar.enqueue(week2);

        // Display the calendar
        System.out.println("Calendar:");
        while (!calendar.isEmpty()) {
            System.out.println(calendar.dequeue());
        }
    }
}

