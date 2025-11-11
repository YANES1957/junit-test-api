package com.roberto.junittest.integration;

import com.roberto.junittest.model.Pessoa;
import com.roberto.junittest.repository.PessoaRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class PessoaIntegrationTest {

    @Autowired
    private PessoaRepository pessoaRepository;

    @Test
    void deveSalvarEBuscarPessoaNoBanco() {
        Pessoa pessoa = new Pessoa("Lito", 4);
        pessoaRepository.save(pessoa);

        List<Pessoa> pessoas = pessoaRepository.findAll();

        assertFalse(pessoas.isEmpty());
        assertEquals("Lito", pessoas.get(0).getNome());
    }
}
