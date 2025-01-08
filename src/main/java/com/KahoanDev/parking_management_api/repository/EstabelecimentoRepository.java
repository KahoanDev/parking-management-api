package com.KahoanDev.parking_management_api.repository;

import com.KahoanDev.parking_management_api.domain.estabelecimento.Estabelecimento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EstabelecimentoRepository extends JpaRepository<Estabelecimento, UUID> {
}
