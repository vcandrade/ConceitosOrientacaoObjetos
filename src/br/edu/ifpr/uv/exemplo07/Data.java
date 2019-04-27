/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifpr.uv.exemplo07;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Vinicius
 */
public class Data {

    private String data;
    
    public void atribuirData() {
        
        Date hoje = new Date();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        this.data = df.format(hoje);
    }
    
    public void atribuirData(String data) {
        
        this.data = data;
    }
    
    public void atribuirData(int dia, int mes, int ano) {
        
        this.data = dia + "/" + mes + "/" + ano;
    }
}
