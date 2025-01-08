package com.KahoanDev.parking_management_api.repository;

import com.KahoanDev.parking_management_api.domain.veiculo.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface VeiculoRepository extends JpaRepository<Veiculo, UUID> {

    Veiculo findByPlaca(String placa);
}
