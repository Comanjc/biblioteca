package com.example.demo.Controller;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Detalle;
import com.example.demo.Service.DetalleService;

@RestController
@RequestMapping("/api/detalle")
public class DetalleController {
	
	@Autowired
	private DetalleService detalleService;
	
	@GetMapping("/all")
	public List<Detalle> realAll(){
		return detalleService.reaAll();
	}
	@GetMapping("/all2")
	public List<Map<String, Object>> readAll2(){
		return detalleService.readAll2();
	}
	
	@GetMapping("/read/{id}")
	public Detalle read(@PathVariable int id) {
		return detalleService.read(id);
	}
	
	@PostMapping("/save")
	public String save(@RequestBody Detalle detalle) {
		return detalleService.create(detalle) + "Registro Correctamente";
	}
	@PutMapping("/update/{id}")
	public String update(@RequestBody Detalle detalle, @PathVariable int id) {
		return detalleService.update(detalle, id) + "Registro Modificado Correctamente";
	}
	@DeleteMapping("/del/{id}")
	public String save(@PathVariable int id) {
		return detalleService.delete(id)+ "Registro Eliminado Correctamente";
	}
	
	}
	

