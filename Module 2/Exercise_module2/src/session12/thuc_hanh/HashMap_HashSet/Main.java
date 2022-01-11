package session12.thuc_hanh.HashMap_HashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Hai", 20, "Da Nang");
        Student student2 = new Student("Hoang", 30, "Hue");
        Student student3 = new Student("Nam", 23, "Ho Chi Minh");

        Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
        studentMap.put(1, student1);
        studentMap.put(2, student2);
        studentMap.put(3, student3);
        for (Map.Entry<Integer, Student> student: studentMap.entrySet()){
            System.out.println(student.toString());
        }

        System.out.println("----------- SET -------------");
        Set<Student> students = new HashSet<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        for (Student student : students){
            System.out.println(student.toString());
        }
    }
}
