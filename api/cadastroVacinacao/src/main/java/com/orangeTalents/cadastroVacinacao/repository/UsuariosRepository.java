package com.orangeTalents.cadastroVacinacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.orangeTalents.cadastroVacinacao.model.Usuarios;

@Repository //Responsável pelas transações e persistência dos dados no banco de dados.
public interface UsuariosRepository extends JpaRepository<Usuarios, Long> {

}
