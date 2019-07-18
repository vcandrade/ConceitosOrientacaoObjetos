/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifpr.uv.exercicio05;

/**
 *
 * @author Vinicius
 */
public class Aluno extends Pessoa {

    private String curso;
    
    public void realizarMatricula() {
        
        System.out.println("Realizando matrícula do aluno");
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
