package session15.bai_tap;

public class TriagleCheck {
    public void checkTriagle(int a, int b, int c) throws IllegalTriangleException{
        if (a < 0 || b < 0 || c < 0 || a+b < c || a+c < b || b+c < a){
            throw new IllegalTriangleException("Tam giác không hợp lệ");
        }else {
            System.out.println("Tam giác hợp lệ");
        }
    }
}
