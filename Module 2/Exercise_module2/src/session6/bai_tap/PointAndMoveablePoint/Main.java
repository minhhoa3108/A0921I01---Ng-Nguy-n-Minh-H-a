package session6.bai_tap.PointAndMoveablePoint;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(3, 5);
        System.out.println(p1);
        MoveablePoint mv1 = new MoveablePoint(3, 5, 1, 2);
        System.out.println(mv1);
        System.out.println(mv1.move());
    }
}
