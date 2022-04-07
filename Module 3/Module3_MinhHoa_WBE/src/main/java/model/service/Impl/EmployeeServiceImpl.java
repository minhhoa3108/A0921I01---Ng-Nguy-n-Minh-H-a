package model.service.Impl;

import model.Employee;
import model.repository.EmployeeRepository;
import model.repository.Impl.EmployeeRepositoryImpl;
import model.service.EmployeeService;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository = new EmployeeRepositoryImpl();


    @Override
    public List<Employee> listEmployee() {
        return employeeRepository.listAll();
    }

    @Override
    public boolean createEmployee(Employee employee) {
        return employeeRepository.createEmployee(employee);
    }

    @Override
    public boolean deleteEmployee(int ma_nhan_vien) {
        return employeeRepository.deleteEmployee(ma_nhan_vien);
    }

    @Override
    public boolean editEmployee(Employee employee) {
        return employeeRepository.editEmployee(employee);
    }

    @Override
    public Employee getEmployeeById(int ma_nhan_vien) {
        return employeeRepository.getEmployeeById(ma_nhan_vien);
    }

    @Override
    public List<Employee> search(String ho_ten, String email) {
        return employeeRepository.search(ho_ten, email);
    }
}
