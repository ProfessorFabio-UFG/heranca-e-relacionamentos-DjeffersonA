public class Cliente extends PessoaFisica {
    private double renda;
    private String interesses;
    private String profissao;

    public Cliente(String nome, String endereco, String telefone, String cpf, char sexo, int estadoCivil, double renda, String interesses, String profissao) {
        super(nome, endereco, telefone, cpf, sexo, estadoCivil  );
        this.renda = renda;
        this.interesses = interesses;
        this.profissao = profissao;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", " +
               "Endereço: " + endereco + ", " +
               "Telefone: " + telefone + ", " +
               "CPF: " + cpf + ", " +
               "Sexo: " + sexo + ", " +
               "Estado Civil: " + estadoCivil + "\n" +
               "Renda: R$ " + String.format("%.2f", renda) + ", " +
               "Profissão: " + profissao + ", " +
               "Interesses: " + interesses + "\n" +
               "========================================================";
    }
}
