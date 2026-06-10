package com.AEP.backend.service;

import com.AEP.backend.model.Chamado;
import com.AEP.backend.repository.ChamadoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChamadoService {

    private final ChamadoRepository repository;
    public ChamadoService(ChamadoRepository repository){
        this.repository = repository;
    }

    public Chamado criar(Chamado chamado){
        chamado.setStatus("ABERTO");
        return repository.save(chamado);
    }
    public List<Chamado> listar(){
        return repository.findAll();
    }

}
