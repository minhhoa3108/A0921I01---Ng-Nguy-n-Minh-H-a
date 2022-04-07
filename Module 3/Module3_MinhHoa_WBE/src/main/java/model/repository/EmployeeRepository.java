package model.repository;

import model.Employee;

import java.util.List;

public interface EmployeeRepository {
    List<Employee> listAll();
    boolean createEmployee(Employee employee);
    boolean deleteEmployee(int ma_nhan_vien);
    boolean editEmployee(Employee employee);
    Employee getEmployeeById(int ma_nhan_vien);

    List<Employee> search(String ho_ten, String email);
}
