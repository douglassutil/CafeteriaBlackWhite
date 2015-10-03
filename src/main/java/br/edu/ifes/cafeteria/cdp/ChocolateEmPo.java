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
public class ChocolateEmPo extends Ingrediente {

    public ChocolateEmPo(double qtdIngrediente) {
        super(qtdIngrediente);
    }
    public void Imprimir(){
        System.out.println(getQtdIngrediente() + ": Chocolate em Pó");
    }
}
