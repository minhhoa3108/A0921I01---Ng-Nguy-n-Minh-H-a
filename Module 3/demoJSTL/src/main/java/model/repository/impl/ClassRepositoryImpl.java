package model.repository.impl;

import model.bean.Student;
import model.bean.StudentClass;
import model.repository.BaseRepository;
import model.repository.ClassRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClassRepositoryImpl implements ClassRepository {
    private static List<StudentClass> studentClassList = new ArrayList<>();
    private static final String FIND_BY_ALL ="select * from class;";
    @Override
    public List<StudentClass> findAll() {
        List<StudentClass> studentClassList = new ArrayList<>();
        Connection connection = BaseRepository.getConnect();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(FIND_BY_ALL);
            ResultSet resultSet =preparedStatement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("id"); // colummLable : tên  thuocj tính của bảng
                String name  = resultSet.getString("name");
                StudentClass studentClass = new StudentClass(id,name);
                studentClassList.add(studentClass);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return studentClassList;
    }
}
