package testes;

import trabalhoFinal.*;
import org.junit.Test;
import org.junit.Assert;

public class UsuarioTest {

    @Test
    public void testEmprestarLivro() {
        Livro livro = new Livro("Dom Casmurro", "Machado de Assis", 1899, 5);
        Usuario usuario = new Usuario("João", 1);
        usuario.emprestarLivro(livro);
        Assert.assertEquals(1, usuario.getLivrosEmprestados().size());
    }

    @Test
    public void testDevolverLivro() {
        Livro livro = new Livro("Dom Casmurro", "Machado de Assis", 1899, 5);
        Usuario usuario = new Usuario("João", 1);
        usuario.emprestarLivro(livro);
        usuario.devolverLivro(livro);
        Assert.assertEquals(0, usuario.getLivrosEmprestados().size());
    }
}

