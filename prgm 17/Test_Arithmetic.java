import Arithmetic.*;
import java.util.Scanner;

public class Test_Arithmetic {
    public static void main(String args[]) {
         Scanner sc = new
         Scanner(System.in);
         
         System.out.println("\nEnter numbers to be Added: ");
         int a = sc.nextInt();
         int b = sc.nextInt();
         Addition sum = new Addition(a,b);
         System.out.println("Sum of "+ a +" and "+ b +" is: " + sum.add());
         
         System.out.println("\nEnter numbers to be Subtracted: ");
         int e = sc.nextInt();
         int f = sc.nextInt();
         Subtraction sub = new Subtraction(e,f);
         System.out.println("Difference between "+ e +" and "+ f +" is: " + sub.subtract());
         
         System.out.println("\nEnter numbers to be Multiplied: ");
         int p = sc.nextInt();
         int q = sc.nextInt();
         Multiplication product = new Multiplication(p,q);
         System.out.println("Product "+ p +" and "+ q +" is: " + product.cross());
         
         System.out.println("\nEnter numbers to be Divided: ");
         double x = sc.nextInt();
         double y = sc.nextInt();
         Division div = new Division(x,y);
         System.out.println(x +" divided by "+ y +" = " + div.divide());
         }
}
