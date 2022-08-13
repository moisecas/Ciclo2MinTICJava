// Realice un applet llamado AppletManejadores, el cual despliegue tres campos de texto y varios botones para realizar operaciones con los campos de texto. Los campos son X, Y y RESULTADO. Cada operación aritmética será de X como primer operando y Y como segundo operando. El texto que corresponde a resultado deberá quitársele la facilidad de ser editable, utilizando el método setEditable para ese texto.
// El applet deberá tener una serie de botones para realizar las operaciones aritméticas.

import java.awt.*;
import javax.swing.*;
import java.applet.*;
import java.awt.event.*;
import java.awt.event.ActionListener; 

public class AppletManejadores extends Applet implements ActionListener{
    JTextField txtX, txtY, txtResultado;
    JButton btnSuma, btnResta, btnMultiplicacion, btnDivision;
    public void init(){
        setLayout(new FlowLayout());
        txtX = new JTextField(10);
        txtY = new JTextField(10);
        txtResultado = new JTextField(10);
        btnSuma = new JButton("+");
        btnResta = new JButton("-");
        btnMultiplicacion = new JButton("*");
        btnDivision = new JButton("/");
        add(txtX);
        add(txtY);
        add(txtResultado);
        add(btnSuma);
        add(btnResta);
        add(btnMultiplicacion);
        add(btnDivision);
        btnSuma.addActionListener(this);
        btnResta.addActionListener(this);
        btnMultiplicacion.addActionListener(this);
        btnDivision.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==btnSuma){
            int x = Integer.parseInt(txtX.getText());
            int y = Integer.parseInt(txtY.getText());
            int resultado = x + y;
            txtResultado.setText(String.valueOf(resultado));
        }
        if(e.getSource()==btnResta){
            int x = Integer.parseInt(txtX.getText());
            int y = Integer.parseInt(txtY.getText());
            int resultado = x - y;
            txtResultado.setText(String.valueOf(resultado));
        }
        if(e.getSource()==btnMultiplicacion){
            int x = Integer.parseInt(txtX.getText()); 
            int y = Integer.parseInt(txtY.getText());
            int resultado = x * y;
            txtResultado.setText(String.valueOf(resultado));
        }
        if(e.getSource()==btnDivision){
            int x = Integer.parseInt(txtX.getText());
            int y = Integer.parseInt(txtY.getText());
            int resultado = x / y;
            txtResultado.setText(String.valueOf(resultado));
        }
    }
}

