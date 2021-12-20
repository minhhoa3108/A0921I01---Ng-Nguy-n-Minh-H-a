package session6.bai_tap.DesignTriagle;

public class Triagle extends Shape{
    private double a1 = 1.0;
    private double a2 = 1.0;
    private double a3 = 1.0;

    public Triagle(){

    }
    public Triagle(String color, double a1, double a2, double a3){
        super(color);
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
    }

    public double getA1() {
        return a1;
    }

    public void setA1(double a1) {
        this.a1 = a1;
    }

    public double getA2() {
        return a2;
    }

    public void setA2(double a2) {
        this.a2 = a2;
    }

    public double getA3() {
        return a3;
    }

    public void setA3(double a3) {
        this.a3 = a3;
    }

    public double getArea(){
        return a1*a1*Math.sqrt(3)/4;
    }
    public double getPerimeter(){
        return a1 + a2+ a3;
    }

    @Override
    public String toString(){
        return "A Triagle color is " + getColor() + ", Area: " + getArea() + ", Perimeter: " + getPerimeter();
    }
}
