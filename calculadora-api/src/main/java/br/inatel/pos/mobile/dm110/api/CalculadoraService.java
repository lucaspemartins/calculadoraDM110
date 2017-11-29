package br.inatel.pos.mobile.dm110.api;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/rest/calc")
public interface CalculadoraService {
	@GET
	@Path("/sum/{first}/{second}")
	@Produces(MediaType.APPLICATION_JSON)
	Result sum(@PathParam("first") Integer first, @PathParam("second") Integer second);
	
	@POST
	@Path("/subtract")
	@Produces(MediaType.APPLICATION_JSON)
	Result subtract(@FormParam("first") Integer first, @FormParam("second") Integer second);
}

