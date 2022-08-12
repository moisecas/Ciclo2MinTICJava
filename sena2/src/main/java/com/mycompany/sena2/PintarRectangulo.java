
package com.mycompany.sena2;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;


public class PintarRectangulo extends Applet {
    private Label labAncho,labAlto; 
    private TextField txtAncho,txtAlto;
    private Choice lstColor; 
    private Button btnPintar, btnLimpiar; 
    
    private boolean pintar; 
    private Color coloAUsar ;
    
    public PintarRectangulo(){ //constructor 
        labAncho = new Label("Ancho");
        labAlto = new Label ("Alto"); 
        txtAncho = new TextField(5); 
        txtAlto = new TextField(5); 
        lstColor = new Choice(); 
        btnPintar = new Button("Pintar"); 
        btnLimpiar = new Button("Limpiar"); //agregar elementos a interfaz
        
        lstColor.add("Rojo"); 
        lstColor.add("naranjado"); 
        lstColor.add("negro"); 
        lstColor.add("cyan"); 
        lstColor.add("verde"); 
        lstColor.add("amarillo"); 
        lstColor.add("morado"); 
        lstColor.add("azul"); 
        
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
    
    public void init(){
        resize(600,400); 
        pintar=false; 
    }
    
    public void paint(Graphics g){
        int x,y;
        int ancho, alto; 
        if(pintar == true){
            ancho = Integer.parseInt(txtAncho.getText()); 
            alto = Integer.parseInt(txtAlto.getText()); 
            
            //fijar color para graficar
            g.setColor(Color.BLACK);
            x = 40; y = 100; 
            g.drawString("Rectangulo ["+ancho+" x "+alto+"]", x,y); 
            
            //pintar el rectangulo relleno
            x = 100; y=90; 
            g.setColor(coloAUsar);
            g.fillRect(x,y,ancho,alto); 
        }
    }
    
    public void actionPerformed (ActionEvent e){
        if (e.getSource()==btnPintar){
            pintar=true;
            String colorSeleccionado = lstColor.getSelectedItem(); 
            if(colorSeleccionado.equalsIgnoreCase("Rojo")){
                coloAUsar = Color.RED;                 
            }else if(colorSeleccionado.equalsIgnoreCase("Naranjado")){
                coloAUsar = Color.ORANGE; 
            }else if(colorSeleccionado.equalsIgnoreCase("Negro")){
                coloAUsar = Color.black; 
            }else if(colorSeleccionado.equalsIgnoreCase("cyan")){
                coloAUsar = Color.cyan;  
            }else if(colorSeleccionado.equalsIgnoreCase("verde")){
                coloAUsar = Color.GREEN; 
            }else if(colorSeleccionado.equalsIgnoreCase("amarillo")){
                coloAUsar = Color.YELLOW; 
            }else if(colorSeleccionado.equalsIgnoreCase("morado")){
                coloAUsar = Color.MAGENTA; 
            }else if(colorSeleccionado.equalsIgnoreCase("azul")){
                coloAUsar = Color.BLUE;  
            }
         if (e.getSource() == btnLimpiar){
             pintar = false; 
             txtAncho.setText(""); 
             txtAlto.setText("");
             
         }
         repaint(); 
        }
        
            
    
    }

    private void resize(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  

    
    
}
