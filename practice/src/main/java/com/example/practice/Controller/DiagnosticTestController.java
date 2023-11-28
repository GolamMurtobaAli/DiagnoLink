package com.example.practice.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.practice.Entity.DiagnosticTest;
import com.example.practice.Service.DiagnosticTestService;

public class DiagnosticTestController {
    @Autowired
    DiagnosticTestService diagnosticTestService;

    @PostMapping("/createTest")
    public DiagnosticTest createDiagnosticTest(@RequestBody DiagnosticTest diagnosticTest) {
        return diagnosticTestService.createDiagnosticTest(diagnosticTest);
    }

    @GetMapping("/getTests")
    public List<DiagnosticTest> getAllDiagnosticTests() {
        return diagnosticTestService.getAllDiagnosticTests();

    }

    @GetMapping("/getTest/{id}")
    public DiagnosticTest getDiagnosticTestById(@PathVariable("id") Long id) {
        return diagnosticTestService.getDiagnosticTestById(id);
    }

}
