import java.util.Scanner;


interface BillInterface {
    void getDetails();
    void displayDetails();
}


class Product implements BillInterface {
    int productId;
    String name;
    int quantity;
    double price;
    double total;

    Scanner sc = new Scanner(System.in);

    public void getDetails() {
        System.out.print("Product ID: ");
        productId = sc.nextInt();
        sc.nextLine();

        System.out.print("Product Name: ");
        name = sc.nextLine();

        System.out.print("Product Quantity: ");
        quantity = sc.nextInt();

        System.out.print("Unit Price: ");
        price = sc.nextDouble();

        total = quantity * price; 
    }

    public void displayDetails() {
        System.out.printf("%-10d %-15s %-10d %-10.2f %-10.2f\n",
                productId, name, quantity, price, total);
    }
}


class Order implements BillInterface {
    int orderNo;
    int productCount;
    Product[] products;
    double netAmount = 0;

    Scanner sc = new Scanner(System.in);

    public void getDetails() {
        System.out.print("Enter Order No: ");
        orderNo = sc.nextInt();

        System.out.print("Enter number of products: ");
        productCount = sc.nextInt();

        products = new Product[productCount];

        for (int i = 0; i < productCount; i++) {
            System.out.println("\nEnter details for Product " + (i + 1));
            products[i] = new Product();
            products[i].getDetails();

            netAmount += products[i].total;
        }
    }

    public void displayDetails() {
        System.out.println("\nOrder No: " + orderNo);
        System.out.println("-------------------------------------------------------------");
        System.out.printf("%-10s %-15s %-10s %-10s %-10s\n",
                "ID", "Name", "Qty", "Price", "Total");
        System.out.println("-------------------------------------------------------------");

        for (Product p : products) {
            p.displayDetails();
        }

        System.out.println("-------------------------------------------------------------");
        System.out.printf("Net Amount: %.2f\n", netAmount);
    }
}


public class MainApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of orders: ");
        int n = sc.nextInt();

        Order[] orders = new Order[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Enter details for Order " + (i + 1) + " ---");
            orders[i] = new Order();
            orders[i].getDetails();
        }

      
        System.out.println("\n=========== BILL ===========");

        for (Order o : orders) {
            o.displayDetails();
        }

        sc.close();
    }
}
