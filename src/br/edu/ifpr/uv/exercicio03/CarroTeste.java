/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifpr.uv.exercicio03;

/**
 *
 * @author Vinicius
 */
public class CarroTeste {

    public static void main(String[] args) {
        
        Carro c1 = new Carro("Ford GT", "Ford", 2015, "ABC-1234", "Amarelo");
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
        
        Carro c2 = new Carro("Fusca", "Volks", 1970, "MNO-9876", "Vermelho");
        System.out.println(c2.modelo);
        System.out.println(c2.marca);
        System.out.println(c2.ano);
        System.out.println(c2.placa);
        System.out.println(c2.cor);
        System.out.println("---------");
        
        Carro c3 = new Carro("Chevette", "Chevrolet", 1983, "XYZ-4567", "Laranja");
        System.out.println(c3.modelo);
        System.out.println(c3.marca);
        System.out.println(c3.ano);
        System.out.println(c3.placa);
        System.out.println(c3.cor);
    }
}
