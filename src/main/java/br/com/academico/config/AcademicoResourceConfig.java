package br.com.academico.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;

import br.com.academico.AcademicoExceptionMapper;
import br.com.academico.disciplina.DisciplinaResource;
import br.com.academico.endereco.EnderecoResource;
import br.com.academico.sala.SalaResource;
import io.swagger.v3.jaxrs2.integration.resources.OpenApiResource;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

@ApplicationPath("/")
@OpenAPIDefinition(
    info = @Info(
        title = "Academico Web Api",
        version = "1.0",
        description = "WAB API utilizando o estilo arquitetural REST"
    ),
    servers = {
        @Server(
            description = "Desenvolvimento",
            url = "/academico-web-api"
        )
    }
)
public class AcademicoResourceConfig extends ResourceConfig {
    
    public AcademicoResourceConfig() {
        registrarEndPoint();
        configurarSwagger();
        configurarValidacao();
        configurarInversaoControle();
    }

    private void registrarEndPoint(){
        System.out.println("[Configurando as classes resources/endpoints das aplicações]");

        register(EnderecoResource.class);
        register(DisciplinaResource.class);
        register(SalaResource.class);
    }

    private void configurarSwagger(){
        System.out.println("[Configurando o Swagger | OPEN API]");
        OpenApiResource openApiResource = new OpenApiResource();
        register(openApiResource);

        
    } 

    private void configurarValidacao(){
        System.out.println("[Configurando a Validação]");
        property(ServerProperties.BV_SEND_ERROR_IN_RESPONSE, true);
        register(AcademicoExceptionMapper.class);
    }

    private void configurarInversaoControle(){
        System.out.println("[Configurando a Inversão de Control (IoC)]");
        register(AutoScanIoCFeature.class);
    }
}
