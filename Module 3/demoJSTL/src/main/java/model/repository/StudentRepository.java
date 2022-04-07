package model.repository;

import model.bean.Student;

import java.util.List;

public interface StudentRepository {
    List<Student> findAll();
    boolean add(Student student);
    boolean delete(String id);
    List<Student> search(String name, String email, String classId);
}
