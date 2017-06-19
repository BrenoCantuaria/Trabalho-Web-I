package br.com.app.model;

public class Funcionario 
{
    //Atributos da classe
    private int cod_funcionario;
    private String nome;
    private String RG;
    private String CPF;
    private String cargo;

    //Getter's e Setter's da classe
    public int getCod_funcionario() 
    {
        return cod_funcionario;
    }

    public void setCod_funcionario(int cod_funcionario) 
    {
        this.cod_funcionario = cod_funcionario;
    }

    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public String getRG() 
    {
        return RG;
    }

    public void setRG(String RG) 
    {
        this.RG = RG;
    }

    public String getCPF() 
    {
        return CPF;
    }

    public void setCPF(String CPF) 
    {
        this.CPF = CPF;
    }

    public String getCargo() 
    {
        return cargo;
    }

    public void setCargo(String cargo) 
    {
        this.cargo = cargo;
    }
}
