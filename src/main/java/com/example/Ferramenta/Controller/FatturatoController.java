package com.example.Ferramenta.Controller;

import com.example.Ferramenta.Entity.Prodotto;
import com.example.Ferramenta.Service.ProdottoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class FatturatoController {

    @Autowired
    private ProdottoService prodottoService;

    @GetMapping
    public List<Prodotto> getAllProdotti() {
        return prodottoService.getAllProdotti();
    }

    @PostMapping
    public Prodotto createProdotto(@RequestBody Prodotto prodotto) {
        return prodottoService.saveProdotto(prodotto);

    }

}
