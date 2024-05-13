package com.carlos.rinhadebackend.repository;

import com.carlos.rinhadebackend.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}