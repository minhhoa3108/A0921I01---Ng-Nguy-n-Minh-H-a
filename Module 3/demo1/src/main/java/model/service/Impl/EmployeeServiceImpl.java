package model.service.Impl;

import common.Validation;
import model.Employee;
import model.repository.EmployeeRepository;
import model.repository.Impl.EmployeeRepositoryImpl;
import model.service.EmployeeService;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository = new EmployeeRepositoryImpl();


//    @Override
//    public List<Employee> listEmployee() {
//        return employeeRepository.listAll();
//    }
//
//    @Override
//    public List<String> createEmployee(Employee employee) {
//        List<String> messList = new ArrayList<>();
//        boolean check = true;
//        //check ten
//        if (Validation.checkName(employee.getHo_ten())){
//            messList.add("");
//        }else{
//            check = false;
//            messList.add("Tên không đúng định dạng!");
//        }
//        //check email
//        if (Validation.checkEmail(employee.getEmail())){
//            messList.add("");
//        }else{
//            check = false;
//            messList.add("Email không đúng định dạng!");
//        }
//
//        //check so dien thoai
//        if (Validation.checkPhone(employee.getSo_dien_thoai())){
//            messList.add("");
//        }else{
//            check = false;
//            messList.add("Số điện thoại không đúng định dạng!");
//        }
//
//        if (check){
//            employeeRepository.createEmployee(employee);
//        }
//        return messList;
//    }
//
//    @Override
//    public boolean deleteEmployee(int ma_nhan_vien) {
//        return employeeRepository.deleteEmployee(ma_nhan_vien);
//    }
//
//    @Override
//    public boolean editEmployee(Employee employee) {
//        return employeeRepository.editEmployee(employee);
//    }
//
//    @Override
//    public Employee getEmployeeById(int ma_nhan_vien) {
//        return employeeRepository.getEmployeeById(ma_nhan_vien);
//    }
//
//    @Override
//    public List<Employee> search(String ho_ten, String email) {
//        return employeeRepository.search(ho_ten, email);
//    }
}
