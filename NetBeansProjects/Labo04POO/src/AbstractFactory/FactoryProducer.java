/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

/**
 *
 * @author uca
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String tipo){
        switch(tipo){
            case "Aritmetica":
                return new FactAritmetico();
            case "Conversor":
                return new FactConversor();
        }
        return null;
        }
    }

