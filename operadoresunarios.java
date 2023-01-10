public class operadoresunarios {
    public static void main (String[] args){
        var a = 3;
        var b = -a;
        System.out.println("b = " + b);

        var c = true;
        var d = !c; //invertir el valor de la variable c, solo sirve para booleanos
        System.out.println("d = " + d);

        //incremento
        //preincremento
        var e = 3;
        var f = ++e; //primero se incrementa la variable e y luego se asigna el valor a la variable f
        System.out.println("e = " + e);
        System.out.println("f = " + f);

        //postincremento
        var g = 5;
        var h = g++; //primero se asigna el valor de la variable g a la variable h y luego se incrementa la variable g
        System.out.println("g = " + g);
        System.out.println("h = " + h);

        //decremento
        //predecremento
        var i = 2;
        var j = --i; //primero se decrementa la variable i y luego se asigna el valor a la variable j
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //postdecremento
        var k = 4;
        var l = k--; //primero se asigna el valor de la variable k a la variable l y luego se decrementa la variable k
        System.out.println("k = " + k);
        System.out.println("l = " + l);
        

    }
}
