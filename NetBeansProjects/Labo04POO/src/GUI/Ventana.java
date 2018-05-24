/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import AbstractFactory.AbstractFactory;
import AbstractFactory.FactoryProducer;
import AbstractFactory.*;
import Aritmetico.*;
import Conversor.Conversor;

/**
 *
 * @author uca
 */
public class Ventana extends JFrame {

    String rex = "^([+-]?\\d*\\.?\\d*)$";
    private JTextField caja1, caja2, caja3;
    private JButton botonSuma, botonResta, botonDivision, botonMultiplicar,
            botonBinario, botonHexadecimal;

    public Ventana() {
        super("Titulo de la ventana");
        initComponent();
    }
    AbstractFactory factory;

    public void initComponent() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        String y;
        int tipo;
        botonBinario = new JButton("A Binario");
        botonBinario.setBounds(200, 200, 150, 30);
        botonHexadecimal = new JButton("A Hexadecimal");
        botonHexadecimal.setBounds(390, 200, 150, 30);
        caja1 = new JTextField();
        caja1.setBounds(10, 100, 150, 30);
        caja3 = new JTextField("Resultado");
        caja3.setBounds(400, 100, 150, 30);
        botonSuma = new JButton("Sumar");
        botonSuma.setBounds(10, 150, 150, 30);
        botonResta = new JButton("Restar");
        botonResta.setBounds(200, 150, 150, 30);
        botonDivision = new JButton("Dividir");
        botonDivision.setBounds(390, 150, 150, 30);
        botonMultiplicar = new JButton("Multiplicar");
        botonMultiplicar.setBounds(10, 200, 150, 30);
        caja2 = new JTextField();
        caja2.setBounds(200, 100, 150, 30);
        Container contenedor = getContentPane();
        contenedor.add(caja1);
        contenedor.add(botonSuma);
        contenedor.add(botonResta);
        contenedor.add(botonDivision);
        contenedor.add(botonMultiplicar);
        contenedor.add(caja2);
        contenedor.add(caja3);
        contenedor.add(botonBinario);
        contenedor.add(botonHexadecimal);
        botonSuma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                factory = FactoryProducer.getFactory("Aritmetica");
                Aritmetico suma = factory.getAritmetico("Suma");
                float x, num1, num2;
                String conversor, num1S, num2S;
                num1S = caja1.getText();
                num2S = caja2.getText();
                if (num1S.matches(rex)&&num2S.matches(rex)&&!num1S.equals("")&&
                        !num2S.equals("")) {
                    num1 = Float.parseFloat(num1S);
                    num2 = Float.parseFloat(num2S);
                    x = suma.operacion(num1, num2);
                    conversor = String.valueOf(x);
                    caja3.setText(conversor);
                } else {
                    JOptionPane.showMessageDialog(null, "Ingrese un numero!");
                }
            }
        });
        botonResta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                factory = FactoryProducer.getFactory("Aritmetica");
                Aritmetico resta = factory.getAritmetico("Resta");
                float x, num1, num2;
                String conversor, num1S, num2S;
                num1S = caja1.getText();
                num2S = caja2.getText();
                if (num1S.matches(rex)&&!num1S.equals("")&& num2S.matches(rex)&&
                        !num2S.equals("")) {
                    num1 = Float.parseFloat(num1S);
                    num2 = Float.parseFloat(num2S);
                    x = resta.operacion(num1, num2);
                    conversor = String.valueOf(x);
                    caja3.setText(conversor);
                } else {
                    JOptionPane.showMessageDialog(null, "Ingrese un numero!");
                }
            }
        });
        botonDivision.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                factory = FactoryProducer.getFactory("Aritmetica");
                Aritmetico dividir = factory.getAritmetico("Division");
                float x, num1, num2;
                String conversor, num1S, num2S;
                num1S = caja1.getText();
                num2S = caja2.getText();
                if (num1S.matches(rex)&&num2S.matches(rex)&&!num1S.equals("")&&
                        !num2S.equals("")) {
                    num1 = Float.parseFloat(num1S);
                    num2 = Float.parseFloat(num2S);
                    x = dividir.operacion(num1, num2);
                    conversor = String.valueOf(x);
                    caja3.setText(conversor);
                } else {
                    JOptionPane.showMessageDialog(null, "Ingrese un numero!");
                }
            }
        });

        botonMultiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                factory = FactoryProducer.getFactory("Aritmetica");
                Aritmetico multiplicar = factory.getAritmetico("Multiplicacion");
                float x, num1, num2;
                String conversor, num1S, num2S;
                num1S = caja1.getText();
                num2S = caja2.getText();
                if (num1S.matches(rex) && num2S.matches(rex)&&!num1S.equals("")&&
                        !num2S.equals("")) {
                    num1 = Float.parseFloat(num1S);
                    num2 = Float.parseFloat(num2S);
                    x = multiplicar.operacion(num1, num2);
                    conversor = String.valueOf(x);
                    caja3.setText(conversor);
                } else {
                    JOptionPane.showMessageDialog(null, "Ingrese un numero!");
                }
            }
        });
        botonBinario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                factory = FactoryProducer.getFactory("Conversor");
                Conversor binario = factory.getConversor("Binario");
                int x, num1, num2;
                String conversor, num1S, num2S;
                num1S = caja1.getText();
                num2S = caja2.getText();
                if (num1S.matches(rex) && num2S.equals("")&&!num1S.equals("")) {
                    num1 = Integer.parseInt(num1S);
                    x = binario.operacion(num1);
                    conversor = String.valueOf(x);
                    caja3.setText(conversor);
                } else {
                    JOptionPane.showMessageDialog(null, "Ingrese solo el"
                            + " primero numero!");
                }
            }
        });
        botonHexadecimal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                factory = FactoryProducer.getFactory("Conversor");
                Conversor hex = factory.getConversor("Hexadecimal");
                int num1;
                String conversor, num1S, num2S, resultado;
                num1S = caja1.getText();
                num2S = caja2.getText();
                if (num1S.matches(rex)&&num2S.equals("")&&!num1S.equals("")) {
                    num1 = Integer.parseInt(num1S);
                    resultado = hex.operacion2(num1);
                    caja3.setText(resultado);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Ingrese solo el primer"
                            + " numero!");
                }
            }
        });
        setSize(600, 400);
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

}
