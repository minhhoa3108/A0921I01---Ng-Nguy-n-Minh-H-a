package model.repository.Impl;

import model.Employee;
import model.repository.BaseRepository;
import model.repository.EmployeeRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeeRepositoryImpl implements EmployeeRepository {
    private static final String LIST_ALL_EMPLOYEE = "select * from nhan_vien;";
    private static final String ADD_NEW_EMPLOYEE = "insert into nhan_vien(ma_nhan_vien, ho_ten, ngay_sinh, so_cmnd, luong, so_dien_thoai, email, dia_chi)values(?, ?, ?, ?, ?, ?, ?, ?);";
    private static final String DELETE_EMPLOYEE = "delete from nhan_vien where nhan_vien.ma_nhan_vien = ?;";
    private static final String SEARCH_EMPLOYEE_BY_ID = "select * from nhan_vien where nhan_vien.ma_nhan_vien = ?;";
    private static final String UPDATE_EMPLOYEE = "Call editEmployee(?, ?, ?, ?, ?, ?, ?, ?);";
    private static final String SEARCH_EMPLOYEE = "SELECT * FROM nhan_vien where ho_ten like ? and email like ?;";


    @Override
    public List<Employee> listAll() {
        List<Employee> employeeList = new ArrayList<>();

        try(Connection connection = BaseRepository.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(LIST_ALL_EMPLOYEE);){
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                int ma_nhan_vien = resultSet.getInt("ma_nhan_vien");
                String ho_ten = resultSet.getString("ho_ten");
                String ngay_sinh = resultSet.getString("ngay_sinh");
                String so_cmnd = resultSet.getString("so_cmnd");
                double luong = resultSet.getDouble("luong");
                String so_dien_thoai = resultSet.getString("so_dien_thoai");
                String email = resultSet.getString("email");
                String dia_chi = resultSet.getString("dia_chi");

                Employee employee = new Employee(ma_nhan_vien, ho_ten, ngay_sinh, so_cmnd, luong, so_dien_thoai, email, dia_chi);
                employeeList.add(employee);
            }
        }catch (SQLException e) {
            printSQLException(e);
        }

        return employeeList;
    }

    @Override
    public boolean createEmployee(Employee employee) {
        Connection connection = BaseRepository.getConnection();

        try{
            PreparedStatement preparedStatement = connection.prepareStatement(ADD_NEW_EMPLOYEE);
            preparedStatement.setInt(1, employee.getMa_nhan_vien());
            preparedStatement.setString(2, employee.getHo_ten());
            preparedStatement.setString(3, employee.getNgay_sinh());
            preparedStatement.setString(4, employee.getSo_cmnd());
            preparedStatement.setDouble(5, employee.getLuong());
            preparedStatement.setString(6, employee.getSo_dien_thoai());
            preparedStatement.setString(7, employee.getEmail());
            preparedStatement.setString(8, employee.getDia_chi());

            int check = preparedStatement.executeUpdate();

            if (check != 0){
                return true;
            }
        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean deleteEmployee(int id) {
        Connection connection = BaseRepository.getConnection();
        boolean check = false;

        try{
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_EMPLOYEE);
            preparedStatement.setInt(1, id);
            check = preparedStatement.executeUpdate() > 0;
        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return check;
    }

    @Override
    public boolean editEmployee(Employee employee) {
        boolean rowUpdated = false;
        try(Connection connection = BaseRepository.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_EMPLOYEE)){

            preparedStatement.setInt(1, employee.getMa_nhan_vien());
            preparedStatement.setString(2, employee.getHo_ten());
            preparedStatement.setString(3, employee.getNgay_sinh());
            preparedStatement.setString(4, employee.getSo_cmnd());
            preparedStatement.setDouble(5, employee.getLuong());
            preparedStatement.setString(6, employee.getSo_dien_thoai());
            preparedStatement.setString(7, employee.getEmail());
            preparedStatement.setString(8, employee.getDia_chi());

            rowUpdated = preparedStatement.executeUpdate() > 0;
        }catch (SQLException e){
            e.printStackTrace();
        }
        return rowUpdated;
    }

    @Override
    public Employee getEmployeeById(int ma_nhan_vien) {
        Employee employee = null;
        Connection connection = BaseRepository.getConnection();

        try{
            PreparedStatement preparedStatement = connection.prepareStatement(SEARCH_EMPLOYEE_BY_ID);
            preparedStatement.setInt(1, ma_nhan_vien);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                String ho_ten = resultSet.getString("ho_ten");
                String ngay_sinh = resultSet.getString("ngay_sinh");
                String so_cmnd = resultSet.getString("so_cmnd");
                double luong = resultSet.getDouble("luong");
                String so_dien_thoai = resultSet.getString("so_dien_thoai");
                String email = resultSet.getString("email");
                String dia_chi = resultSet.getString("dia_chi");
                employee = new Employee(ma_nhan_vien, ho_ten, ngay_sinh, so_cmnd, luong, so_dien_thoai, email, dia_chi);
            }
        }catch (SQLException e) {
            printSQLException(e);
        }
        return employee;
    }

    @Override
    public List<Employee> search(String ho_ten, String email) {
        List<Employee> employeeList = new ArrayList<>();
        Connection connection = BaseRepository.getConnection();

        try{
            PreparedStatement preparedStatement = connection.prepareStatement(SEARCH_EMPLOYEE);
            preparedStatement.setString(1, "%"+ho_ten+"%");
            preparedStatement.setString(2, "%"+email+"%");

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                int ma_nhan_vien = resultSet.getInt("ma_nhan_vien");
                ho_ten = resultSet.getString("ho_ten");
                String ngay_sinh = resultSet.getString("ngay_sinh");
                String so_cmnd = resultSet.getString("so_cmnd");
                double luong = resultSet.getDouble("luong");
                String so_dien_thoai = resultSet.getString("so_dien_thoai");
                email = resultSet.getString("email");
                String dia_chi = resultSet.getString("dia_chi");

                Employee employee = new Employee(ma_nhan_vien, ho_ten, ngay_sinh, so_cmnd, luong, so_dien_thoai, email, dia_chi);
                employeeList.add(employee);
            }
        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return employeeList;
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
