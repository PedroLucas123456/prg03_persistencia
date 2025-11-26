/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.infrastructure.entity;

import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@MappedSuperclass 
// "Não crie uma tabela para esta classe no banco de dados. 
// Apenas use seus campos como herança (template) para quem a estender."
public class PersistenceEntity_1 {

    @Id // ANOTAÇÃO: Marca o campo 'id' como a Chave Primária (PK).


    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    // --- GETTERS E SETTERS ---
    // Métodos essenciais para o Hibernate conseguir ler e escrever o ID da Entidade.
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
