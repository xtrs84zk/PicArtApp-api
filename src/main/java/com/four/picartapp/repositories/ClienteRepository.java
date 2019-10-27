package com.four.picartapp.repositories;

import com.four.picartapp.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    Cliente findClienteByNombre(String name);

    @Query("SELECT COUNT(c) > 0 FROM cliente c WHERE curp = ?")
    Cliente isClienteExist(String CURP);

}
