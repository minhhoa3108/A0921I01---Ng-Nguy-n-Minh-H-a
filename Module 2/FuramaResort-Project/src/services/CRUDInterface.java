package services;

import java.util.List;

public interface CRUDInterface<T> {
    void add(T t);
    void delete(T t, int id);
    void update(T t, int id);
    List<T> getAll();
}
