package model;

import java.util.Date;

public class Employee {
    private int id;
    private String name;
    private Date birthday;
    private double salary;
    private String phone;
    private String email;

    public Employee() {}

    public Employee(int id, String name, Date birthday, double salary, String phone, String email) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.salary = salary;
        this.phone = phone;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
