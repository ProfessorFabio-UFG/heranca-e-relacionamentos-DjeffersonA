public class Main {
    public static void main(String[] args){
        Loja loja = new Loja();
        
        Funcionario f1 = new Funcionario("Carlos", "Rua A", "1111-2222", "222.333.444-55", 'M', 1, 1001, 3000.0, "Vendedor");
        Funcionario f2 = new Funcionario("Artur", "Rua D", "4444-3333", "222.111.555-66", 'M', 4, 1002, 2500.0, "Estoquista");
        loja.empregar(f1);
        loja.empregar(f2);

        Cliente c1 = new Cliente("Maria", "Rua B", "2222-3333", "999.443.221-10", 'F', 2, 5000.0, "Paisagismo", "Arquiteta");
        Cliente c2 = new Cliente("João", "Rua B", "5555-6666", "999.444.222-11", 'M', 2, 5000.0, "Tecnologia", "Engenheiro Civil");
        loja.cadastrarCliente(c1);
        loja.cadastrarCliente(c2);

        Fornecedor forn1 = new Fornecedor("Fornecedor A Ltda", "Rua C", "9999-9999", "11.222.333/0001-44", "Fornecedor A", "Produtos A");
        Fornecedor forn2 = new Fornecedor("Fornecedor B Ltda", "Rua E", "8888-8888", "22.333.444/0001-55", "Fornecedor B", "Produtos B");
        loja.cadastrarFornecedor(forn1);
        loja.cadastrarFornecedor(forn2);
        
        loja.listarFuncionarios();
        loja.listarClientes();
        loja.listarFornecedores();
        
        loja.demitir(f1);
        loja.listarFuncionarios();
    }
}