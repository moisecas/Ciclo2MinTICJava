package inicio;
public class operadores {
    public static void main (String[] args){
        var a = 3;
        var b = 2;
        var c = a + b; //asignación de valor a la variable c con el resultado de la suma de a y b 
        int d = 1; //incremento de 1 en la variable d 
        d+=3; //incremento de 3 en la variable d, operador de composición 
        d-=2; //decremento de 2 en la variable d, operador de composición
        d*=2; //incremento de 2 en la variable d, operador de composición
        d/=2; //decremento de 2 en la variable d, operador de composición
        d%=2; //decremento de 2 en la variable d, operador de composición
        
        System.out.println("c = " + c);
        c = a - b;
        System.out.println("c = " + c);
        c = a * b;
        System.out.println("c = " + c);
        c = a / b;
        System.out.println("c = " + c);
        c = a % b;
        System.out.println("c = " + c);
        c = a + 1;
        System.out.println("c = " + c);
        c++;
        System.out.println("c = " + c);
        c--;
        System.out.println("c = " + c);
        c += 2;
        System.out.println("c = " + c);
        c -= 2;
        System.out.println("c = " + c);
        c *= 2;
        System.out.println("c = " + c);
        c /= 2;
        System.out.println("c = " + c);
        c %= 2;
        System.out.println("c = " + c);
        c = a + b * c;
        System.out.println("c = " + c);
        c = (a + b) * c;
        System.out.println("c = " + c);
        c = a + b / c;
        System.out.println("c = " + c);
        c = (a + b) / c;
        System.out.println("c = " + c);
        c = a + b % c;
        System.out.println("c = " + c);
        c = (a + b) % c;
        System.out.println("c = " + c);
        c = -a;
        System.out.println("c = " + c);
        c = +a;
        System.out.println("c = " + c);
        c = a++;
        System.out.println("c = " + c);
        c = ++a;
        System.out.println("c = " + c);
        c = a--;
        System.out.println("c = " + c);
        c = --a;
        System.out.println("c = " + c);
        c = a + 5 - 3;
        System.out.println("c = " + c);
        c = a + 5 - 3 * 2;
        System.out.println("c = " + c);
    }
}
