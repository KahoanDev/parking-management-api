package com.KahoanDev.parking_management_api.domain.veiculo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Veiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String marca;
    private String modelo;
    private String cor;
    private String placa;
    private String tipo;

    public Veiculo(VeiculoDTO dto){
        this.cor = dto.cor();
        this.marca = dto.marca();
        this.tipo = dto.tipo();
        this.modelo = dto.modelo();
        this.placa = dto.placa();
    }
}
