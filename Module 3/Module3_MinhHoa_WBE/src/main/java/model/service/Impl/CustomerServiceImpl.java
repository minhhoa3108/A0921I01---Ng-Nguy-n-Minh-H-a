package model.service.Impl;

import common.Validation;
import model.Customer;
import model.repository.CustomerRepository;
import model.repository.Impl.CustomerRepositoryImpl;
import model.service.CustomerService;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    CustomerRepository customerRepository = new CustomerRepositoryImpl();

    @Override
    public List<Customer> listAll() {
        return customerRepository.listAll();
    }

    @Override
    public List<String> createCustomer(Customer customer) {
        List<String> messList = new ArrayList<>();
        boolean check = true;
        //check ten
        if (Validation.checkName(customer.getHo_ten())){
            messList.add("");
        }else{
            check = false;
            messList.add("Tên không đúng định dạng!");
        }
        //check email
        if (Validation.checkEmail(customer.getEmail())){
            messList.add("");
        }else{
            check = false;
            messList.add("Email không đúng định dạng!");
        }

        //check so dien thoai
        if (Validation.checkPhone(customer.getSo_dien_thoai())){
            messList.add("");
        }else{
            check = false;
            messList.add("Số điện thoại không đúng định dạng!");
        }

        if (check){
            customerRepository.createCustomer(customer);
        }
        return messList;
    }

    @Override
    public boolean deleteCustomer(int ma_khach_hang) {
        return customerRepository.deleteCustomer(ma_khach_hang);
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
        return customerRepository.search(ho_ten, email);
    }
}
