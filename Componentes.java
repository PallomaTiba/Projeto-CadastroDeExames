package com.example.provav2;

// classe que representa todos os componentes da lista
public class Componentes {
    
    //declarando as variáveis
    private String nome;
    private int idade;
    private boolean sexo ;
    private boolean resultado ;
    private boolean itensreduzidos;
   
    
    public  Componentes(String nome, int idade, boolean sexo, boolean resultado){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.resultado = resultado;
    }

    //métodos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public boolean isResultado() {
        return resultado;
    }

    public void setResultado(boolean resultado) {
        this.resultado = resultado;
    }

    public boolean isItensreduzidos() {
        return itensreduzidos;
    }

    public void setItensreduzidos(boolean itensreduzidos) {
        this.itensreduzidos = itensreduzidos;
    }
}
