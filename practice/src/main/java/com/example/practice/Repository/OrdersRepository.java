package com.example.practice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.practice.Entity.Orders;

public interface OrdersRepository extends JpaRepository<Orders,Long>{
    
}
