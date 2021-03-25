package com.orangeTalents.cadastroVacinacao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orangeTalents.cadastroVacinacao.model.VacinasAplicadas;
import com.orangeTalents.cadastroVacinacao.repository.VacinasRepository;
import com.orangeTalents.cadastroVacinacao.service.VacinasService;

@RestController
@RequestMapping("/vacinas")
@CrossOrigin("*")
public class VacinasController {
	
	private VacinasRepository repository;

	@Autowired
	private VacinasService service;
	
	
	@PostMapping("/cadastrar")
	public ResponseEntity<VacinasAplicadas> postVacinas(@RequestBody VacinasAplicadas aplicacao){
		try {
			return ResponseEntity.status(HttpStatus.CREATED).body(service.cadastrarAplicacao(aplicacao));
			
		} catch(Exception e) {
			return new ResponseEntity<VacinasAplicadas>(HttpStatus.BAD_REQUEST);
		}
	}
}
