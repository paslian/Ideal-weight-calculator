/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ideal.weight.calculator;

import Connection.DBKoneksi;
import Frame.frameLogin;

/**
 *
 * @author hp
 */
public class IdealWeightCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DBKoneksi con = new DBKoneksi();
        System.out.println(con.open());

        frameLogin frame1 = new frameLogin();
        frame1.setLocationRelativeTo(null);
        frame1.setVisible(true);
    }
    
}
