import java.util.Scanner;

public class pt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Request user input
        System.out.print("Enter your start number, the range will be added and squared: ");
        int n1 = scanner.nextInt();

        System.out.print("Enter your end number, the range will be added and squared: ");
        int n2 = scanner.nextInt();

        // Validate and calculate
        int sum = 0;
        for (int i = n1; i <= n2; i++) {
            sum += i * i;
        }

        System.out.println("The sum of numbers squared from " + n1 + " to " + n2 + " is " + sum);

        scanner.close();
    }
}