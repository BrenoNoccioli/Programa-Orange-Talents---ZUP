package com.orangeTalents.cadastroVacinacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.orangeTalents.cadastroVacinacao.model.VacinasAplicadas;

@Repository
public interface VacinasRepository extends JpaRepository<VacinasAplicadas, Long>{
	
}
