package br.com.phamtecnologia.apiclientes.controllers;

import br.com.phamtecnologia.apiclientes.dtos.ClienteDto;
import br.com.phamtecnologia.apiclientes.entities.Cliente;
import br.com.phamtecnologia.apiclientes.enums.StatusCliente;
import br.com.phamtecnologia.apiclientes.enums.TipoCliente;
import br.com.phamtecnologia.apiclientes.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @PostMapping("criar")
    public String criar(@RequestBody ClienteDto clienteDto) throws Exception {
        try {

            var cliente = new Cliente();

            cliente.setNome(clienteDto.getNome());
            cliente.setEmail(clienteDto.getEmail());
            cliente.setTelefone(clienteDto.getTelefone());
            cliente.setTipo(TipoCliente.valueOf(clienteDto.getTipo()));
            cliente.setStatus(StatusCliente.ATIVO);

            clienteRepository.create(cliente);

            return "Cliente cadastrado com sucesso.";

        }
        catch (Exception e) {
            return "Falha ao cadastrar o cliente" + e.getMessage();
        }

    }
}
