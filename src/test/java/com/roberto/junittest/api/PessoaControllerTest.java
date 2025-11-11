package com.roberto.junittest.api;

import com.roberto.junittest.model.Pessoa;
import com.roberto.junittest.repository.PessoaRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class PessoaControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private PessoaRepository pessoaRepository;

    @Test
    void deveCriarPessoa() throws Exception {
        String novaPessoa = """
                {
                    "nome": "Roberto",
                    "idade": 35
                }
                """;

        mockMvc.perform(post("/pessoas")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(novaPessoa))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.nome").value("Roberto"))
                .andExpect(jsonPath("$.idade").value(35));
    }

    @Test
    void deveListarPessoas() throws Exception {
        mockMvc.perform(get("/pessoas"))
                .andExpect(status().isOk());
    }

    @Test
    void deveBuscarPessoaPorId() throws Exception {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Teste");
        pessoa.setIdade(25);
        pessoaRepository.save(pessoa);

        mockMvc.perform(get("/pessoas/" + pessoa.getId()))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.nome").value("Teste"));
    }

    @Test
    void deveDeletarPessoa() throws Exception {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Deletar");
        pessoa.setIdade(30);
        pessoaRepository.save(pessoa);

        mockMvc.perform(delete("/pessoas/" + pessoa.getId()))
                .andExpect(status().isNoContent());
    }
}
