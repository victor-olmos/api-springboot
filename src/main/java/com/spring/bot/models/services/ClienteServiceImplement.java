package com.spring.bot.models.services;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.bot.models.dao.IClienteDao;
import com.spring.bot.models.entity.Cliente;


/* Servicio que consulta al modelo (DAO)*/
@Service
public class ClienteServiceImplement implements IClienteService{

	@Autowired
	/* usa */
	private IClienteDao clienteDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Cliente> findAll() {
		return (List<Cliente>) clienteDao.findAll();
	}
	
	@Transactional(readOnly = true)
	@Override
	public Cliente findById(Long id) {
		return clienteDao.findById(id).orElse(null);
	}
	
	@Transactional
	@Override
	public Cliente save(Cliente cliente) {
		return clienteDao.save(cliente);
	}
	
	@Transactional
	@Override
	public void delete(Long id) {
		clienteDao.deleteById(id);
		
	}

	

	

}
