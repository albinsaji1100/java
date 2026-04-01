import java.util.Scanner;


class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class AverageExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Enter number: ");
        n = sc.nextInt();

        int sum = 0;

        try {
            System.out.println("Enter " + n + " elements:");
            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();

                if (num < 0) {
                    throw new NegativeNumberException("negative number not allowed");
                }

                sum += num;
            }

            double avg = (double) sum / n;
            System.out.println("Average = " + avg);

        } catch (NegativeNumberException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}
