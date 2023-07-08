package testes;

import org.junit.Assert;
import org.junit.Test;
import trabalhoFinal.*;

public class IntegrationTest {

    @Test
    public void testEmprestimoEDevolucao() {
        Livro livro = new Livro("Dom Casmurro", "Machado de Assis", 1899, 5);
        Usuario usuario = new Usuario("João", 1);
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adicionarLivro(livro);
        biblioteca.registrarUsuario(usuario);

        usuario.emprestarLivro(livro);
        Assert.assertEquals(1, usuario.getLivrosEmprestados().size());

        usuario.devolverLivro(livro);
        Assert.assertEquals(0, usuario.getLivrosEmprestados().size());
    }
}

