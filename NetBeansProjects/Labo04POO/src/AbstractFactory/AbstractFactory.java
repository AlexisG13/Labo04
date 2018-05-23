/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

import Aritmetico.Aritmetico;
import Conversor.Conversor;

/**
 *
 * @author uca
 */
public interface AbstractFactory {
    Aritmetico getAritmetico(String tipo);
    Conversor getConversor(String tipo);
}
