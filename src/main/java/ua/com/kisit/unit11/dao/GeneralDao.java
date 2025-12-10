package ua.com.kisit.unit11.dao;

import java.util.List;

public interface GeneralDao<T> {

    void save(T t);
    void update(T t);
    void delete(T t);
    T findById(Long id);
    List<T> findAll();

}
