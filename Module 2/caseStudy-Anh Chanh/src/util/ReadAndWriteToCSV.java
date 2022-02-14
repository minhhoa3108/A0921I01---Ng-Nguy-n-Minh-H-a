package util;

import models.Customer;
import models.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteToCSV {
    public static void writeCustomerListToCSV(String pathFile, List<Customer> customerList, boolean append) {
        File file = new File(pathFile);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file,append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Customer customer: customerList) {
                bufferedWriter.write(customer.getInfoToCVS());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println("lỗi ghi file");
        }finally {
            try {
                if (bufferedWriter!=null){
                    bufferedWriter.close();
                    fileWriter.close();
                }
            } catch (IOException e) {
                System.out.println("lỗi do đóng khi đối tượng bị null");
            }
        }
    }
    public static List<Customer> readCustomerListFormCSV(String pathFile){
        List<Customer> customerList = new ArrayList<>();
        File file = new File(pathFile);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line="";
            String[] array =null;
            while ((line= bufferedReader.readLine())!=null){
                array= line.split(",");
                Customer customer = new Customer(Integer.parseInt(array[0]),array[1],array[2],array[3],array[4]);
                customerList.add(customer);
            }

        } catch (IOException e) {
            System.out.println("lỗi ghi file");
        }finally {
            try {
                if (bufferedReader!=null){
                    bufferedReader.close();
                    fileReader.close();
                }
            } catch (IOException e) {
                System.out.println("lỗi do đóng khi đối tượng bị null");
            }
        }
        return customerList;
    }
    public static void writeCustomerListToCSV1(String pathFile, List<Customer> customerList, boolean append){
        List<String> stringList = new ArrayList<>();
        for (Customer customer: customerList) {
            stringList.add(customer.getInfoToCVS());
        }
        writeStringListToCSV(pathFile,stringList,append);
    }
    // thêm cho employee.
    public static void writeEmployeeListToCSV(String pathFile, List<Employee> employeeList, boolean append){
        List<String> stringList = new ArrayList<>();
        for (Employee employee: employeeList) {
            stringList.add(employee.toString());
        }
        writeStringListToCSV(pathFile,stringList,append);

    }
   // ghi 1 list string vào file csv dùng chung cho các dối tượng
    private static void writeStringListToCSV(String pathFile, List<String> stringList, boolean append) {
        File file = new File(pathFile);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file,append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (String string: stringList) {
                bufferedWriter.write(string);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println("lỗi ghi file");
        }finally {
            try {
                if (bufferedWriter!=null){
                    bufferedWriter.close();
                    fileWriter.close();
                }
            } catch (IOException e) {
                System.out.println("lỗi do đóng khi đối tượng bị null");
            }
        }
    }
}
