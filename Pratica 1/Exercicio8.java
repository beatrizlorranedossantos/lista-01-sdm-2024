public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;
    private String endereco;

    public Pessoa(String nome, int idade, String cpf, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("CPF: " + cpf);
        System.out.println("Endereço: " + endereco);
    }
}

public class Programa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Fulano de Tal", 30, "123.456.789-00", "Rua Exemplo, 123");
        pessoa.imprimirDados();
    }
}
