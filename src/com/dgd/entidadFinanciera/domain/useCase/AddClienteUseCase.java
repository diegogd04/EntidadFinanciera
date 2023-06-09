package com.dgd.entidadFinanciera.domain.useCase;

import com.dgd.entidadFinanciera.domain.models.Cliente;

public class AddClienteUseCase {
    private ClienteRepository clienteRepository;

    public AddClienteUSeCase(ClienteRepository clienteRepository){
        this.clienteRepository = clienteRepository;
    }

    public void execute(Cliente cliente){
        clienteRepository.save(cliente);
    }
}
