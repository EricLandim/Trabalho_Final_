package testes;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import trabalhoFinal.*;

public class SystemTest {

    @Test
    public void testMenu() {
        String input = "1\nDom Casmurro\nMachado de Assis\n1899\n5\n3\nJoão\n1\n2\n1\nDom Casmurro\n0";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        Main.main(new String[] {});

        String output = outputStream.toString();
        Assertions.assertTrue(output.contains("Livro adicionado ao acervo"));
        Assertions.assertTrue(output.contains("Usuário registrado"));
        Assertions.assertTrue(output.contains("Livro emprestado"));
        Assertions.assertTrue(output.contains("Encerrando o programa..."));

    }
}
