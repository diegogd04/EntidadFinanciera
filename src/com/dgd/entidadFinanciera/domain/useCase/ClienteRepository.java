package com.dgd.entidadFinanciera.domain.useCase;

import com.dgd.entidadFinanciera.domain.models.Cliente;

import java.util.List;

public interface ClienteRepository {
    public void save(Cliente cliente);

    public List<Cliente> getAll();
}
