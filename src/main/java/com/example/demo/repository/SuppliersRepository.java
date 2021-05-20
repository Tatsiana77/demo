package com.example.demo.repository;

import com.example.demo.entity.Suppliers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SuppliersRepository extends JpaRepository<Suppliers, Integer> {
}
