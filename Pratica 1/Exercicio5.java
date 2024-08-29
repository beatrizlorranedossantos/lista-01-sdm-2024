public class Universidade {
    private String nome;
    private String cnpj;
    private String endereco;
    private int qtdeSalas;

    public Universidade(String nome, String cnpj, String endereco, int qtdeSalas) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.qtdeSalas = qtdeSalas;
    }

    public void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Endereço: " + endereco);
        System.out.println("Quantidade de Salas: " + qtdeSalas);
    }
}

public class Programa {
    public static void main(String[] args) {
        Universidade universidade = new Universidade("Universidade Exemplo", "12.345.678/0001-99", "Rua Exemplo, 123", 50);
        universidade.imprimirDados();
    }
}
