package model.service.impl;

import common.Validation;
import model.bean.Student;
import model.repository.StudentRepository;
import model.repository.impl.StudentRepositoryImpl;
import model.service.StudentService;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository = new StudentRepositoryImpl();
    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public List<String> add(Student student) {
        List<String> messList = new ArrayList<>();
        boolean check=true;
        // check tên
        if (Validation.checkName(student.getName())){
            messList.add("");
        }else {
            check=false;
            messList.add("Tên không đúng định dạng");
        }
        // check cho điểm
        if (Validation.checkPoint(String.valueOf(student.getPoint()))){
            messList.add("");
        }else {
            check=false;
            messList.add("Điểm không đúng định dạng");
        }
        //check email
        if (Validation.checkEmail(student.getEmail())){
            messList.add("");
        }else {
            check=false;
            messList.add("Email không đúng định dạng");
        }
        if (check){
            // cho lưu
            studentRepository.add(student);
        }
        // keiemr tr dữ liệu
      return messList;


    }

    @Override
    public boolean delete(String id) {
       return studentRepository.delete(id);
    }

    @Override
    public List<Student> search(String name, String email, String classId) {
        return studentRepository.search(name,email,classId);
    }

}
