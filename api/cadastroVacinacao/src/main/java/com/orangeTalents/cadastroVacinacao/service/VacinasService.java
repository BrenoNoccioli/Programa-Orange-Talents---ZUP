package com.orangeTalents.cadastroVacinacao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orangeTalents.cadastroVacinacao.model.VacinasAplicadas;
import com.orangeTalents.cadastroVacinacao.repository.VacinasRepository;

@Service
public class VacinasService {

	@Autowired
	private VacinasRepository repository;
	
	public VacinasAplicadas cadastrarAplicacao(VacinasAplicadas vacina) {
		return this.repository.save(vacina);
	}
}
