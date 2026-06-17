package com.agenda.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/profissionais")
public class ProfissionalController {

@GetMapping
public String listar() {
    return "Listando profissionais";
}

@PostMapping
public String criar() {
    return "Profissional criado";
}

@PutMapping("/{id}")
public String atualizar(@PathVariable Long id) {
    return "Atualizando profissional " + id;
}

@DeleteMapping("/{id}")
public String remover(@PathVariable Long id) {
    return "Removendo profissional " + id;
}

}