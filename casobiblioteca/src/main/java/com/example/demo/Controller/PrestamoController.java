package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Prestamo;
import com.example.demo.Service.PrestamoService;

@RestController
@RequestMapping("/api/prestamo")
public class PrestamoController {
	
	@Autowired
	private PrestamoService prestamoService;
	
	@GetMapping("/all")
	public List<Prestamo> readAll(){
		return prestamoService.reaAll();
	}
	@GetMapping("/read/{id}")
	public Prestamo read(@PathVariable int id) {
		return prestamoService.read(id);
	}
	@PostMapping("/add")
	public String save(@RequestBody Prestamo prestamo) {
		return prestamoService.create(prestamo) + "Registro Correctamente";
	}
	@PutMapping("update/{id}")
	public String update(@RequestBody Prestamo prestamo, @PathVariable int id) {
		return prestamoService.update(prestamo, id) + "Registro Modificado Correctamente";
	}
	@DeleteMapping("/del/{id}")
	public String save(@PathVariable int id) {
		return prestamoService.delete(id) + "Registro Eliminado Correctamente" ;
	}

	

}
