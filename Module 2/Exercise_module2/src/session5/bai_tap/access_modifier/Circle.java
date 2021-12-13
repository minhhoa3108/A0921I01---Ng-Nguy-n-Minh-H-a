package session5.bai_tap.access_modifier;

public class Circle {
    private double radius;
    private String color;

    public Circle(){

    }
    public Circle(double radius){
        this.radius = radius;
    }

    protected double getRadius(){
        return  radius;
    }
    protected double getArea(){
        return 3.14*radius*radius;
    }
}
