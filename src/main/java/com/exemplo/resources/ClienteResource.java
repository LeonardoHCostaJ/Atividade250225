package com.exemplo.resources;

import com.exemplo.domains.Cliente;
import com.exemplo.dtos.ClienteDTO;
import com.exemplo.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/clientes")
public class ClienteResource {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public ResponseEntity<List<ClienteDTO>> listarTodos() {
        List<Cliente> clientes = clienteService.listarTodos();
        List<ClienteDTO> clientesDTO = clientes.stream().map(ClienteDTO::new).collect(Collectors.toList());
        return ResponseEntity.ok(clientesDTO);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClienteDTO> buscarPorId(@PathVariable Integer id) {
        Cliente cliente = clienteService.buscarPorId(id);
        return ResponseEntity.ok(new ClienteDTO(cliente));
    }
}