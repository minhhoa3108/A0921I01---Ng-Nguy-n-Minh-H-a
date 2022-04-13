package model.repository;

import model.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> listAll();
    boolean createCustomer(Customer customer);
    boolean deleteCustomer(int ma_khach_hang);
    boolean editCustomer(Customer customer);
    Customer getCustomerById(int ma_khach_hang);

    List<Customer> search(String ho_ten, String email);
}
