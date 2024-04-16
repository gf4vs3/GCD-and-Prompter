import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter a second number: ");
        int num2 = scanner.nextInt();

        while (num2 > 0) {
            int temp = num1 % num2;
            num1 = num2;
            num2 = temp;
        }

        System.out.println("The GCD is " + num1);

        scanner.close();
    }
}
