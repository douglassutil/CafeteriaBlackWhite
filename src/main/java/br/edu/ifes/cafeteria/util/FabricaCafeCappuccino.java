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
public class FabricaCafeCappuccino implements Fabrica {

    @Override
    public ArrayList<Ingrediente> addIngrediente() {
       ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
       ingredientes.add(new CafeSoluvel(100));
       ingredientes.add(new Acucar(200));
       ingredientes.add(new LeiteEmPo(100));
       ingredientes.add(new Bicabornato(1));
       ingredientes.add(new ChocolateEmPo(50));
       ingredientes.add(new Canela(1));
       ingredientes.add(new Agua(100));
       return ingredientes;
    }

    @Override
    public Cafe criarCafe() {
        Cafe cafe = new Cafe(5,addIngrediente());
        return cafe;
    }
    
}
