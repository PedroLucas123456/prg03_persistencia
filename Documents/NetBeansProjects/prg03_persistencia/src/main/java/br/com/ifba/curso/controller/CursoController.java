/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.curso.controller;

import br.com.ifba.curso.entity.Curso;
import br.com.ifba.curso.service.CursoIService_1;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller 
public class CursoController implements CursoIController {
    
    @Autowired
    private CursoIService_1 cursoService;

    /**
     * Recebe um curso da Tela e manda o Service salvar.
     */
    @Override
    public Curso save(Curso curso) {
        // O Controller é preguiçoso: ele só repassa a tarefa.
        return cursoService.save(curso);
    }

    /**
     * Recebe um curso já modificado da Tela e manda o Service atualizar.
     */
    @Override
    public Curso update(Curso curso) {
        return cursoService.update(curso);
    }

    /**
     * Recebe o pedido de exclusão e repassa.
     */
    @Override
    public void delete(Curso curso) {
        cursoService.delete(curso);
    }

    /**
     * A Tela pede a lista, o Controller pede pro Service, que pede pro DAO... e
     * devolve tudo de volta pra Tela.
     */
    @Override
    public List<Curso> findAll() {
        return cursoService.findAll();
    }

    /**
     * Busca específica por código.
     */
    @Override
    public Curso findByCodigo(String codigo) {
        return cursoService.findByCodigo(codigo);
    }
}
