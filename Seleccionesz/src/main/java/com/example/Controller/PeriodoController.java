package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entities.Periodo;
import com.example.Service.PeriodoService;

@RestController
@RequestMapping(path= "api/periodo")
public class PeriodoController {
	
	@Autowired
	private PeriodoService periodoService;
	
	@GetMapping
	public List<Periodo> getAll(){
		return periodoService.getAllPeriodos();
	}
	
	@PostMapping
	public void update(@RequestBody Periodo periodo){
	 periodoService.update(periodo);
	}

}
