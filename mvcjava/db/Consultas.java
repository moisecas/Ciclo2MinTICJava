package mvcjava.db;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;

import java.sql.ResultSet;



public class Consultas {
    //conexion a base de datos
    public static void Consulta(){ 
        String URL = "jdbc:mysql://localhost:3306/mundo?zeroDateTimeBehavior=CONVERT_TO_NULL";
    String USER = "root";
    String PASSWORD = "123456789";
    String selectAll= "SELECT * FROM vendedores"; 

    //try catch para conectar a base de datos
    try {
        Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(selectAll); 

        while (rs.next()) {
            String apellidos = rs.getString("apellidos");
            String nombre = rs.getString("nombres");

            System.out.println(apellidos + " " + nombre); 
        }
    }   catch (Exception e) {

            System.out.println("Error: " + e);
    }
        };

    public void insertVendedores() {
        String URL = "jdbc:mysql://localhost:3306/mundo?zeroDateTimeBehavior=CONVERT_TO_NULL";
        String USER = "root";
        String PASSWORD = "123456789";
        String insertVendedores = "INSERT INTO vendedores (documento_vendedor, nombres, apellidos, ciudad) VALUES ( '123456789', 'Juan', 'Perez', 'Bogota')";
        //try catch para conectar a base de datos
        try {

            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            Statement st = con.createStatement();
            st.executeUpdate(insertVendedores);
               

        }catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }
    public void updateVendedores() {
        String URL = "jdbc:mysql://localhost:3306/mundo?zeroDateTimeBehavior=CONVERT_TO_NULL";
        String USER = "root";
        String PASSWORD = "123456789";
        String updateVendedores = "UPDATE vendedores SET nombres = 'José' WHERE documento_vendedor = '123456789'";
        //try catch para conectar a base de datos
        try {

            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            Statement st = con.createStatement();
            st.executeUpdate(updateVendedores);
               

        }catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }

    public void deleteVendedores() {
        String URL = "jdbc:mysql://localhost:3306/mundo?zeroDateTimeBehavior=CONVERT_TO_NULL";
        String USER = "root";
        String PASSWORD = "123456789";
        String deleteVendedores = "DELETE FROM vendedores WHERE documento_vendedor = '123456789'";
        //try catch para conectar a base de datos
        try {

            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            Statement st = con.createStatement();
            st.executeUpdate(deleteVendedores);
               

        }catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }
    }

    

    
        
    


