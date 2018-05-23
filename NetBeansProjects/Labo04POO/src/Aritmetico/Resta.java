/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aritmetico;

/**
 *
 * @author uca
 */
public class Resta implements Aritmetico {
    @Override
    public float operacion(float x,float y){
        float z;
        z= x-y;
        return z;
    }
}
