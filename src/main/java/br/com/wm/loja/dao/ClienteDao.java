package br.com.wm.loja.dao;

import javax.persistence.EntityManager;

import br.com.wm.loja.modelo.Cliente;

public class ClienteDao {

	private EntityManager em;

	public ClienteDao(EntityManager em) {
		this.em = em;
	}

	public void cadastrar(Cliente cliente) {
		this.em.persist(cliente);
	}
	
	public Cliente buscarPorId(Long id) {
		return em.find(Cliente.class, id);
	}

}
