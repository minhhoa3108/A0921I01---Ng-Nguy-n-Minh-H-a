package session12.thuc_hanh.Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Kien", 30, "Quang Tri");
        Student student2 = new Student("Hoa", 25, "Da Nang");
        Student student3 = new Student("Linh", 26, "Ha Noi");

        List<Student> studentList = new ArrayList<Student>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        Collections.sort(studentList);
        for (Student st : studentList){
            System.out.println(st.toString());
        }

        System.out.println("-------- Comparator ---------");

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(studentList, ageComparator);
        System.out.println("So sánh theo tuổi");
        for (Student st : studentList){
            System.out.println(st.toString());
        }
    }
}
