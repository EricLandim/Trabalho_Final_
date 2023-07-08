package trabalhoFinal;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private int numExemplaresDisponiveis;
    private int numExemplaresTotal;

    public Livro(String titulo, String autor, int anoPublicacao, int numExemplaresTotal) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.numExemplaresTotal = numExemplaresTotal;
        this.numExemplaresDisponiveis = numExemplaresTotal;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public int getNumExemplaresDisponiveis() {
        return numExemplaresDisponiveis;
    }

    public void emprestar() {
        if (numExemplaresDisponiveis > 0) {
            numExemplaresDisponiveis--;
            System.out.println("Livro emprestado: " + titulo);
        } else {
            System.out.println("Não há exemplares disponíveis para empréstimo do livro: " + titulo);
        }
    }

    public void devolver() {
        if (numExemplaresDisponiveis < numExemplaresTotal) {
            numExemplaresDisponiveis++;
            System.out.println("Livro devolvido: " + titulo);
        } else {
            System.out.println("Todos os exemplares do livro já estão disponíveis na biblioteca: " + titulo);
        }
    }
}

