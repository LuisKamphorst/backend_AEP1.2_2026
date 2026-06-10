package com.AEP.backend.controller;

import com.AEP.backend.model.Chamado;
import com.AEP.backend.service.ChamadoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chamados")
public class ChamadoController {

    private final ChamadoService service;
    public ChamadoController(ChamadoService service){
        this.service = service;
    }

    @PostMapping
    public Chamado criar(@RequestBody Chamado chamado){
        return service.criar(chamado);
    }
    @GetMapping
    public List<Chamado> listar(){
        return service.listar();
    }

}
