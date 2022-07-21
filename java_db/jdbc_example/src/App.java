import java.sql.*; // Import the JDBC package

public class App {
    public static void main(String[] args) throws Exception {
        // Create a connection to the database
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mundo", "root", "123456789"); 
        //connection se usa para hacer las consultas a la base de datos y para crear las tablas y los campos que necesitamos en la base de datos 
        // Create a statement
        Statement stmt = conn.createStatement(); // Statement es una clase que se usa para hacer las consultas a la base de datos
        // Execute the query
        ResultSet rs = stmt.executeQuery("SELECT * FROM city"); // ResultSet es una clase que se usa para guardar los resultados de las consultas a la base de datos
        // Print the results
        while (rs.next()) { // rs.next() es un metodo que se usa para avanzar a la siguiente fila de la tabla, mientras que rs.next() este metodo devuelve true, es decir, si hay una fila siguiente, entonces se imprime la fila
            System.out.println(rs.getString("nombre") + " " + rs.getString("habitantes"));
        }
        // Close the connection
        conn.close(); // Cierra la conexion con la base de datos y libera los recursos que se estan usando en ella
    
    }
       
}
