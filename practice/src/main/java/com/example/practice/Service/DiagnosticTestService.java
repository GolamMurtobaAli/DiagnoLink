package com.example.practice.Service;

import java.util.List;

import com.example.practice.Entity.DiagnosticTest;

public interface DiagnosticTestService {
    DiagnosticTest createDiagnosticTest(DiagnosticTest diagnosticTest);
    List<DiagnosticTest> getAllDiagnosticTests();
    DiagnosticTest getDiagnosticTestById(Long id);
    void deleteDiagnosticTest(Long id);
}
