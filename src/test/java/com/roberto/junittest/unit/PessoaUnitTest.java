package com.roberto.junittest.unit;

import com.roberto.junittest.model.Pessoa;
import com.roberto.junittest.repository.PessoaRepository;
import com.roberto.junittest.service.PessoaService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class PessoaUnitTest {

    @Mock
    private PessoaRepository pessoaRepository;

    @InjectMocks
    private PessoaService pessoaService;

    @BeforeEach
    void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void deveSalvarPessoaComSucesso() {
        Pessoa pessoa = new Pessoa("Roberto", 35);
        when(pessoaRepository.save(pessoa)).thenReturn(pessoa);

        Pessoa salva = pessoaService.salvar(pessoa);

        assertEquals("Roberto", salva.getNome());
        assertEquals(35, salva.getIdade());
        verify(pessoaRepository, times(1)).save(pessoa);
    }

    @Test
    void deveBuscarPessoaPorId() {
        Pessoa pessoa = new Pessoa("Yan", 30);
        pessoa.setId(1L);

        when(pessoaRepository.findById(1L)).thenReturn(Optional.of(pessoa));

        Optional<Pessoa> resultado = pessoaService.buscarPorId(1L);

        assertTrue(resultado.isPresent());
        assertEquals("Yan", resultado.get().getNome());
    }
}
