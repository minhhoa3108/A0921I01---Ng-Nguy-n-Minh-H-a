package model.repository.Impl;

import model.Customer;
import model.repository.BaseRepository;
import model.repository.CustomerRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepository {
    private static final String LIST_ALL_CUSTOMER = "select * from khach_hang;";
    private static final String ADD_NEW_CUSTOMER = "insert into khach_hang(ma_khach_hang, ho_ten, ngay_sinh, so_cmnd, so_dien_thoai, email, dia_chi)values(?, ?, ?, ?, ?, ?, ?);";
    private static final String DELETE_EMPLOYEE = "delete from khach_hang where khach_hang.ma_khach_hang = ?;";
    private static final String SEARCH_CUSTOMER = "SELECT * FROM khach_hang where ho_ten like ? and email like ?;";


    @Override
    public List<Customer> listAll() {
        List<Customer> customerList = new ArrayList<>();

        try(Connection connection = BaseRepository.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(LIST_ALL_CUSTOMER)){

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int ma_khach_hang = resultSet.getInt("ma_khach_hang");
                String ho_ten = resultSet.getString("ho_ten");
                String ngay_sinh = resultSet.getString("ngay_sinh");
                String so_cmnd = resultSet.getString("so_cmnd");
                String so_dien_thoai = resultSet.getString("so_dien_thoai");
                String email = resultSet.getString("email");
                String dia_chi = resultSet.getString("dia_chi");

                Customer customer = new Customer(ma_khach_hang, ho_ten, ngay_sinh, so_cmnd, so_dien_thoai, email, dia_chi);
                customerList.add(customer);
            }
        }catch (SQLException e) {
            printSQLException(e);
        }
        return customerList;
    }

    @Override
    public boolean createCustomer(Customer customer) {
        Connection connection = BaseRepository.getConnection();

        try{
            PreparedStatement preparedStatement = connection.prepareStatement(ADD_NEW_CUSTOMER);
            preparedStatement.setInt(1, customer.getMa_khach_hang());
            preparedStatement.setString(2, customer.getHo_ten());
            preparedStatement.setString(3, customer.getNgay_sinh());
            preparedStatement.setString(4, customer.getSo_cmnd());
            preparedStatement.setString(5, customer.getSo_dien_thoai());
            preparedStatement.setString(6, customer.getEmail());
            preparedStatement.setString(7, customer.getDia_chi());

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
    public boolean deleteCustomer(int ma_khach_hang) {
        Connection connection = BaseRepository.getConnection();
        boolean check = false;

        try{
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_EMPLOYEE);
            preparedStatement.setInt(1, ma_khach_hang);
            check = preparedStatement.executeUpdate() > 0;
        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return check;
    }

    @Override
    public boolean editCustomer(Customer customer) {
        return false;
    }

    @Override
    public Customer getCustomerById(int ma_khach_hang) {
        return null;
    }

    @Override
    public List<Customer> search(String ho_ten, String email) {
        List<Customer> customerList = new ArrayList<>();

        Connection connection = BaseRepository.getConnection();
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(SEARCH_CUSTOMER);
            preparedStatement.setString(1, "%"+ho_ten+"%");
            preparedStatement.setString(2, "%"+email+"%");

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                int ma_khach_hang = resultSet.getInt("ma_khach_hang");
                ho_ten = resultSet.getString("ho_ten");
                String ngay_sinh = resultSet.getString("ngay_sinh");
                String so_cmnd = resultSet.getString("so_cmnd");
                String so_dien_thoai = resultSet.getString("so_dien_thoai");
                email = resultSet.getString("email");
                String dia_chi = resultSet.getString("dia_chi");

                Customer customer = new Customer(ma_khach_hang, ho_ten, ngay_sinh, so_cmnd, so_dien_thoai, email, dia_chi);
                customerList.add(customer);
            }
        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return customerList;
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
