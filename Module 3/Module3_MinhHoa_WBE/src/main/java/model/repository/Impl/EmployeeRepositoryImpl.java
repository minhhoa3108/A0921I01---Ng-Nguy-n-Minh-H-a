package model.repository.Impl;

import model.Employee;
import model.repository.BaseRepository;
import model.repository.EmployeeRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImpl implements EmployeeRepository {
    private static final String LIST_ALL_EMPLOYEE = "select * from employees;";

    @Override
    public List<Employee> listAll() {
        List<Employee> employeeList = new ArrayList<>();

        try(Connection connection = BaseRepository.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(LIST_ALL_EMPLOYEE);){
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                Date birthday = resultSet.getDate("birthday");
                double salary = resultSet.getDouble("salary");
                String phone = resultSet.getString("phone");
                String email = resultSet.getString("email");

                Employee employee = new Employee(id, name, birthday, salary, phone, email);
                employeeList.add(employee);
            }
        }catch (SQLException e) {
            printSQLException(e);
        }

        return employeeList;
    }

    @Override
    public boolean createEmployee(Employee employee) {
        return false;
    }

    @Override
    public boolean deleteEmployee(int id) {
        return false;
    }

    @Override
    public boolean editEmployee(Employee employee) {
        return false;
    }



    private void printSQLException(SQLException ex) {
        for (Throwable e : ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}
