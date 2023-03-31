package br.com.academico;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

public class AcademicoExceptionMapper implements ExceptionMapper<ConstraintViolationException> {
    
    @Override
    public Response toResponse(ConstraintViolationException exception){
        return Response.status(422)
            .entity(preparaMensagem(exception))
            .type("text/plain")
            .build();
    }

    private String preparaMensagem(ConstraintViolationException exception) {
        StringBuilder menssagem = new StringBuilder();
        for(ConstraintViolation<?> cv : exception.getConstraintViolations()){
            menssagem.append(cv.getPropertyPath() + " " + cv.getMessage() + "\n");
        }
        return menssagem.toString();
    }
}
