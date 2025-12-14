abstract class Shape {
    abstract public double getArea();
}

class Rectangle extends Shape {
    private double width;
    private double height;
    public Rectangle(double width, double height) { this.width = width; this.height = height; }
    @Override
    public double getArea() { return width * height; }
}

class Circle extends Shape {
    private double radius;
    public Circle(double radius) { this.radius = radius; }
    @Override
    public double getArea() { return Math.PI * radius * radius; }
}


public class MyClass {
  public static void main(String args[]) {
    Shape shape1 = new Rectangle(5, 10);
Shape shape2 = new Circle(5);
System.out.println(shape1.getArea()); // 50.0
System.out.println(shape2.getArea()); // ~78.5
  }
}