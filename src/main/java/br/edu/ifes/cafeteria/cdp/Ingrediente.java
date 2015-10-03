/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.cafeteria.cdp;

/**
 *
 * @author Douglas
 */
public abstract class Ingrediente {
    private double qtdIngrediente;

    public Ingrediente(double qtdIngrediente) {
        this.qtdIngrediente = qtdIngrediente;
    }

    public double getQtdIngrediente() {
        return qtdIngrediente;
    }

    public void setQtdIngrediente(double qtdIngrediente) {
        this.qtdIngrediente = qtdIngrediente;
    }
    
    abstract void Imprimir();
    
}
