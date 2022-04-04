package model.service;

import model.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> listEmployee();

    void createEmployee();

    public boolean deleteEmployee(int id);

    public boolean editEmployee(Employee employee);
}
