package br.com.herbertrausch.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.herbertrausch.spring.mongo.Troca;
import br.com.herbertrausch.spring.mongo.TrocaService;
import br.com.herbertrausch.spring.mongo.Response;

@Path("/troca")
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
public class TrocaResource {
	
	private TrocaService service = new TrocaService();

	@GET
	public List<Troca> get() {
		List<Troca> lista = service.getTrocas();
		return lista;
	}

	@GET
	@Path("/{id}")
	public Troca get(@PathParam("id") String id) {
		Troca e = service.getTroca(id);
		return e;
	}

	@DELETE
	@Path("/{id}")
	public Response delete(@PathParam("id") String id) {
		service.delete(id);
		return Response.Ok("Troca deletada com sucesso");
	}

	@POST
	public Response post(Troca e) {
		service.save(e);
		return Response.Ok("Troca salva com sucesso");
	}

	@PUT
	public Response put(Troca e) {
		service.save(e);
		return Response.Ok("Troca atualizada com sucesso");
	}


}
