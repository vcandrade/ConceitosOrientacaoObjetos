/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifpr.uv.exercicio07;

/**
 *
 * @author Vinicius
 */
public class Calculadora {

    public void calcularMedia(double valor1, double valor2) {
        
        double media = (valor1 + valor2) / 2;
        System.out.println("Média: " + media);
    }
    
    public void calcularMedia(double valor1, double valor2, double valor3) {
        
        double media = (valor1 + valor2 + valor3) / 3;
        System.out.println("Média: " + media);
    }
    
    public void calcularMedia(double valor1, double valor2, double valor3, double valor4) {
        
        double media = (valor1 + valor2 + valor3 + valor4) / 4;
        System.out.println("Média: " + media);
    }
}
