package com.sanapet.controller;


import com.sanapet.model.Veterinario;
import com.sanapet.service.VeterinarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/veterinarios")
public class VeterinarioController {
    private final VeterinarioService veterinarioService;

    public VeterinarioController(VeterinarioService veterinarioService) {
        this.veterinarioService = veterinarioService;
    }

    @PostMapping
    public ResponseEntity<Veterinario> registrarVeterinario (@Valid @RequestBody Veterinario veterinario) {
        Veterinario veterinario1 = veterinarioService.registrarVeterinario(veterinario);
        return new ResponseEntity<Veterinario>(veterinario1, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Veterinario> modificarVeterinario(@Valid @RequestBody Veterinario veterinario) {
        Veterinario veterinarioUpdate = veterinarioService.modificarVeterinario(veterinario);
        return new ResponseEntity<Veterinario>(veterinarioUpdate, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Veterinario>> listarVeterinario() {
        List<Veterinario> veterinario = veterinarioService.listarVeterinario();
        return new ResponseEntity<List<Veterinario>>(veterinario, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Veterinario> obtenerVeterinarioPorId(@PathVariable ("id")Integer idVeterinario) {
        Veterinario veterinario= veterinarioService.obtenerVeterinarioPorId(idVeterinario);
        return new ResponseEntity<Veterinario>(veterinario, HttpStatus.OK);
    }


}

