/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifpr.uv.exercicio04;

/**
 *
 * @author Vinicius
 */

public class Carro {

    private String modelo;
    private String marca;
    private int ano;
    private String placa;
    private String cor;
    private boolean ligado;
    private int velocidade;

    public Carro(String modelo, String marca, int ano, String placa, String cor) {
    
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.placa = placa;
        this.cor = cor;
        this.ligado = false;
        this.velocidade = 0;
    }
    
    
    
    public void ligar() {
        setLigado(true);
    }
    
    public void desligar() {
        setLigado(false);
    }
    
    public void acelerar() {
        setVelocidade(getVelocidade() + 1);
    }
    
    public void frear() {
        setVelocidade(getVelocidade() - 1);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
}
