package Circle;

public class Perimeter {
    private double length;
    private double breadth;

    // Constructor
    public Perimeter(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate area
    public double calculateArea() {
        return length * breadth;
    }

    // Method to calculate perimeter
    public double calculatePerimeter() {
        return 2 * (length + breadth);
    }

    public static void main(String[] args) {
        Perimeter rect = new Perimeter(10, 5);
        System.out.println("Area of Rectangle: " + rect.calculateArea());
        System.out.println("Perimeter of Rectangle: " + rect.calculatePerimeter());
    }
}

