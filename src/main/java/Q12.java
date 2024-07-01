import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class Q12
{
    public static void main(String[] args) throws ParseException {
        String message = "Hello <<name>>, We have your full name as <<full name>> in our system. "
                + "Your contact number is 91-xxxxxxxxxx. Please, let us know in case of any clarification. "
                + "Thank you BridgeLabz 01/01/2016.";
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = sc.nextLine();

        System.out.print("Enter your full name: ");
        String fullName = sc.nextLine();

        System.out.print("Enter your contact number (format: 91-xxxxxxxxxx): ");
        String contactNumber = sc.nextLine();

        System.out.print("Enter a date (dd/mm/yyyy): ");
        String dateStr = sc.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(dateStr, formatter);
//        String currentDate = new SimpleDateFormat("dd/MM/yyyy").format(new Date());

        // Replace placeholders using regex
        message = message.replaceAll("<<name>>", firstName);
        message = message.replaceAll("<<full name>>", fullName);
        message = message.replaceAll("91-xxxxxxxxxx", contactNumber);
        message = message.replaceAll("\\d{2}/\\d{2}/\\d{4}", String.valueOf(date));//

        // Print the modified message
        System.out.println("\nModified Message:");
        System.out.println(message);

        sc.close();
    }
}