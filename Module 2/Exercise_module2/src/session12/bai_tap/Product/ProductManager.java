package session12.bai_tap.Product;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<Product>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập l");
        products.add(new Product(1, "orange"));
        products.add(new Product(2, "apple"));
        products.add(new Product(3, "banana"));
        products.add(new Product(4, "strawberry"));

        System.out.println("Các phẩn tử trong danh sách");
        products.forEach(product -> System.out.println(product));
        System.out.println("---------------------------");

        products.remove(3);
        System.out.println("Các phần tử trong danh sách (đã xóa 1 phần tử):");
        products.forEach(product -> System.out.println(product));
        System.out.println("---------------------------");

        String Name = "Minh Hòa";
        products.get(0).setName(Name);
        System.out.println("Danh sách sau khi sửa tên phần tử 0");
        products.forEach(product -> System.out.println(product));
        System.out.println("---------------------------");


    }

}
