package view;

import java.util.Scanner;
import model.usuario;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int escolha;

        do {
            
            System.out.println("=== Sistema de Login ===");
            System.out.println("Selecione uma opção:");
            System.out.println("1. Realizar Cadastro");
            System.out.println("2. Realizar Login");
            System.out.println("3. Listagem");        
            System.out.println(" 4.RegistroSono");
            System.out.println(" 5.RegistroAlimentacao");
            System.out.print("Escolha: ");
            System.out.println("0. Sair");
         
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    realizarCadastro(scanner);
                    break;
                case 2:
                    realizarLogin(scanner);
                    break;
                case 3:
                    visualisarLista (scanner);
                case 4 :
                	registrasono(scanner);
                    break;
                case 5 :
                	registraalimentacao(scanner);
                    break;
                case 0:
                
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (escolha != 0);
        
        scanner.close();
    }

    
    private static void registraalimentacao(Scanner scanner) {
		// TODO Auto-generated method stub
		
	}


	private static void registrasono(Scanner scanner) {
		// TODO Auto-generated method stub
		
	}


	private static void visualisarLista(Scanner scanner) {
		// TODO Auto-generated method stub
		
	}


	private static void realizarLista(Scanner scanner) {
		// TODO Auto-generated method stub
		
	}


	private static void realizarCadastro(Scanner scanner) {
        
        String nome, celular, email, senha, confirmacaoSenha, nickname;

        
        System.out.println("=== Cadastro de Usuário ===");
        scanner.nextLine(); 
        System.out.print("Nome: ");
        nome = scanner.nextLine();
        System.out.print("Celular: ");
        celular = scanner.nextLine();
        System.out.print("Email: ");
        email = scanner.nextLine();
        System.out.print("Senha: ");
        senha = scanner.nextLine();
        System.out.print("Confirme a senha: ");
        confirmacaoSenha = scanner.nextLine();
        System.out.print("Nickname: ");
        nickname = scanner.nextLine();

        // Criar um novo usuário com os dados fornecidos
        usuario usuario = new usuario(nome, celular, email, senha, nickname);

        // Validar o cadastro
        boolean cadastroValido = usuario.validarCadastro(confirmacaoSenha);
        if (cadastroValido) {
            System.out.println("Cadastro realizado com sucesso!");
        } else {
            System.out.println("Cadastro não realizado devido a senhas não coincidirem.");
        }
    }

    private static void realizarLogin(Scanner scanner) {
        
        String email, senha;

        
        System.out.println("=== Login ===");
        scanner.nextLine(); 
        System.out.print("Email: ");
        email = scanner.nextLine();
        System.out.print("Senha: ");
        senha = scanner.nextLine();

        if (autenticarUsuario(email, senha)) {
            System.out.println("Login realizado com sucesso!");
        } else {
            System.out.println("Email ou senha incorretos. Falha no login.");
        }
    }
    private static boolean autenticarUsuario(String email, String senha) {
       
       return true;
    }
} 