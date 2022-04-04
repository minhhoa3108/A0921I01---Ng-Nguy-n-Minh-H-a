package model.repository;

import model.Employee;

import java.util.List;

public interface EmployeeRepository {
    List<Employee> listAll();
    boolean createEmployee(Employee employee);
    boolean deleteEmployee(int id);
    boolean editEmployee(Employee employee);
}
