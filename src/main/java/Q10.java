import java.util.*;
public class Q10
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N : ");
        int N = scanner.nextInt();
        int pow = (int) Math.pow(2, N);
        N=pow;

        System.out.println("Think of a number between 0 and " + (N - 1));

        int low = 0;
        int high = N - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            System.out.println("Is your number less than or equal to " + mid + "? (true/false)");
            boolean response = scanner.nextBoolean();

            if (response) {
                high = mid;
            } else {
                low = mid + 1;
            }

            // When low and high converge, we have found the number
            if (low == high) {
                System.out.println("Your number is " + low);
                break;
            }
        }
    }
}

