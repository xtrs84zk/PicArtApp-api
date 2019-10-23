package com.four.picartapp.repositories;

import com.four.picartapp.model.Integrante;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IntegranteRepository extends JpaRepository<Integrante, Integer> {
    Integrante findByUsuario(String nombre);
}