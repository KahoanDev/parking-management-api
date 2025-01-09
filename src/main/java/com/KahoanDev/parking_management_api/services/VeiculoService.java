package com.KahoanDev.parking_management_api.services;

import com.KahoanDev.parking_management_api.domain.veiculo.Veiculo;
import com.KahoanDev.parking_management_api.domain.veiculo.VeiculoDTO;
import com.KahoanDev.parking_management_api.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeiculoService {
    @Autowired
    private VeiculoRepository repository;

    public List<Veiculo> findAllVeiculos(){
        return repository.findAll();
    }

    public Veiculo findByPlaca(String placa){
        return repository.findByPlaca(placa);
    }

    public Veiculo createVeiculo(VeiculoDTO data){
        Veiculo newVeiculo = new Veiculo(data);
        repository.save(newVeiculo);
        return newVeiculo;
    }

    public void deleteVeiculo(String placa){
        repository.deleteByPlaca(placa);
    }
}
