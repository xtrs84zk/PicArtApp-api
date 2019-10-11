package com.four.picartapp.repositories;

import com.four.picartapp.model.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentaRepository  extends JpaRepository<Venta, Integer> {
    Venta findVentaById(int idVenta);
}
