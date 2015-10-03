/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.cafeteria.cdp;

import java.util.ArrayList;

/**
 *
 * @author Douglas
 */
public class Cafe {
    private double preco;
    private ArrayList<Ingrediente> lstIngrediente;

    public Cafe(double preco, ArrayList<Ingrediente> lstIngrediente) {
        this.preco = preco;
        this.lstIngrediente = lstIngrediente;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public ArrayList<Ingrediente> getLstIngrediente() {
        return lstIngrediente;
    }

    public void setLstIngrediente(ArrayList<Ingrediente> lstIngrediente) {
        this.lstIngrediente = lstIngrediente;
    }
    
    public void ImprimirIngrediente(){
        for(Ingrediente ingrediente: lstIngrediente){
            ingrediente.Imprimir();
    }
    
}
}
