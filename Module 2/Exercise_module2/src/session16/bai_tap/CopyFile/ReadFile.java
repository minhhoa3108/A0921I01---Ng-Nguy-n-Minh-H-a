package session16.bai_tap.CopyFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static void main(String[] args) {
        ReadFile readFile = new ReadFile();
        List<String> list = readFile.readFileText("C:\\Codegym\\Module 2\\Exercise_module2\\src\\session16\\bai_tap\\CopyFile\\File.txt");
        int count = readFile.displayNumberCharacter(list);
        readFile.writeFile("C:\\Codegym\\Module 2\\Exercise_module2\\src\\session16\\bai_tap\\CopyFile\\FileCopy.txt", list, count);
    }

    public List<String> readFileText(String path){
        List<String> list = new ArrayList<>();
        try {
            File file = new File(path);

            if (!file.exists()){
                throw new FileNotFoundException();
            }

            BufferedReader bufferedWriter = new BufferedReader(new FileReader(file));
            String line = "";
            int count = 0;
            while ((line = bufferedWriter.readLine()) != null){
                list.add(String.valueOf(line));
                count++;
            }

        }catch (Exception e){
            System.err.println("File không tồn tại or bị lỗi");
        }

        return list;
    }

    public int displayNumberCharacter(List<String> list){
        int count = list.size();
        return count;
    }

    public void writeFile(String path, List<String> list, int count){
        try {
            FileWriter fileWriter = new FileWriter(path);
            fileWriter.write("Dữ liệu được copy là: \n" + list);
            fileWriter.write("Số ký tự có trong tệp là: " + count);
            fileWriter.close();
        }catch (Exception e){
            System.err.println("File bị lỗi");
        }
    }
}
