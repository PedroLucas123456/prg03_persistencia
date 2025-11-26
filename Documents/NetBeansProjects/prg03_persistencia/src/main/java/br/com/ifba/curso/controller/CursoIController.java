/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.curso.controller;

import br.com.ifba.curso.entity.Curso;
import java.util.List;

public interface CursoIController {

    // Define que quem implementar essa interface TEM que saber salvar um Curso.
    public abstract Curso save(Curso curso);

    // Tem que saber atualizar.
    public abstract Curso update(Curso curso);

    // Tem que saber excluir.
    public abstract void delete(Curso curso);

    // Tem que saber listar tudo.
    public abstract List<Curso> findAll();

    // Tem que saber buscar por código.
    public abstract Curso findByCodigo(String codigo);

}
