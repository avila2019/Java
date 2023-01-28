package Loja_Livro;

public class Livros  {
    private int codigo;
    private String titulo;
    private String autor;
    private String isbn;
    private int numeroDePaginas;
    private double valorDoLivro;
    private String edicao;
    private String volume;
    

   // CONSTRUTOR VAZIO 

    public Livros() {

    }

    // CONSTRUTOR 

    public Livros( int codigo, String titulo, String autor,
            String isbn, int numeroDePaginas, double valorDoLivro,
            String edicao, String volume) {
        
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.numeroDePaginas = numeroDePaginas;
        this.valorDoLivro = valorDoLivro;
        this.edicao = edicao;
        this.volume = volume;
        
    }

    // GET E SET 

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public double getValorDoLivro() {
        return valorDoLivro;
    }

    public void setValorDoLivro(double valorDoLivro) {
        this.valorDoLivro = valorDoLivro;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

   

}
