package com.exemplo.services;

import com.exemplo.domains.Cliente;
import com.exemplo.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepo;

    public List<Cliente> listarTodos() {
        return clienteRepo.findAll();
    }

    public Cliente buscarPorId(Integer id) {
        return clienteRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado"));
    }
}
