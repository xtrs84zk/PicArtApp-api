package com.four.picartapp.repositories;

import com.four.picartapp.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {

    @Query("SELECT p FROM producto p WHERE p.name LIKE %?1%")
    List<Producto> findProductoByNombre(String name);
}
