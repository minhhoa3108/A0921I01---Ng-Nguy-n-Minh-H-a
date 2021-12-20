package session6.bai_tap.DesignTriagle;

public class Shape {
    private String color = "green";

    public Shape() {

    }
    public Shape(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    @Override
    public String toString(){
        return "A Shape with color of " + this.color;
    }
}
