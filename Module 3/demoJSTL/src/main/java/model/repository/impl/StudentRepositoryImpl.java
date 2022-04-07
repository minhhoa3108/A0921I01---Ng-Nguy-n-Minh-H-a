package model.repository.impl;

import model.bean.Student;
import model.bean.StudentClass;
import model.repository.BaseRepository;
import model.repository.StudentRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentRepositoryImpl implements StudentRepository {
    private static final String FIND_BY_ALL ="select * from student;";
    private static final String DELETE_BY_ID ="call delete_student_by_id(?);";
    private static final String SEARCH ="SELECT * FROM student where name like ? and email like ? and class_id like ?;";
    private static final String ADD_NEW=" insert into student(`name`,birthday, gender,`point`, class_id,`account`,email) \n" +
            " values (?,?,?,?,?,?,?);";
    @Override
    public List<Student> findAll() {
        List<Student> studentList = new ArrayList<>();
        Connection connection = BaseRepository.getConnect();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(FIND_BY_ALL);
            ResultSet resultSet =preparedStatement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("id"); // colummLable : tên  thuocj tính của bảng
                String name  = resultSet.getString("name");
                Boolean gender = resultSet.getBoolean("gender");
                String birthday = resultSet.getString("birthday");
                int point = resultSet.getInt("point");
                String account = resultSet.getString("account");
                int classId = resultSet.getInt("class_id");
                String email = resultSet.getString("email");
                Student student = new Student(id,name,gender,birthday,point,account,classId,email);
                studentList.add(student);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return studentList;
    }

    @Override
    public boolean add(Student student) {
        Connection connection = BaseRepository.getConnect();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(ADD_NEW);
            preparedStatement.setString(1,student.getName());
            preparedStatement.setDate(2, Date.valueOf(student.getBirthday()));
            preparedStatement.setBoolean(3,student.isGender());
            preparedStatement.setInt(4,student.getPoint());
            preparedStatement.setInt(5,student.getClassId());
            preparedStatement.setString(6,student.getEmail());// account là email
            preparedStatement.setString(7,student.getEmail());// email
            int check = preparedStatement.executeUpdate();// trả về số lương record bị ảnh hưởng ( thếm mới thành công  =1)
            if (check!=0){
                return true;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delete(String id) {
        Connection connection = BaseRepository.getConnect();
        boolean check=false;
        try {
            CallableStatement callableStatement = connection.prepareCall(DELETE_BY_ID);
            callableStatement.setInt(1,Integer.parseInt(id));
             check = callableStatement.executeUpdate()>0;

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return check;
    }

    @Override
    public List<Student> search(String searchName, String searchEmail, String searchClassId) {
        List<Student> studentList = new ArrayList<>();
        Connection connection = BaseRepository.getConnect();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SEARCH);
            preparedStatement.setString(1,"%"+searchName+"%");
            preparedStatement.setString(2,"%"+searchEmail+"%");
            preparedStatement.setString(3,"%"+searchClassId+"%");
            ResultSet resultSet =preparedStatement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("id"); // colummLable : tên  thuocj tính của bảng
                String name  = resultSet.getString("name");
                Boolean gender = resultSet.getBoolean("gender");
                String birthday = resultSet.getString("birthday");
                int point = resultSet.getInt("point");
                String account = resultSet.getString("account");
                int classId = resultSet.getInt("class_id");
                String email = resultSet.getString("email");
                Student student = new Student(id,name,gender,birthday,point,account,classId,email);
                studentList.add(student);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return studentList;
    }
}
