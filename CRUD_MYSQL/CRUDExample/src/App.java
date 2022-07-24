import java.sql.*; // Import the JDBC package

public class App {
    public static void main(String[] args) throws Exception {
        // Create a connection to the database
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mundo", "root", "123456789");
        //insert into table city (idcity, nombre, habitantes, pais, cantidad_barrios) values (2, 'Madrid', '3.5M', 'España', 20);
        String sql = "insert into city (idcity, nombre, habitantes, pais, cantidad_barrios) values (4, 'bogota', '3.5M', 'España', 20);";
        Statement stmt = conn.createStatement();
        stmt.executeUpdate(sql);
        System.out.println("Inserted");
        //select * from city;
        sql = "select * from city;";
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            System.out.println(rs.getInt("idcity") + " " + rs.getString("nombre") + " " + rs.getString("habitantes") + " " + rs.getString("pais") + " " + rs.getString("cantidad_barrios"));
        }
        //update city set nombre = 'Bogota' where idcity = 4;
        sql = "update city set nombre = 'Bogota' where idcity = 4;";
        stmt.executeUpdate(sql);
        System.out.println("Updated");
        //select * from city;
        sql = "select * from city;";
        rs = stmt.executeQuery(sql);
        while (rs.next()) {
            System.out.println(rs.getInt("idcity") + " " + rs.getString("nombre") + " " + rs.getString("habitantes") + " " + rs.getString("pais") + " " + rs.getString("cantidad_barrios"));
        }
        //delete from city where idcity = 4;
        sql = "delete from city where idcity = 4;";
        stmt.executeUpdate(sql);
        System.out.println("Deleted");
        
        
    }
}
