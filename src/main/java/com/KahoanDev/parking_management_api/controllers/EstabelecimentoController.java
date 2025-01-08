package com.KahoanDev.parking_management_api.controllers;

import com.KahoanDev.parking_management_api.domain.estabelecimento.Estabelecimento;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estabelecimento")
public class EstabelecimentoController {
    @GetMapping
    public List<Estabelecimento> getAllEstabelecimentos(){
        return null;
    }

    @GetMapping("{cnpj}")
    public Estabelecimento getEstabelecimentoByPlaca(@PathVariable("cnpj") Integer cnpj){
        return null;
    }

    @PostMapping
    public Estabelecimento createEstabelecimento(@RequestBody Estabelecimento Estabelecimento){
        return null;
    }

    @PutMapping("{cnpj}")
    public void updateEstabelecimento(@PathVariable("cnpj") Integer cnpj, Estabelecimento Estabelecimento){
    }

    @DeleteMapping("{cnpj}")
    public void deleteEstabelecimento(@PathVariable("cnpj") Integer cnpj){
    }
}
