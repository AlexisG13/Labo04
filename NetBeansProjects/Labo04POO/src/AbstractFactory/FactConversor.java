/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

import Aritmetico.Aritmetico;
import Conversor.Binario;
import Conversor.Conversor;
import Conversor.Hexadecimal;

/**
 *
 * @author uca
 */
public class FactConversor implements AbstractFactory{
    @Override
    public Aritmetico getAritmetico(String tipo){
        return null;
    }
    @Override
    public Conversor getConversor(String tipo){
        switch(tipo){
            case "Binario":
                return new Binario();
            case "Hexadecimal":
                return new Hexadecimal();
        }
        return null;
        }
    
}
