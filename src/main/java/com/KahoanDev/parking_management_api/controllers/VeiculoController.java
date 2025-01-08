package com.KahoanDev.parking_management_api.controllers;

import com.KahoanDev.parking_management_api.domain.veiculo.Veiculo;
import com.KahoanDev.parking_management_api.domain.veiculo.VeiculoDTO;
import com.KahoanDev.parking_management_api.services.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/veiculo")
public class VeiculoController {

    @Autowired
    private VeiculoService service;

    @GetMapping
    public List<Veiculo> getAllVeiculos(){
        return service.findAllVeiculos();
    }

    @GetMapping("{placa}")
    public Veiculo getVeiculoByPlaca(@PathVariable("placa") String placa){
        return service.findByPlaca(placa);
    }

    @PostMapping
    public Veiculo createVeiculo(@RequestBody VeiculoDTO veiculo){
        return service.createVeiculo(veiculo);
    }

    @PutMapping("{placa}")
    public void updateVeiculo(@PathVariable("placa") String placa, Veiculo veiculo){
    }

    @DeleteMapping("{placa}")
    public void deleteVeiculo(@PathVariable("placa") String placa){
    }
}
