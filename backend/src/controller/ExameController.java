package com.agenda.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/exames")
public class ExameController {

@GetMapping
public String listar() {
    return "Lista de exames";
}

@PostMapping
public String criar() {
    return "Exame criado";
}

}