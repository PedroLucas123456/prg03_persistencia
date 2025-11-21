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

@Controller //
// "Spring, esta classe é um Controlador.
// Gerencie ela para mim e deixe ela disponível para ser usada nas Telas."
public class CursoController implements CursoIController {
    
    // Em vez de fazermos 'cursoService = new CursoService()', o Spring
    // cria o Service, deixa ele pronto na memória e "injeta" aqui dentro.
    // É como se o restaurante já te desse o cozinheiro contratado e pronto.
    @Autowired
    private CursoIService_1 cursoService;

    /**
     * Recebe um curso da Tela e manda o Service salvar.
     */
    @Override
    public Curso salvar(Curso curso) {
        // O Controller é preguiçoso: ele só repassa a tarefa.
        return cursoService.salvar(curso);
    }

    /**
     * Recebe um curso já modificado da Tela e manda o Service atualizar.
     */
    @Override
    public Curso atualizar(Curso curso) {
        return cursoService.atualizar(curso);
    }

    /**
     * Recebe o pedido de exclusão e repassa.
     */
    @Override
    public void excluir(Curso curso) {
        cursoService.excluir(curso);
    }

    /**
     * A Tela pede a lista, o Controller pede pro Service, que pede pro DAO... e
     * devolve tudo de volta pra Tela.
     */
    @Override
    public List<Curso> listarTodos() {
        return cursoService.listarTodos();
    }

    /**
     * Busca específica por código.
     */
    @Override
    public Curso buscarPorCodigo(String codigo) {
        return cursoService.buscarPorCodigo(codigo);
    }
}
