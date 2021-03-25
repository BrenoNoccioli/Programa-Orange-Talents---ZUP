package com.orangeTalents.cadastroVacinacao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orangeTalents.cadastroVacinacao.model.Usuarios;
import com.orangeTalents.cadastroVacinacao.repository.UsuariosRepository;

@Service //Responsável pelas regras de négocio da nossa aplicação;
public class UsuariosService {
	
	@Autowired //Injeção de dependência do nosso repository.
	private UsuariosRepository repository;
	
	public Usuarios cadastrarUsuario(Usuarios usuario) {
		return this.repository.save(usuario);
	}	
}
