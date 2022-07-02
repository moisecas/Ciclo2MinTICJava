package ejerciciopoo.clases;

public class Rectangulos {
    public int base;
    public int altura;


    
    public Rectangulos() {//constructor, no retorna nada
        System.out.println(base);
        System.out.println(altura);
    }
    //metodo area de un rectangulo
    public int area(int base, int altura) { //b = base, a = altura, parametros que entran a la función
        this.base=base; //asignando los datos a sus atributos
        this.altura=altura; //this hace referencia a la clase en la que estamos trabajando
        return this.base * this.altura; //retorna el valor de la base * la altura del rectangulo
    }
    //metodo perimetro de un rectangulo
    public int perimetro(int base, int altura) { //b = base, a = altura, parametros que entran a la función
        this.base=base; //asignando los datos a sus atributos
        this.altura=altura; //this hace referencia a la clase en la que estamos trabajando
        return 2 * (this.base + this.altura); //retorna el valor de la base * la altura del rectangulo
    }
}
