package com.guisi.poc.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.guisi.poc.model.Carregamento;

@ApplicationScoped
public class CarregamentoService {
	
	@Inject
	private EntityManager em;

	public List<Carregamento> listarCarregamentos() {
		TypedQuery<Carregamento> query = em.createQuery("SELECT c FROM Carregamento c ORDER BY c.idCarregamento", Carregamento.class);
		
		return query.getResultList();
	}
}