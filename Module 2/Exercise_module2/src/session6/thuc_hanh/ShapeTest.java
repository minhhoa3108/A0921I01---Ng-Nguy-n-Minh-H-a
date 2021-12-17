package session6.thuc_hanh;

public class ShapeTest {
    public static void main(String[] args) {
        //Kiểm tra class Shape
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);
        System.out.println("----------------------------------------");

        //Kiểm tra class Cỉcle
        Circle c1 = new Circle();
        System.out.println(c1);

        Circle c2 = new Circle(3.0);
        System.out.println(c2);

        Circle c3 = new Circle("Yellow", true, 5.0);
        System.out.println(c3);
        System.out.println("Area of Circle is: " + c3.getArea());
        System.out.println("Perimeter of Circle is: " + c3.getPerimeter());
        System.out.println("----------------------------------------");

        //Kiểm tra class Rectangle
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle("orange", true, 2.5, 3.8);
        System.out.println(rectangle);
        System.out.println("----------------------------------------");

        //kiểm tra class Square
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square("yellow", true, 5.0);
        System.out.println(square);
    }
}
