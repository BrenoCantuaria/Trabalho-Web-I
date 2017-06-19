package br.com.app.model;

public class Venda 
{
    //Atributos que compoem a VENDA DO ITEM  
    private int cod_venda;
    private String nome_produto;
    private int qtd;
    private float valorTotal;

    //Métodos Getters e Setters
    public int getCod_venda() 
    {
        return cod_venda;
    }

    public void setCod_venda(int cod_venda) 
    {
        this.cod_venda = cod_venda;
    }

    public String getNome_produto() 
    {
        return nome_produto;
    }

    public void setNome_produto(String nome_produto) 
    {
        this.nome_produto = nome_produto;
    }

    public int getQtd()
    {
        return qtd;
    }

    public void setQtd(int qtd) 
    {
        this.qtd = qtd;
    }

    public float getValorTotal() 
    {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) 
    {
        this.valorTotal = valorTotal;
    }
}
