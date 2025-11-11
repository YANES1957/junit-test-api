package com.roberto.junittest.service;

import com.roberto.junittest.model.Pessoa;
import com.roberto.junittest.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    // Salvar pessoa
    public Pessoa salvar(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    // Buscar por ID
    public Optional<Pessoa> buscarPorId(Long id) {
        return pessoaRepository.findById(id);
    }

    // Listar todas as pessoas
    public List<Pessoa> listarTodas() {
        return pessoaRepository.findAll();
    }

    // Deletar pessoa por ID
    public void deletarPorId(Long id) {
        pessoaRepository.deleteById(id);
    }
}
