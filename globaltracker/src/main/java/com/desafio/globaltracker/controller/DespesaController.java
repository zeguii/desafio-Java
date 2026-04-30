package com.desafio.globaltracker.controller;

import com.desafio.globaltracker.model.Despesa;
import com.desafio.globaltracker.service.DespesaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/despesas")
public class DespesaController {

    @Autowired
    private DespesaService service;

    @PostMapping
    public Despesa criar(@RequestBody Despesa despesa) {
        return service.salvar(despesa);
    }

    @GetMapping
    public List<Despesa> listar() {
        return service.listarTodas();
    }
}