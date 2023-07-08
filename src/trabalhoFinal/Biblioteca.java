package trabalhoFinal;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> acervo;
    private List<Usuario> usuarios;

    public Biblioteca() {
        this.acervo = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        acervo.add(livro);
        System.out.println("Livro adicionado ao acervo: " + livro.getTitulo());
    }

    public void removerLivro(Livro livro) {
        acervo.remove(livro);
        System.out.println("Livro removido do acervo: " + livro.getTitulo());
    }

    public Livro pesquisarLivro(String titulo) {
        for (Livro livro : acervo) {
            if (livro.getTitulo().equals(titulo)) {
                return livro;
            }
        }
        return null;
    }

    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("Usuário registrado: " + usuario.getNome());
    }

    public void removerUsuario(Usuario usuario) {
        usuarios.remove(usuario);
        System.out.println("Usuário removido: " + usuario.getNome());
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }
}
