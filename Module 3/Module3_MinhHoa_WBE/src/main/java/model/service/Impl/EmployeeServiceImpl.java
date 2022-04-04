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
    public void createEmployee() {

    }

    @Override
    public boolean deleteEmployee(int id) {
        return false;
    }

    @Override
    public boolean editEmployee(Employee employee) {
        return false;
    }
}
