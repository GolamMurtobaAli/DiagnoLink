package com.example.practice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.practice.Entity.DiagnosticTest;

public interface PrescriptionRepository extends JpaRepository<DiagnosticTest, Long>{
    
}
