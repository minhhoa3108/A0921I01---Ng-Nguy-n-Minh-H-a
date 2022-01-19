package session16.thuc_hanh;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileExample {
    public static void main(String[] args) {
        System.out.println("Nhập đường dẫn file: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        ReadFileExample readfileExample = new ReadFileExample();
        readfileExample.readFileText(path);
    }

    public void readFileText(String filepath){
        try {
            File file = new File(filepath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            bufferedReader.close();

            System.out.println("Sum = " + sum);
        } catch (Exception e) {
            System.err.println("Fie không tồn tại hoặc nội dung có lỗi!");
        }
    }
}
