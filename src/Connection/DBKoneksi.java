/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author hp
 */
public class DBKoneksi {
    
    public Connection open(){
        Connection con;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://127.0.0.1:3306/ideal weight calculator";
            con = DriverManager.getConnection(url, "root", "");
            return con;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }

}
}
