package CuoiKyModule2.utils;

import CuoiKyModule2.Model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteToCSV {
    private static void writeStringListToCSV(String pathFile, List<String> stringList, boolean append){
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

    public static void writeStudentToCSV(String pathFile, List<Student> studentList, boolean append){
        List<String> stringList = new ArrayList<>();
        for (Student student: studentList) {
            stringList.add(student.getInfoToCSV());
        }
        writeStringListToCSV(pathFile,stringList,append);
    }

    public static List<Student> readStudentListFormCSV(String pathFile){
        List<Student> studentList = new ArrayList<>();
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
                Student student = new Student(Integer.parseInt(array[0]),array[1],array[2],array[3],
                        array[4], array[5]);
                studentList.add(student);
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
        return studentList;
    }
}
