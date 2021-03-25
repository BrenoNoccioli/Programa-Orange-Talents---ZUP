package com.orangeTalents.cadastroVacinacao.model;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="tb_vacina")
public class VacinasAplicadas {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotEmpty
	private String nomeVacina;
	
	@NotEmpty
	@Email
	private String emailUsuario;
	
	private Date dataAplicacao = new Date(); //Atribuindo valor de data atual como padrão;
	
	@ManyToOne
	@JsonIgnoreProperties("vacinas")
	private Usuarios usuario;
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomeVacina() {
		return nomeVacina;
	}

	public void setNomeVacina(String nomeVacina) {
		this.nomeVacina = nomeVacina;
	}

	public String getEmailUsuario() {
		return emailUsuario;
	}

	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}

	public Date getDataAplicacao() {
		return dataAplicacao;
	}

	public void setDataAplicacao(Date dataAplicacao) {
		this.dataAplicacao = dataAplicacao;
	}
	
	
}
