package model.service;

import model.bean.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();
    boolean add(Student student);
    boolean delete(String id);
}
