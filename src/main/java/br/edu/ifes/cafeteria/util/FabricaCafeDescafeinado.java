/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.cafeteria.util;

import br.edu.ifes.cafeteria.cdp.*;
import java.util.ArrayList;

/**
 *
 * @author Douglas
 */
public class FabricaCafeDescafeinado implements Fabrica {

    @Override
    public ArrayList<Ingrediente> addIngrediente() {
       ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
       ingredientes.add(new CafeSemCafeina(50));
       ingredientes.add(new Acucar(2));
       ingredientes.add(new Leite(100));
       ingredientes.add(new Agua(100));
       return ingredientes;
    }

    @Override
    public Cafe criarCafe() {
       Cafe cafe = new Cafe(3,addIngrediente());
       return cafe;
    }
    
}
