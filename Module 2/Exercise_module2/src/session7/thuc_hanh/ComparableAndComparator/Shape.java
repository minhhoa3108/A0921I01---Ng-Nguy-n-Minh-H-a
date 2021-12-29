package session7.thuc_hanh.ComparableAndComparator;

public class Shape {
    private String color = "green";
    private  boolean filled = true;

    public Shape() {

    }
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public boolean getFilled(){
        return filled;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }

    @Override
    public String toString(){
        return "A Shape with color of " + this.color + " and " + (getFilled() ? "filled" : "not filled");
    }
}
