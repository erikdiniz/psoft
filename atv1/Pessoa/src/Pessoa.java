package src;
import java.util.ArrayList;
import java.util.List;

public class Pessoa{
    private String nome;
    private String cpf;
    private int idade;
    private String telefone;
    private String profissao;
    private List endereco;

    public Pessoa(String nome, String cpf, int idade, String telefone, String profissao, ArrayList endereco){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.telefone = telefone;
        this.profissao = profissao;
        this.endereco = endereco;
    }

    public String getNome(){
        return this.nome;
    }

    public String getCPF(){
        return this.cpf;
    }
    
    public int getIdade(){
        return this.idade;
    }

    public String getTelefone(){
        return this.telefone;
    }

    public String getProfissao(){
        return this.profissao;
    }

    public List getEndereco(){
        return this.endereco;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public void setProfissao(String profissao){
        this.profissao = profissao;
    }

    public void setEndereco(List endereco){
        this.endereco = endereco;
    }
}