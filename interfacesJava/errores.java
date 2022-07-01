package interfacesJava;

public class errores {
    
    
    public static void suma() throws Exception {

        try {

            System.out.println("Intentamos ejecutar el bloque de instrucciones:");
            System.out.println("Instrucción 1.");
            System.out.println("Instrucción 2.");
            int n = Integer.parseInt("M"); 
            System.out.println("Instrucción 3, etc.");

        } catch (Exception e) {
            System.err.println("Instrucciones a ejecutar cuando se produce un error");
            throw new Exception("Mi excepcion");
        } finally {
            System.out.println("Instrucciones a ejecutar finalmente tanto si se producen errores como si no.");
        }

    }

    public static void main(String[] args) throws Exception {

        suma();
    }
    
}

