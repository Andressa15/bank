package com.br.banco.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
@Entity
public class Cliente implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotBlank(message = "Nome nao pode ficar em branco")
	@Size(min = 2, message = "Nome tem que ter no minimo 2 letras")
	private String nome;

	@NotBlank(message = "CPF nao pode ficar em branco")
	@Size(min = 11,max= 11, message = "Nome tem que ter no minimo 2 letras")
	private String cpf ;

	@NotBlank(message = "Numero nao pode ficar em branco")
	@Size(min = 9, message = "Numero tem que ter no minimo 9 numeros")
	private String numTelefone;
	
	@OneToOne(mappedBy = "cliente")
	 private List<Conta> tipoDeConta = new ArrayList<Conta>();

	public Cliente() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public  String setCpf() {
		return cpf ;
	}

	public void setTipoDeConta(List<Conta> tipoDeConta) {
		this.tipoDeConta = tipoDeConta;
	}
}
