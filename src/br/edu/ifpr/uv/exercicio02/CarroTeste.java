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
public class CarroTeste {

    public static void main(String[] args) {
        
        Carro c1 = new Carro();
        c1.modelo = "Ford GT";
        c1.marca = "Ford";
        c1.ano = 2015;
        c1.placa = "ABC-1234";
        c1.cor = "Amarelo";
        System.out.println(c1.modelo);
        System.out.println(c1.marca);
        System.out.println(c1.ano);
        System.out.println(c1.placa);
        System.out.println(c1.cor);
        c1.ligar();
        System.out.println("Velocidade: " + c1.velocidade);
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        System.out.println("Velocidade: " + c1.velocidade);
        System.out.println("---------");
        
        Carro c2 = new Carro();
        c2.modelo = "Fusca";
        c2.marca = "Volks";
        c2.ano = 1970;
        c2.placa = "MNO-9876";
        c2.cor = "Vermelho";
        System.out.println(c2.modelo);
        System.out.println(c2.marca);
        System.out.println(c2.ano);
        System.out.println(c2.placa);
        System.out.println(c2.cor);
        System.out.println("---------");
        
        Carro c3 = new Carro();
        c3.modelo = "Chevette";
        c3.marca = "Chevrolet";
        c3.ano = 1983;
        c3.placa = "XYZ-4567";
        c3.cor = "Laranja";
        System.out.println(c3.modelo);
        System.out.println(c3.marca);
        System.out.println(c3.ano);
        System.out.println(c3.placa);
        System.out.println(c3.cor);
    }
}
