package services.impl;

import models.Customer;
import services.ICustomerService;
import util.ReadAndWriteToCSV;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements ICustomerService {
    private final String CUSTOMER_PAHT_FILE ="src\\data\\Customer.csv";
    Scanner scanner = new Scanner(System.in);

    @Override
    public void add() {
        System.out.println("nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập mã số");
        String maSo = scanner.nextLine();
        System.out.println("nhập tên");
        String name = scanner.nextLine();
        System.out.println("nhập ngày sinh");
        String birthday = scanner.nextLine();
        System.out.println("Nhập tên loại khách");
        String customerType= scanner.nextLine();
        Customer  customer = new Customer(id,maSo,name,birthday,customerType);
        List<Customer> customerList = new ArrayList<>();
        customerList.add(customer);
        // lưu vào file csv
        ReadAndWriteToCSV.writeCustomerListToCSV1(CUSTOMER_PAHT_FILE,customerList,true);

    }

    @Override
    public void edit() {

    }

    @Override
    public void display() {
      List<Customer> customerList = ReadAndWriteToCSV.readCustomerListFormCSV(CUSTOMER_PAHT_FILE);
        for (int i = 0; i <customerList.size() ; i++) {
            System.out.println((i+1)+"." + customerList.get(i));
        }
    }

    @Override
    public void delete() {
        List<Customer> customerList = ReadAndWriteToCSV.readCustomerListFormCSV(CUSTOMER_PAHT_FILE);
        display();
        System.out.println("Chọn customer cần xóa");
        int chooseDelete = Integer.parseInt(scanner.nextLine());
        customerList.remove(chooseDelete-1);
        ReadAndWriteToCSV.writeCustomerListToCSV(CUSTOMER_PAHT_FILE,customerList,false);

    }

    @Override
    public void searchByName() {
        List<Customer> customerList = ReadAndWriteToCSV.readCustomerListFormCSV(CUSTOMER_PAHT_FILE);
        System.out.println("Nhập tền cần tim kiếm");
        String searchName = scanner.nextLine();
        for (Customer customer: customerList) {
            if (customer.getName().contains(searchName)){
                System.out.println(customer);
            }
        }

    }

}
