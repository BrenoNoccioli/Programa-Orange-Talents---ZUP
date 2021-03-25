package com.orangeTalents.cadastroVacinacao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orangeTalents.cadastroVacinacao.model.Usuarios;
import com.orangeTalents.cadastroVacinacao.repository.UsuariosRepository;
import com.orangeTalents.cadastroVacinacao.service.UsuariosService;

@RestController //Definimos que nosso controller fornecerá serviços REST, retornando os dados em formato JSON;
@RequestMapping("/usuarios") //Definindo endpoint das requisições deste controller, ou seja, os métodos definidos aqui serão chamados pela url http://localhost:8080/usuarios
@CrossOrigin("*")
public class UsuariosController {
	
	@Autowired
	private UsuariosRepository repository;

	@Autowired
	private UsuariosService service;
	
	//Método post utilizado para inserirmos dados;
	@PostMapping("/cadastrar") //definindo caminho em que nosso método será chamado.
	 public ResponseEntity<Usuarios> postUsuario(@RequestBody Usuarios usuario){ 
		try {
			//Utilizamos um objeto ResponseEntity para manipular o tipo de resposta HTTP que queremos
			//HttpStatus para definirmos o tipo de resposta
			return ResponseEntity.status(HttpStatus.CREATED).body(service.cadastrarUsuario(usuario));
		} catch (Exception e) {
			return new ResponseEntity<Usuarios>(HttpStatus.BAD_REQUEST);
		}
	}	
}
