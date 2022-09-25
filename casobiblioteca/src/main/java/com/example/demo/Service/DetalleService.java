package com.example.demo.Service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.Operaciones;
import com.example.demo.DaoImpl.DetalleDaoImpl;
import com.example.demo.Entity.Detalle;
@Service
public class DetalleService implements Operaciones<Detalle>{
	@Autowired
	private DetalleDaoImpl DaoIml;

	@Override
	public int create(Detalle t) {
		// TODO Auto-generated method stub
		return DaoIml.create(t);
	}

	@Override
	public int update(Detalle t, int id) {
		// TODO Auto-generated method stub
		return DaoIml.update(t, id);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return DaoIml.delete(id);
	}

	@Override
	public Detalle read(int id) {
		// TODO Auto-generated method stub
		return DaoIml.read(id);
	}

	@Override
	public List<Detalle> reaAll() {
		// TODO Auto-generated method stub
		return DaoIml.reaAll();
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return DaoIml.readAll2();
	}

}
