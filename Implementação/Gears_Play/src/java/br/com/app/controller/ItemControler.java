package br.com.app.controller;

import br.com.app.dao.ItemDAO;
import br.com.app.model.Item;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean
public class ItemControler 
{
    private List <Item> listaItens = new ArrayList<>();
    private Item item = new Item();
    private ItemDAO itemDAO = new ItemDAO();
    
    public void adicionar() throws SQLException   
    {
        listaItens.add(item);
        itemDAO.adcionar(item);
        item = new Item();
    }
    
    public void listagem()
    {
       listaItens = itemDAO.listar();
    }
    
    public void editar(Item i)
    {
        item = i;
    }

    public Item getItem() 
    {
        return item;
    }

    public void setItem(Item item) 
    {
        this.item = item;
    }

    public List<Item> getListaItens() 
    {
        return listaItens;
    }

    public void setListaItens(List<Item> listaItens) 
    {
        this.listaItens = listaItens;
    }
}
