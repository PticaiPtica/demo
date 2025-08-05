package ru.academy.homework.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.academy.homework.demo.models.Employees;
import ru.academy.homework.demo.repositories.EmployeesRepository;

import java.util.List;

@Controller
@RequestMapping("/")
public class EmployeesController {

    @Autowired
    EmployeesRepository employeesRepository;

    @GetMapping("/home")
    public String home(Model model) {

        List<Employees> employees = employeesRepository.findAll();
        model.addAttribute("list", employees);
        return "emp/indexEmp";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("employee", new Employees());
        return "/emp/createEmp";
    }

    @PostMapping("/create")
    public String createEmployee(Employees employees) {
        employeesRepository.save(employees);
        return "redirect:/employee/home";
    }

    @GetMapping("/deleteAll")

    public String deleteAll() {
        employeesRepository.deleteAll();
        return "redirect:/employee/home";
    }


}
