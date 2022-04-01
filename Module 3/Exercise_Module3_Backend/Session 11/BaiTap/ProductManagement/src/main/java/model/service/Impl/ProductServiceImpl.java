package model.service.Impl;

import model.bean.Product;
import model.service.ProductService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    private static Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "Banana", 23.000, "chuoi", "Viet Nam"));
        products.put(2, new Product(2, "Watermelon", 30.000, "dua hau", "Viet Nam"));
        products.put(3, new Product(3, "Strawberry", 35.000, "Dau", "Mỹ"));
        products.put(4, new Product(4, "lemon", 20.000, "chanh", "Viet Nam"));
        products.put(5, new Product(5, "Apple", 40.000, "Tao", "My"));
    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }
}
