package session12.bai_tap.Product;

import java.util.List;
import java.util.Scanner;

public class Product {
    private int id;
    private String name;

    public Product(){

    }

    public Product(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString(){
        return "Id: " + id + ", name: " + name;
    }
}
