package com.sanapet.service;


import com.sanapet.model.Cliente;


import java.util.List;

public interface ClienteService {

    Cliente registrarCliente(Cliente cliente);
    Cliente modificarCliente (Cliente cliente);
    Cliente obtenerClientePorId (Integer idCliente);
    List<Cliente> listarCliente();
    void eliminarCliente(Integer idCliente);


}