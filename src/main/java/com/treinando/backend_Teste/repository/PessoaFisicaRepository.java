package com.treinando.backend_Teste.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.treinando.backend_Teste.model.PessoaFisicaModel;

@Repository
public interface PessoaFisicaRepository extends JpaRepository<PessoaFisicaModel, Integer> {

}
