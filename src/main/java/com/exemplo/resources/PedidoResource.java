package com.exemplo.resources;

import com.exemplo.domains.Pedido;
import com.exemplo.dtos.PedidoDTO;
import com.exemplo.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/pedidos")
public class PedidoResource {

    @Autowired
    private PedidoService pedidoService;

    @GetMapping
    public ResponseEntity<List<PedidoDTO>> listarTodos() {
        List<Pedido> pedidos = pedidoService.listarTodos();
        List<PedidoDTO> pedidosDTO = pedidos.stream().map(PedidoDTO::new).collect(Collectors.toList());
        return ResponseEntity.ok(pedidosDTO);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PedidoDTO> buscarPorId(@PathVariable Long id) {
        Pedido pedido = pedidoService.buscarPorId(id);
        return ResponseEntity.ok(new PedidoDTO(pedido));
    }
}