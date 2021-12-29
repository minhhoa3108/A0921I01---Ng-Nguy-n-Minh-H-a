package session7.thuc_hanh.ComparableAndComparator;

public class ComparableCircle extends Circle implements java.lang.Comparable<ComparableCircle> {
    public ComparableCircle(){

    }
    public ComparableCircle(double radius){


    }
    public ComparableCircle(String color, boolean filled, double radius){
        super(color, filled, radius);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if(getRadius() > o.getRadius()){
            return 1;
        }else if(getRadius() < o.getRadius()){
            return -1;
        }else{
            return 1;
        }
    }
}
