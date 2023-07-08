package trabalhoFinal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criando uma biblioteca
        Biblioteca biblioteca = new Biblioteca();

        Scanner scanner = new Scanner(System.in);

        boolean executando = true;
        while (executando) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Adicionar Livro");
            System.out.println("2. Realizar Empréstimo");
            System.out.println("3. Cadastrar Usuário");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 0:
                    executando = false;
                    System.out.println("Encerrando o programa...");
                    break;
                case 1:
                    System.out.println("\n--- Adicionar Livro ---");
                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Autor: ");
                    String autor = scanner.nextLine();
                    System.out.print("Ano de publicação: ");
                    int anoPublicacao = Integer.parseInt(scanner.nextLine());
                    System.out.print("Número total de exemplares: ");
                    int numExemplaresTotal = Integer.parseInt(scanner.nextLine());

                    Livro livro = new Livro(titulo, autor, anoPublicacao, numExemplaresTotal);
                    biblioteca.adicionarLivro(livro);
                    break;
                case 2:
                    System.out.println("\n--- Realizar Empréstimo ---");
                    System.out.print("Identificação do usuário: ");
                    int identificacaoUsuario = Integer.parseInt(scanner.nextLine());
                    Usuario usuario = null;
                    for (Usuario u : biblioteca.getUsuarios()) {
                        if (u.getIdentificacao() == identificacaoUsuario) {
                            usuario = u;
                            break;
                        }
                    }

                    if (usuario != null) {
                        System.out.print("Título do livro a ser emprestado: ");
                        String tituloLivro = scanner.nextLine();
                        Livro livroEmprestimo = biblioteca.pesquisarLivro(tituloLivro);

                        if (livroEmprestimo != null) {
                            usuario.emprestarLivro(livroEmprestimo);
                        } else {
                            System.out.println("Livro não encontrado!");
                        }
                    } else {
                        System.out.println("Usuário não encontrado!");
                    }
                    break;
                case 3:
                    System.out.println("\n--- Cadastrar Usuário ---");
                    System.out.print("Nome: ");
                    String nomeUsuario = scanner.nextLine();
                    System.out.print("Identificação: ");
                    int identificacao = Integer.parseInt(scanner.nextLine());

                    Usuario novoUsuario = new Usuario(nomeUsuario, identificacao);
                    biblioteca.registrarUsuario(novoUsuario);
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }

        scanner.close();
    }
}


