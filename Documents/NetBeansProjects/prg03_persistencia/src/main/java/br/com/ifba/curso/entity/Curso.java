/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package br.com.ifba.curso.entity;

import br.com.ifba.infrastructure.entity.PersistenceEntity_1;
import jakarta.persistence.Entity;
import java.io.Serializable;

/**
 * @author PedroLucas
 */
@Entity // Marca esta classe como uma Entidade gerenciada pelo JPA.
/**
 * Representa um curso do sistema.
 * Esta classe armazena informações básicas como nome, código identificador
 * e se o curso está ativo ou não.
 */
public class Curso extends PersistenceEntity_1 implements Serializable {

    /** Nome do curso. */
    private String nome;

    /** Código identificador único do curso. */
    private String codigoCurso;

    /** Indica se o curso está ativo no sistema. */
    private boolean ativo;

    /**
     * Retorna o nome do curso.
     * @return nome do curso.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do curso.
     * @param nome nome do curso.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna o código identificador do curso.
     * @return código do curso.
     */
    public String getCodigoCurso() {
        return codigoCurso;
    }

    /**
     * Define o código identificador do curso.
     * @param codigoCurso código do curso.
     */
    public void setCodigoCurso(String codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    /**
     * Indica se o curso está ativo.
     * @return true se o curso estiver ativo, caso contrário false.
     */
    public boolean isAtivo() {
        return ativo;
    }

    /**
     * Define se o curso está ativo.
     * @param ativo true para ativar o curso, false para desativar.
     */
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}

