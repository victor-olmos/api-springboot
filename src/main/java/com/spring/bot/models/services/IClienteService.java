package com.spring.bot.models.services;
import java.util.List;

import com.spring.bot.models.entity.Cliente;
/* interfaz de servicio definida por el framework (crud ) */
public interface IClienteService {

	public List<Cliente> findAll();
	
	public Cliente findById(Long id);
	
	public Cliente save(Cliente cliente);
	
	public void delete(Long id);
}
