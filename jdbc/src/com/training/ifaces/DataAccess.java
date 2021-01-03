package com.training.ifaces;

import java.util.List;

import com.training.entity.Doctor;

public interface DataAccess<T>{
	public int add(T t);
	public List<T> findAll();
	public int update(T existing,T update);
public int remove(int id);
public T findById(int id);
public int[] addInBatch(Doctor ...list);
}
