package com.br.banco.models;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;

@Entity
public class Conta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue ( strategy = GenerationType.IDENTITY)
	private Integer id;

	@NotBlank(message = "Conta Corrente nao pode ficar em branco")
	@DecimalMin(value = "100.0", message = "Nome tem que ter no minimo 2 letras")
	private double contaCorrente;

	@NotBlank(message = "Conta poupança nao pode ficar em branco")
	@DecimalMin(value = "100.0", message = "Nome tem que ter no minimo 2 letras")
	private double contaPoupanca;

	@OneToOne(cascade = {CascadeType.ALL})
    private Cliente cliente;
	
	public Conta() {
		super();
	}
	public Conta(
			@Valid @NotBlank(message = "Conta Corrente nao pode ficar em branco") @DecimalMin(value = "100.0", message = "Nome tem que ter no minimo 2 letras") double contaCorrente,
			@NotBlank(message = "Conta poupança nao pode ficar em branco") @DecimalMin(value = "100.0", message = "Nome tem que ter no minimo 2 letras") double contaPoupanca,
			Cliente cliente) {
		super();
		this.contaCorrente = contaCorrente;
		this.contaPoupanca = contaPoupanca;
		this.cliente = cliente;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	public double getContaCorrente() {
		return contaCorrente;
	}

	public void setContaCorrente(double contaCorrente) {
		this.contaCorrente = contaCorrente;
	}
	public double getContaPoupanca() {
		return contaPoupanca;
	}

	public void setContaPoupanca(double contaPoupanca) {
		this.contaPoupanca = contaPoupanca;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public double getSaldoCorrente() {
		return contaCorrente;
	}
}