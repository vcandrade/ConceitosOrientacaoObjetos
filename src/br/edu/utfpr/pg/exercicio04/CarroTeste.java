/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifpr.uv.exercicio04;

import br.edu.ifpr.uv.exercicio03.*;

/**
 *
 * @author Vinicius
 */
public class CarroTeste {

    public static void main(String[] args) {
        
        Carro c1 = new Carro("Ford GT", "Ford", 2015, "ABC-1234", "Amarelo");
        System.out.println(c1.getModelo());
        System.out.println(c1.getMarca());
        System.out.println(c1.getAno());
        System.out.println(c1.getPlaca());
        System.out.println(c1.getCor());
        c1.ligar();
        System.out.println("Velocidade: " + c1.getVelocidade());
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        System.out.println("Velocidade: " + c1.getVelocidade());
        System.out.println("---------");
        
        Carro c2 = new Carro("Fusca", "Volks", 1970, "MNO-9876", "Vermelho");
        System.out.println(c2.getModelo());
        System.out.println(c2.getMarca());
        System.out.println(c2.getAno());
        System.out.println(c2.getPlaca());
        System.out.println(c2.getCor());
        System.out.println("---------");
        
        Carro c3 = new Carro("Chevette", "Chevrolet", 1983, "XYZ-4567", "Laranja");
        System.out.println(c3.getModelo());
        System.out.println(c3.getMarca());
        System.out.println(c3.getAno());
        System.out.println(c3.getPlaca());
        System.out.println(c3.getCor());
    }
}
