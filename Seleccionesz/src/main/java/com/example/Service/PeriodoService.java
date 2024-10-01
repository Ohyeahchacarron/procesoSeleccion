package com.example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entities.Periodo;
import com.example.Repository.PeriodoRepository;

@Service
public class PeriodoService {

	@Autowired
	PeriodoRepository periodoRepositorio;
	
	public List<Periodo> getAllPeriodos(){
		return periodoRepositorio.findAll();
	}
	
	public void update(Periodo periodo) {
		periodoRepositorio.save(periodo);
	}
}
