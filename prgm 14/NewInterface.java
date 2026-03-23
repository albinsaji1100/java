import java.util.Scanner;
import java.lang.Math;

interface AP{
	void input();
	void area();
	void perimeter();
}

class Circle implements AP{
	int r=0;
	double pi=Math.PI,area=0,perimeter=0;  // changed 3.14 → Math.PI

	public void input(){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter radius :");
		r=sc.nextInt();
	}

	public void area() {
		area = pi*r*r;
		System.out.println("Area of Circle = "+area);
	}

	public void perimeter() {
		perimeter = 2*pi*r;
		System.out.println("Perimeter of Circle = "+perimeter);
	}
}

class Rectangle implements AP{
	int l,b;
	double area=0,perimeter=0;

	public void input(){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter length :");
		l=sc.nextInt();
		System.out.println("enter breadth :");
		b=sc.nextInt();
	}

	public void area() {
		area = l*b;
		System.out.println("Area of rectangle = "+area);
	}

	public void perimeter() {
		perimeter = 2*(l+b);
		System.out.println("Perimeter of rectangle = "+perimeter);
	}
}

class Triangle implements AP{
	int s1,s2,s3;
	double area=0,perimeter=0,s;

	public void input(){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter side 1 :");
		s1=sc.nextInt();
		System.out.println("enter side 2 :");
		s2=sc.nextInt();
		System.out.println("enter side 3 :");
		s3=sc.nextInt();
	}

	public void area(){
		s=(s1+s2+s3)/2.0;
		area = Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
		System.out.println("Area of triangle = "+area);
	}

	public void perimeter(){
		perimeter = s1+s2+s3;
		System.out.println("Perimeter of triangle = "+perimeter);
	}
}

class Square implements AP{
	int s;
	double area=0,perimeter=0;

	public void input(){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter side :");
		s=sc.nextInt();
	}

	public void area(){
		area = s*s;
		System.out.println("Area of square = "+area);
	}

	public void perimeter(){
		perimeter = 4*s;
		System.out.println("Perimeter of square = "+perimeter);
	}
}

// FIX: class name should start with uppercase
public class NewInterface{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int ch;
		AP obj;

		do{
			System.out.println("-----MENU DRIVEN ------");
			System.out.println("1. Circle");
			System.out.println("2. Rectangle");
			System.out.println("3. Triangle");
			System.out.println("4. Square");
			System.out.println("5.Exit");
			System.out.print("Enter your choice :");
			ch=sc.nextInt();

			switch(ch){
				case 1:
					obj = new Circle();
					obj.input();
					obj.area();
					obj.perimeter();
					break;

				case 2:
					obj = new Rectangle();
					obj.input();
					obj.area();
					obj.perimeter();
					break;

				case 3:
					obj = new Triangle();
					obj.input();
					obj.area();
					obj.perimeter();
					break;

				case 4:
					obj = new Square();
					obj.input();
					obj.area();
					obj.perimeter();
					break;

				case 5:
					System.exit(0);

				default:
					System.out.println("Invalid Choice");
			}
		}while(ch!=5);
	}
}
