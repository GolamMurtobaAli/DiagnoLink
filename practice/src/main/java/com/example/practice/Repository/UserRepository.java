package com.example.practice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.practice.Entity.User;

public interface UserRepository extends JpaRepository<User,Long>{

    static void deleteUserById(long id) {
    }
    
}
