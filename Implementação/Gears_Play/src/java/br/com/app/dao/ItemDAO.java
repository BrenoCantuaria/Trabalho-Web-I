package br.com.app.dao;

import br.com.app.database.Conexao;
import br.com.app.model.Item;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ItemDAO 
{
    public void adcionar(Item produto) throws SQLException
    {
        try
        {
            Connection conexao = Conexao.getConexao();
            
            //conexao.setAutoCommit(false);
            
            PreparedStatement inserir = (PreparedStatement) conexao.prepareStatement("INSERT INTO `play`.`item` (`nome`, `valor`, `desenvolvedor`) VALUES (?, ?, ?)"); 
            
            inserir.setString(1, produto.getNome());
            inserir.setFloat(2, produto.getValor());
            inserir.setString(3, produto.getDesenvolvedor());

            inserir.execute();
           
            Conexao.fecharConexao();
            
            //conexao.commit();
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(ItemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Item> listar() 
    { 
        try 
        {
            Connection conexao = Conexao.getConexao();
            
            PreparedStatement ps = (PreparedStatement) conexao.prepareStatement("SELECT * FROM item");
            
            ResultSet resultset = ps.executeQuery();
            
            List<Item> itens = new ArrayList<>();
            
            while(resultset.next())
            {
                Item item = new Item();
                item.setCod_item(resultset.getInt("cod_item"));
                item.setNome(resultset.getString("nome"));
                item.setValor(resultset.getFloat("valor"));
                item.setDesenvolvedor(resultset.getString("desenvolvedor"));
                itens.add(item);
            }
           return itens;
                     
        } catch (SQLException ex) {
            Logger.getLogger(ItemDAO.class.getName()).log(Level.SEVERE, null, ex);
            
            Conexao.fecharConexao();
            
            return null;
        }      
    }
}
