package com.br.banco.repositorys;

import org.springframework.data.repository.CrudRepository;

import com.br.banco.models.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Integer>{

}
