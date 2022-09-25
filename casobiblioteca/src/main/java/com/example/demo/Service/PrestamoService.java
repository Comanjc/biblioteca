package com.example.demo.Service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.Operaciones;
import com.example.demo.DaoImpl.PrestamoDaoImpl;
import com.example.demo.Entity.Prestamo;
@Service
public class PrestamoService implements Operaciones<Prestamo>{
	
	@Autowired
	private PrestamoDaoImpl DaoIml;

	@Override
	public int create(Prestamo t) {
		// TODO Auto-generated method stub
		return DaoIml.create(t);
	}

	@Override
	public int update(Prestamo t, int id) {
		// TODO Auto-generated method stub
		return DaoIml.update(t, id);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return DaoIml.delete(id);
	}

	@Override
	public Prestamo read(int id) {
		// TODO Auto-generated method stub
		return DaoIml.read(id);
	}

	@Override
	public List<Prestamo> reaAll() {
		// TODO Auto-generated method stub
		return DaoIml.reaAll();
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
