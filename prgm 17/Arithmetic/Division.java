package Arithmetic;
public class Division implements Arithmeticdiv {
double x, y;
public Division(double a, double b) {
x = a;
y = b;
}
public double divide() {
if (y == 0) {
System.out.println("Error: Division by zero!");
return 0;
}
return (double) x / y;
}
}
