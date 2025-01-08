package com.KahoanDev.parking_management_api.services;

import com.KahoanDev.parking_management_api.repository.EstabelecimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstabelecimentoService {
    @Autowired
    private EstabelecimentoRepository repository;

}
