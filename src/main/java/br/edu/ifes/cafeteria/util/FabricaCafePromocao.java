/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.cafeteria.util;

import br.edu.ifes.cafeteria.cdp.*;

/**
 *
 * @author Douglas
 */
public class FabricaCafePromocao {
    public static Cafe criarCafe(String diaSemana ){
        Cafe cafe;
        Fabrica fabrica;
        switch (diaSemana){
            case "segundaFeira":
                fabrica = new FabricaCafeSimples();
                break;
            case "tercaFeira":
                fabrica = new FabricaCafeDescafeinado();
                break;
            case "quartaFeira":
                fabrica = new FabricaCafeSimples();
                break;
            case "quintaFeira":
                fabrica = new FabricaCafeDescafeinado();
                break;
            case "sextaFeira":
                fabrica = new FabricaCafeSimples();
                break;
            case "sabado":
                fabrica = new FabricaCafeDescafeinado();
                break;
            case "domingo":
                fabrica = new FabricaCafeCappuccino();
                break;
            default:
                throw new IllegalArgumentException("Este não é um dia válido!");
                
        }
        cafe = fabrica.criarCafe();
        cafe.setPreco(cafe.getPreco()/2);
        return cafe;
        
    }
        
                
    }
    

