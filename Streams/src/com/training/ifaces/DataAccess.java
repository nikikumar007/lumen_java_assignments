package com.training.ifaces;
import java.util.List;
public interface DataAccess<T> {
public void add(T ...t);
public T findByID(int id);
public List<T> findAll();
List<T> sortedList(String sortBy);
}
