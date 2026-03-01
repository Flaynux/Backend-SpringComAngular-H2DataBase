package com.treinando.backend_Teste.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.treinando.backend_Teste.model.PessoaFisicaModel;
import com.treinando.backend_Teste.repository.PessoaFisicaRepository;

@RestController
@RequestMapping("/admin/pessoafisica")
@CrossOrigin(origins = "http://localhost:4200")
public class PessoaFisicaController {

    @Autowired
    private PessoaFisicaRepository pfr;

    @GetMapping
    public List<PessoaFisicaModel> listarTodasPessoas() {
        return pfr.findAll();
    }

    @PostMapping
    public PessoaFisicaModel criar(@RequestBody PessoaFisicaModel pessoaFisica) {
        return pfr.save(pessoaFisica);
    }

}
