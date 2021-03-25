package com.orangeTalents.cadastroVacinacao.model;

import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.br.CPF;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity //Definimos nossa classe como uma entidade que servirá de modelo ao banco de dados;
@Table(name="tb_usuarios") //Aqui definimos o nome da tabela a ser criada no banco de dados.
public class Usuarios {
	
	//Definindo atributos e constraints ("restrições") que desejamos adicionar aos campos;
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotEmpty @Size(min=5, max=100)
	private String nome;
	
	@NotEmpty
	@Email
	@Column(unique=true)
	private String email;
	
	@NotEmpty
	@CPF
	@Column(unique=true)
	private String cpf;
	
	@NotEmpty
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date nascimento;
	
	@OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL) //Definindo tipo de relacionamento
	@JsonIgnoreProperties("usuario") 
	private List<VacinasAplicadas> vacinas;

	//Métodos Getters e Setters
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
}
