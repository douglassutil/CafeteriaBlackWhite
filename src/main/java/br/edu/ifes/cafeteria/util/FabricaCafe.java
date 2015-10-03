/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.cafeteria.util;

import br.edu.ifes.cafeteria.cdp.*;
import java.util.HashMap;

/**
 *
 * @author Douglas
 */
public class FabricaCafe {
    private static HashMap<String,Fabrica> tipoCafe = new HashMap<>();
    public FabricaCafe(){
        tipoCafe.put("CafeSimples", new FabricaCafeSimples());
        tipoCafe.put("CafeDescafeinado", new FabricaCafeDescafeinado());
        tipoCafe.put("CafeCappuccino", new FabricaCafeCappuccino());
        System.out.println("Entrei Fabrica Cafe");
    }
    public static Cafe criarCafe(String tipo){
        System.out.println("Entrei criarCafe");
        Fabrica fabrica = tipoCafe.get(tipo);
        Cafe cafe = fabrica.criarCafe();
        System.out.println(cafe.getPreco());
        return cafe;
        
    }
}
