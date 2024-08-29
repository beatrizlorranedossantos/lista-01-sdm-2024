public class Livro {
    private String titulo;
    private String autor;
    private double preco;
    private String isbn;

    public Livro(String titulo, String autor, double preco, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
        this.isbn = isbn;
    }

    public void imprimirDados() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Preço: R$" + preco);
        System.out.println("ISBN: " + isbn);
    }
}

public class Programa {
    public static void main(String[] args) {
        Livro livro = new Livro("Livro Exemplo", "Autor Exemplo", 59.90, "978-3-16-148410-0");
        livro.imprimirDados();
    }
}
