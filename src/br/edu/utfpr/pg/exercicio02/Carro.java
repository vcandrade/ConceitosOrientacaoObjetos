/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifpr.uv.exercicio02;

/**
 *
 * @author Vinicius
 */

public class Carro {

    String modelo;
    String marca;
    int ano;
    String placa;
    String cor;
    boolean ligado = false;
    int velocidade = 0;
    
    public void ligar() {
        ligado = true;
    }
    
    public void desligar() {
        ligado = false;
    }
    
    public void acelerar() {
        velocidade = velocidade + 1;
    }
    
    public void frear() {
        velocidade = velocidade - 1;
    }
}
