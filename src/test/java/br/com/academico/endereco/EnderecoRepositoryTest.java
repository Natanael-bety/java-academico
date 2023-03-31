package br.com.academico.endereco;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class EnderecoRepositoryTest {

    private EntityManagerFactory emf;

    private EntityManager em;

    private IEnderecoRepository enderecoRepositoryJPA;

    @Before
    public void init(){
        emf = Persistence.createEntityManagerFactory("academico-pu");
        em = emf.createEntityManager();
        enderecoRepositoryJPA = new EnderecoRepositoryJPA(em);
    }

    @Test
    public void teste_findAll_enderecos(){

        //WHEN - Quando ocorrer uma ação (act)

        List<Endereco> listaEnderecosResposta = enderecoRepositoryJPA.findAll();

        //THEN - Verifique a saída (assert)

        assertThat(listaEnderecosResposta)
            .withFailMessage("O retorno do método listar deve ser uma lista de endereços não nulla")
            .isNotNull();

        assertThat(listaEnderecosResposta)
            .withFailMessage("O retorno do método listar deve ser uma lista de endereços")
            .isInstanceOf(List.class);

        assertThat(listaEnderecosResposta.size())
            .withFailMessage("O retorno do método listar deve ser uma lista de endereços com a quantidade de endereços no banco de dados")
            .isEqualTo(listaEnderecosResposta.size()); 

    }

    @Test
    public void teste_save_enderecos(){

        //GIVEN - Dada alguma(s) pré-condição (arrange)

        Endereco enderecoEnviado = new Endereco(55000000L,"Rua A", "Bairro A", "Cidade A", "Estado A");

        //WHEN - Quando ocorrer uma ação (act)
        Endereco enderecoSalvo = enderecoRepositoryJPA.save(enderecoEnviado);

        //THEN - Verifique a saída (assert)
        assertThat(enderecoSalvo)
            .withFailMessage("O retorno do método save não pode ser nullo")
            .isNotNull();

        assertThat(enderecoSalvo)
            .withFailMessage("O retorno do método save deve ser um objeto Endereco")
            .isInstanceOf(Endereco.class);

        assertThat(enderecoSalvo.getCEP())
            .withFailMessage("O CEP do endereço deve ser igual ao informado")
            .isEqualTo(55000000L);

        assertThat(enderecoSalvo.getRua())
            .withFailMessage("A Rua do endereço deve ser igual a informada")
            .isEqualTo("Rua A");

        assertThat(enderecoSalvo.getBairro())
            .withFailMessage("O Bairro do endereço deve ser igual ao informado")
            .isEqualTo("Bairro A");

        assertThat(enderecoSalvo.getCidade())
            .withFailMessage("A Cidade do endereço deve ser igual a informada")
            .isEqualTo("Cidade A");

        assertThat(enderecoSalvo.getEstado())
            .withFailMessage("O Estado do endereço deve ser igual ao informado")
            .isEqualTo("Estado A");    

    }


    @Test
    public void teste_save_enderecos(){

        //GIVEN - Dada alguma(s) pré-condição (arrange)

        Endereco enderecoEnviado = new Endereco(55000000L,"Rua A", "Bairro A", "Cidade A", "Estado A");

        //WHEN - Quando ocorrer uma ação (act)
        Endereco enderecoSalvo = enderecoRepositoryJPA.save(enderecoEnviado);

        //THEN - Verifique a saída (assert)
        assertThat(enderecoSalvo)
            .withFailMessage("O retorno do método save não pode ser nullo")
            .isNotNull();

        assertThat(enderecoSalvo)
            .withFailMessage("O retorno do método save deve ser um objeto Endereco")
            .isInstanceOf(Endereco.class);

        assertThat(enderecoSalvo.getCEP())
            .withFailMessage("O CEP do endereço deve ser igual ao informado")
            .isEqualTo(55000000L);

        assertThat(enderecoSalvo.getRua())
            .withFailMessage("A Rua do endereço deve ser igual a informada")
            .isEqualTo("Rua A");

        assertThat(enderecoSalvo.getBairro())
            .withFailMessage("O Bairro do endereço deve ser igual ao informado")
            .isEqualTo("Bairro A");

        assertThat(enderecoSalvo.getCidade())
            .withFailMessage("A Cidade do endereço deve ser igual a informada")
            .isEqualTo("Cidade A");

        assertThat(enderecoSalvo.getEstado())
            .withFailMessage("O Estado do endereço deve ser igual ao informado")
            .isEqualTo("Estado A");    

    }

}