import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter first number: ");
            String firstNum = scanner.nextLine();
            int x = 0;
            try {
                x = Integer.parseInt(firstNum);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                continue;
            }

            System.out.println("Enter second number: ");
            String secondNum = scanner.nextLine();
            int y = 0;
            try {
                y = Integer.parseInt(secondNum);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                continue;
            }
            System.out.println("Choose operation (+,-,*,/): ");
            String operation = scanner.nextLine();
            String o = operation;
            if (o.equals("+")) {
                System.out.println("Result is " + (x + y));
            } else if (o.equals("-")) {
                System.out.println("Result is " + (x - y));
            } else if (o.equals("*")) {
                System.out.println("Result is " + (x * y));
            } else if (o.equals("/")) {
                if (secondNum.equals("0")) {
                    System.out.println("Can not divide by 0!");
                } else {
                    System.out.println("Result is " + (x / y));
                }
            }
            System.out.println("If you want to make new calculate, press [Y]. press any key to exit.");
            String choice = scanner.nextLine();
            if (!choice.equalsIgnoreCase("Y")) {
                break;
            }
        }
    }
}