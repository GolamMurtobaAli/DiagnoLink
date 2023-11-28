package com.example.practice.ServiceImplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.practice.Entity.DiagnosticTest;
import com.example.practice.Repository.DiagnosticTestRepository;
import com.example.practice.Service.DiagnosticTestService;

@Service
public class DiagnosticTestServiceImpl implements DiagnosticTestService {
    @Autowired
    DiagnosticTestRepository diagnosticTestRepository;

    @Override
    public DiagnosticTest createDiagnosticTest(DiagnosticTest diagnosticTest) {
        return diagnosticTestRepository.save(diagnosticTest);

    }

    @Override
    public List<DiagnosticTest> getAllDiagnosticTests() {
        List<DiagnosticTest> allTests = diagnosticTestRepository.findAll();
        return allTests;
    }

    @Override
    public DiagnosticTest getDiagnosticTestById(Long id) {
        Optional<DiagnosticTest> tests = diagnosticTestRepository.findById(id);
        if (tests.isPresent()) {
            return tests.get();
        }
        return null;
    }

    @Override
    public void deleteDiagnosticTest(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteDiagnosticTest'");
    }

}
