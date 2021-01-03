package com.training.ifaces;


import java.util.List;

import com.training.entity.Contacts;

public interface DataAccess<T>{
	public int add(T t);
	public List<T> findAll();
	public boolean findById(int id);
public int remove(String phoneNumber);
int update(T ex, T update);

//public int[] addInBatch(Doctor ...list);
}
