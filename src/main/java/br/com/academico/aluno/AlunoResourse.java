package br.com.academico.aluno;

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


@Path("/alunos")
public class AlunoResourse {
    private Aluno aluno;
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response recuperar(){

        List<Aluno> listaAlunos = new ArrayList<Aluno>();
        listaAlunos.add( new Aluno());
        listaAlunos.add( new Aluno());

        return Response.ok(listaAlunos, MediaType.APPLICATION_JSON).build();
    }

    @GET
    @Path("{id}")
    public Response recuperar(@PathParam("id") int id){

        aluno = new Aluno();
        aluno.setId(id);
        return Response.ok(aluno, MediaType.APPLICATION_JSON).build();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response criar(Aluno aluno){
        aluno.setId(200);
        return Response
            .status(Response.Status.CREATED)
            .entity(aluno)
            .build();
    }

    @PUT
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response atualizar(@PathParam("id") int id, Aluno aluno){
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
