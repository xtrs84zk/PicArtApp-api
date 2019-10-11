package com.four.picartapp.repositories;

import com.four.picartapp.model.Devolucion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DevolucionRepository extends JpaRepository<Devolucion, Integer> {
    Devolucion findByIdDevolucion(int idDevolucion);
}
