package ru.academy.homework.demo.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.academy.homework.demo.entities.Person;

import ru.academy.homework.demo.repositories.EmployeesRepository;
import ru.academy.homework.demo.repositories.PersonRepository;

import java.util.List;

@Controller
@RequestMapping("/person")
public class PersonController {

    @Autowired
    PersonRepository personRepository;

    @Autowired
    EmployeesRepository employeesRepository;

    @GetMapping("/home")
    public String home(Model model) {
        List<Person> list = personRepository.findAll();
        model.addAttribute("people", list);
        return "person/index";
    }

    @GetMapping("/clear")
    public String clear(Model model) {
        personRepository.deleteAll();
        return "redirect:/person/home";
    }



    @GetMapping("/addPeople")
    public String addPeople(Model model) {
        return "redirect:/person/home";
    }

    @GetMapping("/delete/{id}")
    public String deleteById(Model model, @PathVariable Long id) {
        personRepository.deleteById(id);
        return "redirect:/person/home";
    }


    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("person", new Person());
        model.addAttribute("options", List.of(employeesRepository.findAll()));
        return "/person/createPerson";
    }

    @PostMapping("/create")
    public String create(Person person) {
        personRepository.save(person);
        return "redirect:/person/home";
    }
}


