package com.mateusnere.reserva;

import com.mateusnere.cliente.Cliente;
import com.mateusnere.cliente.ClienteService;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/reserva")
public class ReservaResource {

    @Inject
    @RestClient
    ClienteService clienteService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Reserva> get() {
        return Reserva.listAll();
    }

    @Transactional
    @POST
    @Path("newReserva")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response newReserva(Reserva reserva) {

        Cliente cliente = clienteService.findById(reserva.idCliente);

        if(cliente.id == 0L) {
            return Response.status(Response.Status.BAD_REQUEST).entity("Cliente não existe").build();
        }

        reserva.id = null;
        reserva.persist();

        return Response.status(Response.Status.CREATED).entity(reserva).build();
    }
}
