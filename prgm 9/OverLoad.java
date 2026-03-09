import java.util.Scanner;

public class OverLoad {

    void area(float x) {
        System.out.println("The area of the square is " + Math.pow(x, 2) + " sq units");
    }

    void area(float x, float y) {
        System.out.println("The area of the rectangle is " + (x * y) + " sq units");
    }

    void area(double x) {
        double z = Math.PI * x * x;
        System.out.println("The area of the circle is " + z + " sq units");
    }

    public static void main(String[] args) {

        OverLoad ob = new OverLoad();
        Scanner sc = new Scanner(System.in);
        Scanner ar = new Scanner(System.in);

        while (true) {

            System.out.println("\nEnter your choice");
            System.out.println("1.Area of square");
            System.out.println("2.Area of rectangle");
            System.out.println("3.Radius of circle");
            System.out.println("4.Exit");

            int choice;
            float a, b;
            double x;

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Enter the side of the square");
                    a = ar.nextFloat();
                    ob.area(a);
                    break;

                case 2:
                    System.out.println("Enter the length and breadth of the rectangle");
                    a = ar.nextFloat();
                    b = ar.nextFloat();
                    ob.area(a, b);
                    break;

                case 3:
                    System.out.println("Enter radius of the circle");
                    x = ar.nextDouble();
                    ob.area(x);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid command");
                    break;
            }
        }
    }
}
