package br.com.app.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexao 
{
    public static Connection conexao;
    public static String url = "jdbc:mysql://localhost/play";
    public static String usuario = "root";
    public static String senha = "admin";
    
    public static Connection getConexao()
    {
        if(conexao == null)
        {
            try 
            {
                Class.forName("com.mysql.jdbc.Driver");           
                conexao = DriverManager.getConnection(url, usuario, senha);
            } 
            catch (ClassNotFoundException ex) 
            {
                Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            } 
            catch (SQLException ex) 
            {
                Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            }  
        }    
        
        return conexao;
    }
    
    public static void fecharConexao()
    {
         if(conexao != null)
         {
             try 
             {
                 conexao.close();
                 conexao = null;
             } 
             catch (SQLException ex) 
             {
                 Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
             }
         }
    }
}
