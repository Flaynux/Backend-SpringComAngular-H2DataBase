package com.treinando.backend_Teste.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.treinando.backend_Teste.model.ProdutoModel;
import com.treinando.backend_Teste.repository.ProdutoRepository;

@RestController
@RequestMapping("/admin/produto")
@CrossOrigin(origins = "http://localhost:4200")
public class ProdutoController {

    @Autowired
    private ProdutoRepository pr;

    @GetMapping
    public List<ProdutoModel> listarTodos() {
        return pr.findAll();
    }

    @PostMapping
    public ProdutoModel criar(@RequestBody ProdutoModel produto) {
        return pr.save(produto);
    }

}
