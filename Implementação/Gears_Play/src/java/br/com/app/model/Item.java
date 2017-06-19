package br.com.app.model;

public class Item 
{   
    //Atributos que compoem o ITEM  
    private int cod_item;
    private String nome;
    private float valor;
    private String desenvolvedor;
    
    //Métodos Getters e Setters
    public int getCod_item() 
    {
        return cod_item;
    }

    public void setCod_item(int cod_item) 
    {
        this.cod_item = cod_item;
    }

    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public float getValor() 
    {
        return valor;
    }

    public void setValor(float valor) 
    {
        this.valor = valor;
    }

    public String getDesenvolvedor() 
    {
        return desenvolvedor;
    }

    public void setDesenvolvedor(String desenvolvedor) 
    {
        this.desenvolvedor = desenvolvedor;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + this.cod_item;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Item other = (Item) obj;
        if (this.cod_item != other.cod_item) {
            return false;
        }
        return true;
    }
    
    
}
