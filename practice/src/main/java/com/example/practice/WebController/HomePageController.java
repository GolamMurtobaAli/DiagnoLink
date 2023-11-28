package com.example.practice.WebController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.practice.Entity.User;
import com.example.practice.ServiceImplementation.DiagnosticTestServiceImpl;
import com.example.practice.ServiceImplementation.UserServiceImpl;

@Controller
public class HomePageController {
    @Autowired
    UserServiceImpl userServiceImpl;

    @Autowired
    DiagnosticTestServiceImpl diagnosticTestServiceImpl;

    // this is for index page

    @RequestMapping("")
    public String Index() {
        return "index";

    }

    // this is for prescription page

    @GetMapping("/PrescriptionPage")
    public String PrescriptionPage() {
        return "PrescriptionPage";

    }

    // this is for Sign up page

    @GetMapping("/signUp")
    public String logInTests(Model model) {
        model.addAttribute("fillingForm", new User());
        return "signUp";
    }

    @PostMapping("/signUpUser")
    public String logInTest(User user) {
        userServiceImpl.createUser(user);
        return "redirect:/DiagnosticTest";

    }

    // this is for the diagnosticTest page
    
    @GetMapping("/DiagnosticTest")
    public String DiagnosticTest(Model model) {
        model.addAttribute("fillingTestForm", new com.example.practice.Entity.DiagnosticTest());
        return "DiagnosticTest";

    }

    @PostMapping("/DiagnosticTestAdd")
    public String DiagnosticTestAdd(com.example.practice.Entity.DiagnosticTest diagnosticTest) {
        diagnosticTestServiceImpl.createDiagnosticTest(diagnosticTest);
        return "redirect:/";
    }

}
