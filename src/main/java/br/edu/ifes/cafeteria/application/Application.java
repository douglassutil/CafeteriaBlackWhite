/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.cafeteria.application;

import br.edu.ifes.cafeteria.cdp.*;
import br.edu.ifes.cafeteria.util.*;

/**
 *
 * @author Douglas
 */
public class Application {
    
    public static void main(String args []){
        FabricaCafe fc = new FabricaCafe();
        Cafe cafe = fc.criarCafe("CafeSimples");
        cafe.ImprimirIngrediente();
        
        Cafe cafesss = FabricaCafePromocao.criarCafe("segundaFeira");
    }
    
}
