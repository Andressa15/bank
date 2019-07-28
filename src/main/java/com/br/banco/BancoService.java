package com.br.banco;

import org.springframework.stereotype.Service;

import com.br.banco.models.Cliente;
import com.br.banco.repositorys.ClienteRepository;

@Service
public class BancoService {

	private ClienteRepository clienteRepository;

	public void salvarCliente(Cliente cliente) {
		clienteRepository.save(cliente);
	}
	public  Iterable<Cliente> pegarTodosCliente(){
		return clienteRepository.findAll();
	}
	public Cliente procurarCliente(Integer id) {
		return clienteRepository.findById(id).get();
	}
}