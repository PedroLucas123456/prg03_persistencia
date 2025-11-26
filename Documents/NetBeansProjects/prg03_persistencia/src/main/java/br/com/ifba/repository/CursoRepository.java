/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.repository;


import br.com.ifba.curso.entity.Curso;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 *
 * @author User
 */
public interface CursoRepository extends JpaRepository<Curso, Long>{

    public Curso findByCodigo(String codigo);
    
}
