package com.spring.bot.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.spring.bot.models.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long> {

}
