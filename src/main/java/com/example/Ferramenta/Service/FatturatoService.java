package com.example.Ferramenta.Service;


import com.example.Ferramenta.Entity.Fatturato;
import com.example.Ferramenta.Repository.FatturatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FatturatoService {

    @Autowired
    private FatturatoRepository fatturatoRepository;

    public List<Fatturato> getAllFatturati() {
        return fatturatoRepository.findAll();
    }

    public Fatturato saveFatturato(Fatturato fatturato) {
        return fatturatoRepository.save(fatturato);
    }
}
