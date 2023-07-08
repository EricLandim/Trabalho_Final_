package trabalhoFinal;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private int identificacao;
    private List<Livro> livrosEmprestados;

    public Usuario(String nome, int identificacao) {
        this.nome = nome;
        this.identificacao = identificacao;
        this.livrosEmprestados = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public int getIdentificacao() {
        return identificacao;
    }

    public List<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void emprestarLivro(Livro livro) {
        if (livrosEmprestados.contains(livro)) {
            System.out.println("Você já possui uma cópia deste livro: " + livro.getTitulo());
        } else {
            livro.emprestar();
            livrosEmprestados.add(livro);
        }
    }

    public void devolverLivro(Livro livro) {
        if (livrosEmprestados.contains(livro)) {
            livro.devolver();
            livrosEmprestados.remove(livro);
        } else {
            System.out.println("Você não possui este livro emprestado: " + livro.getTitulo());
        }
    }
}

