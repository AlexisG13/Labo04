/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

import AbstractFactory.AbstractFactory;
import Aritmetico.Aritmetico;
import Aritmetico.Division;
import Aritmetico.Multiplicacion;
import Aritmetico.Resta;
import Aritmetico.Suma;
import Conversor.Conversor;

/**
 *
 * @author uca
 */
public class FactAritmetico implements AbstractFactory {
    @Override
    public Conversor getConversor(String tipo){
        return null;
    }
    @Override
    public Aritmetico getAritmetico(String tipo){
        switch(tipo){
            case "Suma":
                return new Suma();
            case "Resta":
                return new Resta();
            case "Multiplicacion":
                return new Multiplicacion();
            case "Division":
                return new Division();
        }
        return null;
        }
    }

