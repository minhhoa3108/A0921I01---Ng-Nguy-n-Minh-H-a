package model.service.impl;

import model.bean.Student;
import model.repository.StudentRepository;
import model.repository.impl.StudentRepositoryImpl;
import model.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository = new StudentRepositoryImpl();
    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public boolean add(Student student) {

        // keiemr tr dữ liệu
      return studentRepository.add(student);


    }

    @Override
    public boolean delete(String id) {
       return studentRepository.delete(id);
    }

}
