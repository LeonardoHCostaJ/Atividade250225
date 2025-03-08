package com.exemplo.services;

import com.exemplo.domains.Pedido;
import com.exemplo.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepo;

    public List<Pedido> listarTodos() {
        return pedidoRepo.findAll();
    }

    public Pedido buscarPorId(Long id) {
        return pedidoRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Pedido não encontrado"));
    }
}
