package session6.bai_tap.CircleAndCylinder;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(5.0, "green");
        System.out.println(c1);
        System.out.println(c1.getArea());
        Cylinder cylinder1 = new Cylinder(5.0, "red", 3.0);
        System.out.println(cylinder1);
    }
}
