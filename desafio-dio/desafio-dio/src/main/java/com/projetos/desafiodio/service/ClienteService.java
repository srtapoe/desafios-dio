package com.projetos.desafiodio.service;

import com.projetos.desafiodio.model.Cliente;

import java.util.Iterator;

public interface ClienteService {

    Iterator<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);

}
