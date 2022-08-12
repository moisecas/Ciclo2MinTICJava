/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sena2;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Label;
import java.awt.TextField;

/**
 *
 * @author moise
 */
public class Applet {
    private Label labAncho,labAlto;
    private TextField txtAncho,txtAlto;
    private Choice lstColor;
    private Button btnPintar, btnLimpiar;
    private boolean pintar;
    private Color coloAUsar ;
    //constructor
    public Applet(){
        labAncho = new Label("Ancho");
        labAlto = new Label ("Alto");
        txtAncho = new TextField(5);
        txtAlto = new TextField(5);
        lstColor = new Choice();
        btnPintar = new Button("Pintar");
        btnLimpiar = new Button("Limpiar"); //agregar elementos a interfaz
        lstColor.add("Rojo");
        lstColor.add("naranjado");
        lstColor
        add(labAncho);
        add(txtAncho);
        add(labAlto);
        add(txtAlto);
        add(lstColor);
        add(btnPintar);
        add(btnLimpiar);
        btnPintar.addActionListener(this);
        btnLimpiar.addActionListener(this);
}
}
