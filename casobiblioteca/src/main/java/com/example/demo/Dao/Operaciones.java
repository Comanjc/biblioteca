package com.example.demo.Dao;

import java.util.List;
import java.util.Map;

public interface Operaciones <T>{
	
	int create(T t);
	int update(T t, int id);
	int delete(int id);
	T read(int id);
	List<T> reaAll();
	List<Map<String,Object>> readAll2();

}
