abstract class Shape {
    String color;

    // Constructor
    Shape(String color) {
        this.color = color;
    }

    // Abstract methods
    abstract double area();
    abstract void display();

    // Concrete method
    void showColor() {
        System.out.println("Shape color: " + color);
    }
}

class Circle extends Shape {
    double radius;

    // Constructor
    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    // Implement abstract methods
    double area() {
        return Math.PI * radius * radius;
    }

    void display() {
        System.out.println("This is a Circle.");
    }
}

 class Main {
    public static void main(String[] args) {
        Shape circle = new Circle("Red", 5.0);
        circle.display();             // Outputs: This is a Circle.
        circle.showColor();           // Outputs: Shape color: Red
        System.out.println("Area: " + circle.area());  // Outputs area
    }
}
