package com.br.banco.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.br.banco.models.Cliente;
import com.br.banco.models.Conta;
import com.br.banco.repositorys.ClienteRepository;
import com.br.banco.repositorys.ContaRepository;

public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private ContaRepository contaRepository;

	public Iterable<Cliente> exibirClientes() {
		return clienteRepository.findAll();
	}

	public String cadastrarCliente(Cliente cliente, Conta conta) {
		if(conta.getSaldoCorrente() < 100) {
			return "Saldo insuficiente";
		} else {
			conta.setCliente(cliente);
			contaRepository.save(conta);
			return "Cliente cadastrado";
		}
	}
	public Cliente exibirInfoCliente(Integer id) {
		return clienteRepository.findById(id).get();
	}
	public void deleteClient(Integer id) {
			clienteRepository.deleteById(id);	
	}
}
