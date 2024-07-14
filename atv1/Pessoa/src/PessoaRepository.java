package src;
import java.util.ArrayList;
import java.util.List;

public class PessoaRepository {
    private List<Pessoa> pessoas;
    
    public PessoaRepository(){
        this.pessoas = new ArrayList<Pessoa>();
    }

    public List<Pessoa> findAll(){
        return pessoas;
    }

    public Pessoa findByCpf(String cpf){
        for (int i = 0; i < pessoas.size(); i++){
            if (pessoas.get(i).getCPF().equals(cpf))
                return pessoas.get(i);
        }

        return null;
    }

    public void save(Pessoa pessoa){
        this.pessoas.add(pessoa);
    }

    public void deleteByCPF(String cpf){
        Pessoa p = findByCpf(cpf);

        if (p != null)
            pessoas.remove(p);
    }

    public void update(Pessoa newPessoa){
        Pessoa p = findByCpf(newPessoa.getCPF());

        if (p != null){
            p.setIdade(newPessoa.getIdade());
            p.setProfissao(newPessoa.getProfissao());
            p.setTelefone(newPessoa.getTelefone());
            p.setEndereco(newPessoa.getEndereco());
        }
    }
}