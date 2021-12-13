package session5.thuc_hanh.static_method;

public class Students {
    private int rollno;
    private String name;
    private static String college = "VKU";

    Students(int r, String n){
        rollno = r;
        name = n;
    }
    static void change(){
        college = "CODEGYM";
    }
    void display(){
        System.out.println(rollno + " " + name + " " + college);
    }
}
