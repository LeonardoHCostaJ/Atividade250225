package com.exemplo.services;

import com.exemplo.domains.Cliente;
import com.exemplo.domains.Pedido;
import com.exemplo.domains.enums.Situacao;
import com.exemplo.repositories.ClienteRepository;
import com.exemplo.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;

@Service
public class DBService {

    @Autowired
    private ClienteRepository clienteRepo;

    @Autowired
    private PedidoRepository pedidoRepo;

    public void initDB() {
        Cliente cliente01 = new Cliente(null, "João Silva", "joao0942@gmail.com");

        Cliente cliente02 = new Cliente(null, "Maria Oliveira", "maria271409@gmail.com");

        Pedido pedido01 = new Pedido(null, LocalDateTime.now(), 150.00, cliente01, Situacao.CONCLUIDO);

        Pedido pedido02 = new Pedido(null, LocalDateTime.now(), 350.00, cliente02,Situacao.PENDENTE);

        clienteRepo.save(cliente01);
        clienteRepo.save(cliente02);
        pedidoRepo.save(pedido01);
        pedidoRepo.save(pedido02);
    }
}
