package com.example.demo.DaoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.demo.Dao.Operaciones;
import com.example.demo.Entity.Detalle;
@Component
public class DetalleDaoImpl implements Operaciones<Detalle>{
	
   @Autowired
   private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Detalle t) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("INSERT INTO detalle (idprestamo, idlibro) VALUES (?,?)",
				new Object[] {t.getIdprestamo(), t.getIdlibro()});
	}

	@Override
	public int update(Detalle t, int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("UPDATE detalle SET idprestamo=?, idlibro=? where iddetalle=?",
				new Object[] {t.getIdprestamo(), t.getIdlibro(), id});
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("DELETE FROM detalle WHERE iddetalle=?", id);
	}

	@Override
	public Detalle read(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForObject("SELECT * FROM DETALLE WHERE iddetalle=?",
				new BeanPropertyRowMapper<Detalle>(Detalle.class), id);
	}

	@Override
	public List<Detalle> reaAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("SELECT * FROM DETALLE",
				new BeanPropertyRowMapper<Detalle>(Detalle.class));
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForList("SELECT  CONCAT(A.nombre, \" \",A.apellidos) as \"NOMBRE\", A.codigo as \"CODIGO\" , L.nombre as \"LIBRO\",\r\n"
				+ "L.autor AS \"AUTOR\", L.editorial AS \"EDITORIAL\", E.estado as \"ESTADO\" FROM detalle D\r\n"
				+ "inner join prestamo P on D.idprestamo = P.idprestamo\r\n"
				+ "inner join libro L on D.idlibro = L.idlibro\r\n"
				+ "inner join empleado E on P.idempleado = E.idempleado\r\n"
				+ "inner join alumno A on P.idalumno = A.idalumno");
	}
	

}
