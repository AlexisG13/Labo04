/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conversor;

/**
 *
 * @author Alexis Gómez C. <https://github.com/AlexisG13>
 */
public class Hexadecimal implements Conversor {

    @Override
    public int operacion(int x) {
        return 0;
    }

    @Override
    public String operacion2(int x) {
        char hexaChar[] = {'F', 'E', 'D', 'C', 'B', 'A'};
        String result = ""; 
        int reminder; 
        while (x > 0) {
            reminder = x % 16;
            if (reminder > 9) {
                result = hexaChar[15 - reminder] + result;
            } else {
                result = reminder + result;
            }
            x = x/16;
        }
        return result;
    }
}
