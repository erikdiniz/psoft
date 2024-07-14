package src;
import java.util.ArrayList;
import java.util.List;

public class PessoaController {
    private PessoaRepository repository;

    public PessoaController(){
        this.repository = new PessoaRepository();
    }

    public void createPessoa(String nome, String cpf, int idade, String telefone, String profissao, List enderecos){
        Pessoa pessoa = new Pessoa(nome, cpf, idade, telefone, profissao, (ArrayList) enderecos);

        if ((repository.findByCpf(cpf) == null) && cpf.length() == 11)
            repository.save(pessoa);
    }

    public void deletePessoa(String cpf){
        repository.deleteByCPF(cpf);
    }

    public Pessoa getPessoaByCpf(String cpf){
        return repository.findByCpf(cpf);
    }

    public List<Pessoa> getAllPessoas(){
        return repository.findAll();
    }

}