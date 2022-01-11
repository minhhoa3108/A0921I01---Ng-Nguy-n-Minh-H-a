package session12.thuc_hanh.HashMap_LinkedHashMap_TreeMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Smith", 20);
        hashMap.put("David", 27);
        hashMap.put("Macelo", 30);
        hashMap.put("John", 32);
        System.out.println("In những phần tử có trong Map");
        System.out.println(hashMap + "\t");

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("In các mục nhập theo thứ tự tăng dần");
        System.out.println(treeMap + "\t");

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(hashMap);
        linkedHashMap.put("Anderson", 20);
        linkedHashMap.put("Tyson", 25);
        linkedHashMap.put("Mike", 30);
        linkedHashMap.put("Micheal", 21);
        System.out.println("\nthe agr for Mike is " + linkedHashMap.get("Mike"));

    }
}
