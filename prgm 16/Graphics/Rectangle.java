package Graphics;

public class Rectangle implements GraphicsTr {
    int length, width;

    public Rectangle(int a, int b) {
        length = a;
        width = b;
    }

    public int perimeter() {
        return 2 * (length + width);
    }

    public double area() {
        return length * width;
    }
}
