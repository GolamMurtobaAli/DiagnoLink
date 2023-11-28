package com.example.practice.Entity;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Entity
@Data
public class DiagnosticTest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String f_name;
    private String l_name;
    private String test_name;
    private String lab_name;
    @DateTimeFormat(pattern = "yy-MM-dd")
    private Date t_date;
    private String t_slot;
    // private double price;
    @ManyToMany(mappedBy = "tests")
    private List<Orders> orders;
    // private String testDtails;

}
