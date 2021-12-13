package session5.bai_tap.access_modifier;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(1.0);
        System.out.println("Bán kính hình tròn là: " + c1.getRadius());
        System.out.println("Diện tích hình tròn là: " + c1.getArea());
        Circle c2 = new Circle(2.0);
        System.out.println("Bán kính hình tròn là: " + c2.getRadius());
        System.out.println("Diện tích hình tròn là: " + c2.getArea());
    }
}
