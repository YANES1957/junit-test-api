package com.roberto.junittest.bdd.steps;

import com.roberto.junittest.model.Pessoa;
import io.cucumber.java.pt.*;
import static org.junit.jupiter.api.Assertions.*;

public class PessoaSteps {

    private Pessoa pessoa;

    @Dado("que existe uma pessoa chamada {string} com {int} anos")
    public void queExisteUmaPessoa(String nome, int idade) {
        pessoa = new Pessoa(nome, idade);
    }

    @Quando("eu consulto o nome dessa pessoa")
    public void euConsultoONome() {
        assertNotNull(pessoa);
    }

    @Entao("o nome deve ser {string}")
    public void oNomeDeveSer(String nomeEsperado) {
        assertEquals(nomeEsperado, pessoa.getNome());
    }
}
