import java.util.ArrayList;
import java.util.List;

public class Loja {
    private List<Funcionario> funcionarios = new ArrayList<>();
    private List<Cliente> clientes = new ArrayList<>();
    private List<Fornecedor> fornecedores = new ArrayList<>();

    public void empregar(Funcionario f){
        funcionarios.add(f);
    }

    public void demitir(Funcionario f){
        funcionarios.remove(f);
    }

    public void cadastrarCliente(Cliente c){
        clientes.add(c);
    }

    public void cadastrarFornecedor(Fornecedor f){
        fornecedores.add(f);
    }

    public void listarClientes(){
        System.out.println("======================= Clientes =======================");
        for(Cliente c : clientes){
            System.out.println(c);
        }
        System.out.println();
    }

    public void listarFuncionarios(){
        System.out.println("====================== Funcionários =====================");
        for(Funcionario f : funcionarios){
            System.out.println(f);
        }
        System.out.println();
    }

    public void listarFornecedores(){
        System.out.println("====================== Fornecedores =====================");
        for(Fornecedor f : fornecedores){
            System.out.println(f);
        }
        System.out.println();
    }
}
