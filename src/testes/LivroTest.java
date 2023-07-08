package testes;

import trabalhoFinal.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class LivroTest {

    @Test
    public void testEmprestar() {
        Livro livro = new Livro("Dom Casmurro", "Machado de Assis", 1899, 5);
        livro.emprestar();
        Assert.assertEquals(4, livro.getNumExemplaresDisponiveis());
    }

    @Test
    public void testDevolver() {
        Livro livro = new Livro("Dom Casmurro", "Machado de Assis", 1899, 5);
        livro.emprestar();
        livro.devolver();
        Assert.assertEquals(5, livro.getNumExemplaresDisponiveis());
    }
}

