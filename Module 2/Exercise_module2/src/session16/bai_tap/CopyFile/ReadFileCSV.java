package session16.bai_tap.CopyFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFileCSV {
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;

        try {
            String line;
            bufferedReader = new BufferedReader(new FileReader("C:\\Codegym\\Module 2\\Exercise_module2\\src\\session16\\bai_tap\\CopyFile\\file.csv"));

            while ((line = bufferedReader.readLine()) != null){
                printFile(parseCsvLine(line));
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if(bufferedReader != null){
                    bufferedReader.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }

    }

    public static List<String> parseCsvLine(String line){
        List<String> list = new ArrayList<>();
        if (line != null){
            String[] data = line.split(",");
            for (int i = 0; i < data.length; i++){
                list.add(data[i]);
            }
        }
        return list;
    }

    public static void printFile(List<String> list){
        System.out.println(
                "Country[ id = " + list.get(0) +
                        ", code = " + list.get(1) +
                        ", name = " + list.get(2) +
                        "]"
        );
    }
}
