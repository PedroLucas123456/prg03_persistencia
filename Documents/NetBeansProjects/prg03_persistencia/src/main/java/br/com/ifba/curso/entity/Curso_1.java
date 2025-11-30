/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.curso.entity;

import br.com.ifba.infrastructure.entity.PersistenceEntity_1;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.AllArgsConstructor; 
import lombok.Data;              
import lombok.EqualsAndHashCode; 
import lombok.NoArgsConstructor;


@Entity // <--- CRUCIAL: Diz ao Spring/JPA que isso vira uma Tabela.
@Table(name = "curso") // Opcional: Define o nome exato da tabela no banco (ex: 'tbl_curso').
@Data // Gera Getters, Setters, ToString, etc.
@AllArgsConstructor // Gera construtor com tudo
@NoArgsConstructor // Gera construtor vazio (obrigatório pro JPA)
@EqualsAndHashCode(callSuper = false)

public class Curso_1 extends PersistenceEntity_1 implements Serializable {

    // 'extends PersistenceEntity': 
    // Herança! Em vez de digitar 'Long id' em todas as classes (Curso, Aluno, Professor),
    // nós herdamos dessa classe pai. Assim, o 'Curso' ganha um ID automaticamente.
    /**
     * Coluna do Nome.
     */
    @Column(name = "nome", nullable = false)
    private String nome;

    /**
     * Coluna do Código. unique = true: Garante que o banco bloqueie se tentarem
     * salvar dois cursos com o mesmo código (ex: dois cursos 'INF01').
     */
    @Column(name = "codigo_curso", nullable = false, unique = true)
    private String codigoCurso;

    /**
     * Coluna Ativo. Usado para "Exclusão Lógica". Em vez de deletar do banco,
     * só marcamos como false.
     */
    @Column(name = "ativo")
    private boolean ativo;

}
