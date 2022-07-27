

package com.mycompany.jdbcmascotas;

import java.sql.*; 


public class Jdbcmascotas {

    public static void main(String[] args) {
        final String URL = "jdbc:mysql://localhost:3306/mascotas";
        final String USER = "root";
        final String PASS = "123456789";
        
        try {
            Connection conn = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("Conectado exitosamente");
            // Mediante: Statement
            Statement st = conn.createStatement();
            String sqlStatement = "SELECT * FROM responsable";
            ResultSet rs = st.executeQuery(sqlStatement);
            
            System.out.println("Resultado del query:");
            while(rs.next()) {
                int id = rs.getInt("id");
                String nombres = rs.getString("nombres");
                String apellidos = rs.getString("apellidos");
                int edad = rs.getInt("edad");
                System.out.println("Id: " + String.valueOf(id) + " | nombres: " + nombres);
            }
            
            String queryMascotas = "SELECT * FROM mascota";
            ResultSet rs2 = st.executeQuery(queryMascotas);
            System.out.println("-------------\nResultados Mascotas");
            while(rs2.next()) {
                System.out.println("Nombre mascota: " + rs2.getString("nombre"));
            }
        } catch (Exception e) {
            System.err.println("Algo falló");
            e.printStackTrace();
        }
    }
}
