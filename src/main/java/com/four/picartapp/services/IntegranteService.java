package com.four.picartapp.services;

import com.four.picartapp.model.Integrante;

public interface IntegranteService {
    public Integrante findIntegranteByUsername(String username);

    public void saveIntegrante(Integrante integrante);
}