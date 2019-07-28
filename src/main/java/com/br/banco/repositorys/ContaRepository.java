package com.br.banco.repositorys;

import org.springframework.data.repository.CrudRepository;

import com.br.banco.models.Conta;

public interface ContaRepository extends CrudRepository<Conta, Integer>{

}
