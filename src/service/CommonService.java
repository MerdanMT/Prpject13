package service;

import java.util.List;

public interface CommonService <T>{
    void create(T t);
    void read(int id);
    void update(int id, T t);
    void delete(int id);
    List<T> getAll();
}
