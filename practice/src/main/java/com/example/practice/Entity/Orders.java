package com.example.practice.Entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL, fetch =FetchType.EAGER )
    @JoinColumn(name = "user_id"  , referencedColumnName = "id")
    private User patient; // The patient(user) who placed the order
    @ManyToMany(cascade = CascadeType.ALL, fetch =FetchType.EAGER )
    @JoinTable(name = "order_test", joinColumns = @JoinColumn(name = "order_id"), inverseJoinColumns = @JoinColumn(name = "test_id"))
    private List<DiagnosticTest> tests; // The diagnostic tests in the order

}
