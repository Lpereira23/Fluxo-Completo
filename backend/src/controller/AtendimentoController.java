package com.agenda.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/atendimentos")
public class AtendimentoController {

@GetMapping
public String listar() {
    return "Lista de atendimentos";
}

@PostMapping
public String criar() {
    return "Atendimento criado";
}

}