public class Fornecedor extends PessoaJuridica {
    private String produtos;

    public Fornecedor(String nome, String endereco, String telefone, String cnpj, String razaoSocial, String produtos){
        super(nome, endereco, telefone, cnpj, razaoSocial);
        this. produtos = produtos;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", " +
               "Endereço: " + endereco + ", " +
               "Telefone: " + telefone + ", " +
               "CNPJ: " + cnpj + "\n" +
               "Razão Social: " + razaoSocial+ ", " +
               "Produtos: " + produtos + "\n" +
               "=========================================================";
    }
}
