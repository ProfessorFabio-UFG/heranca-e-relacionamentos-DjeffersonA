public class Funcionario extends PessoaFisica {
    private int matricula;
    private double salario;
    private String cargo;

    public Funcionario(String nome, String endereco, String telefone, String cpf, char sexo, int estadoCivil, int matricula, double salario, String cargo) {
        super(nome, endereco, telefone, cpf, sexo, estadoCivil);
        this.matricula = matricula;
        this.salario = salario;
        this.cargo = cargo;
    }
    
    @Override
    public String toString() {
        return "Nome: " + nome + ", " +
               "Endereço: " + endereco + ", " +
               "Telefone: " + telefone + ", " +
               "CPF: " + cpf + ", " +
               "Sexo: " + sexo + ", " +
               "Estado Civil: " + estadoCivil + "\n" +
               "Matricula: " + matricula+ ", " +
               "Salário: R$ " + String.format("%.2f", salario) + ", " +
               "Cargo: " + cargo + "\n" +
               "=========================================================";
    }
}
