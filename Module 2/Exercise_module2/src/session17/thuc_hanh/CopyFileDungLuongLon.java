package session17.thuc_hanh;

import java.io.*;
import java.util.Scanner;

public class CopyFileDungLuongLon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập địa chỉ file nguồn: ");
        String sourcePath = sc.nextLine();
        System.out.println("Nhập địa chỉ file copy: ");
        String copyPath = sc.nextLine();
        
        File sourceFile = new File(sourcePath);
        File copyFile = new File(copyPath);

        try {
            copyFileUsingStream(sourceFile, copyFile);
            System.out.println("Copy thành công");
        }catch (Exception e){
            System.out.println("Không thể copy file");
            System.out.println(e.getMessage());
        }
    }

    private static void copyFileUsingStream(File source, File copy){
        InputStream inputStream = null;
        OutputStream outputStream = null;

        try{
            inputStream = new FileInputStream(source);
            outputStream = new FileOutputStream(copy);

            byte[] buffer = new byte[1024];
            int length;

            while ((length = inputStream.read(buffer)) > 0){
                outputStream.write(buffer, 0, length);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
