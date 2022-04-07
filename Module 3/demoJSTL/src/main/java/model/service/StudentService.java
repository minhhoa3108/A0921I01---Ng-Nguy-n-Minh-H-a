package model.service;

import model.bean.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();
    List<String> add(Student student);
    boolean delete(String id);
    List<Student> search(String name, String email, String classId);
}
