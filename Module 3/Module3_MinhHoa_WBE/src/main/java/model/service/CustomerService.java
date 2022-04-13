package model.service;

import model.Customer;

import java.util.List;

public interface CustomerService {
    public List<Customer> listAll();

    public List<String> createCustomer(Customer customer);

    public boolean deleteCustomer(int ma_khach_hang);

    public boolean editCustomer(Customer customer);

    Customer getCustomerById(int ma_khach_hang);

    List<Customer> search(String ho_ten, String email);
}
