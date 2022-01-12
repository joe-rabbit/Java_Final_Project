/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package busbookingsys;
import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author Anirudh
 */
public class dbConnection {
    public static Connection connect(){
        Connection conn=null;
        try{
         conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/super?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
         Component rootPane=null;
         System.out.println("Connected");
         
            
        }catch(Exception ex){
          JOptionPane.showMessageDialog(null, ex);
            
            
        }
        
        return conn;
    }

}
