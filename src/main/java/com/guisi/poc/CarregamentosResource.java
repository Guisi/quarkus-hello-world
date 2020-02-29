package com.guisi.poc;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.guisi.poc.model.Carregamento;
import com.guisi.poc.service.CarregamentoService;

@Path("/carregamentos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CarregamentosResource {
	
	@Inject
	private CarregamentoService carregamentoService;

    @GET
    public List<Carregamento> listarCarregamentos() {
        return this.carregamentoService.listarCarregamentos();
    }
}