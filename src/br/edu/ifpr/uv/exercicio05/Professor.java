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
public class Professor extends Pessoa {

    private double salario;
    
    public void calcularSalario() {
        
        System.out.println("Calculando salário do professor");
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
