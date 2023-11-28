package com.example.practice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.practice.Entity.DiagnosticTest;

@Repository
public interface DiagnosticTestRepository extends JpaRepository<DiagnosticTest, Long>{
    
}
