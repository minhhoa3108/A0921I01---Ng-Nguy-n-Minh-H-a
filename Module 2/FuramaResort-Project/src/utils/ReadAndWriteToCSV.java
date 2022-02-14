package utils;

import models.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteToCSV {
//    public static void writeEmployeeListToCSV(String pathFile, List<Employee> employeeList, boolean append) {
//        File file = new File(pathFile);
//        FileWriter fileWriter = null;
//        BufferedWriter bufferedWriter = null;
//        try {
//            fileWriter = new FileWriter(file,append);
//            bufferedWriter = new BufferedWriter(fileWriter);
//            for (Employee employee: employeeList) {
//                bufferedWriter.write(employee.getInfoToCSV());
//                bufferedWriter.newLine();
//            }
//        } catch (IOException e) {
//            System.out.println("lỗi ghi file");
//        }finally {
//            try {
//                if (bufferedWriter!=null){
//                    bufferedWriter.close();
//                    fileWriter.close();
//                }
//            } catch (IOException e) {
//                System.out.println("lỗi do đóng khi đối tượng bị null");
//            }
//        }
//    }

    public static List<Employee> readEmployeeListFormCSV(String pathFile){
        List<Employee> employeeList = new ArrayList<>();
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
                Employee employee = new Employee(Integer.parseInt(array[0]),array[1],array[2],array[3],array[4], array[5],
                        array[6], array[7], array[8], array[9]);
                employeeList.add(employee);
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
        return employeeList;
    }


    public static void writeEmployeeListToCSV1(String pathFile, List<Employee> employeeList, boolean append){
        List<String> stringList = new ArrayList<>();
        for (Employee employee: employeeList) {
            stringList.add(employee.getInfoToCSV());
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
