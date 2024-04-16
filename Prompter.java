import java.util.Scanner;

public class Prompter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the min value: ");
        int min = scanner.nextInt();

        System.out.print("Enter the max value: ");
        int max = scanner.nextInt();

        int number;

        do {
            System.out.print("Enter a number between " + min + " and " + max + ": ");
            number = scanner.nextInt();
        } while (number < min || number > max);

        System.out.println("You entered: " + number);

        scanner.close();
    }
}
