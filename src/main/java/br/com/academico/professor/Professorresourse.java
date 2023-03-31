package br.com.academico.professor;

import java.util.ArrayList;
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
import javax.ws.rs.core.Response;

@Path("/professores")
public class Professorresourse {
    private Professor professor;
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response recuperar(){

        List<Professor> listaEnderecos = new ArrayList<Professor>();
        listaEnderecos.add( new Professor(5000, 150));
        listaEnderecos.add( new Professor(3000, 120));

        return Response.ok(listaEnderecos, MediaType.APPLICATION_JSON).build();
    }



    @GET
    @Path("{id}")
    public Response recuperar(@PathParam("id") int id){

        professor = new Professor(5000, 150);
        professor.setId(id);
        return Response.ok(professor, MediaType.APPLICATION_JSON).build();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response criar(Professor professor){
        professor.setId(200);
        return Response
            .status(Response.Status.CREATED)
            .entity(professor)
            .build();
    }

    @PUT
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response atualizar(@PathParam("id") int id, Professor professor){
        return Response
            .status(Response.Status.NO_CONTENT)
            .build();
    }

    @DELETE
    @Path("{id}")
    public Response deletar(@PathParam("id") int id){
            return Response
                .status(Response.Status.NO_CONTENT)
                .build();
        }
}