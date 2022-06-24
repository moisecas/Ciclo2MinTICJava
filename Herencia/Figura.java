/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author moise
 */
public class Figura {

    private double area;
    private double perimetro;

    public Figura() {
    }

    public Figura(double area, double perimetro) { //constructor
        this.area = area;
        this.perimetro = perimetro;
    }

    public void setArea(double area) { //leer variables private, get y set, encapsulamiento
        this.area = area;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public double calcularArea() {

        return 0;

    }

    public double calcularPerimetro() { //metodo
        return 0;

    }

}

