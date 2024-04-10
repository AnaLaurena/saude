package app;

import controller.usuarioController;
import model.usuario;
import view.mensagens;

import javax.swing.*;

public class main {

    private static final String SAUDE_EM_ACAO = "Saúde em Ação";
	private static Object SaudeEmAcao;

    public static void main(String[] args) {
        Mensagens mensagem = new Mensagens();
        UsuarioController controller = new UsuarioController();

        String Nome, Celular, Email, Senha, Nickname;
        String opcao;
        int opcaoNum;

        do {
            opcao = mensagem.solicitarEntrada(SAUDE_EM_ACAO
                    + "\nDigite a opção desejada"
                    + "\n1. Cadastrar Usuário"
                    + "\n2. Login"
                    + "\n3. Lista"
                    + "\n4. Sair");

            opcaoNum = Integer.parseInt(opcao);

            switch (opcaoNum) {
                case 1:
                    Nickname = mensagem.solicitarEntrada("Digite seu Nickname");
                    Nome = mensagem.solicitarEntrada("Digite seu Nome");
                    Celular = mensagem.solicitarEntrada("Digite seu Celular");
                    Email = mensagem.solicitarEntrada("Digite seu Email");
                    Senha = mensagem.solicitarEntrada("Digite seu Senha");
                    String mensagemCadastro = controller.criarUsuario(Nome, Email, Celular, Senha, Nickname);
                    mensagem.mostrarMensagemDeSucesso(mensagemCadastro);
                    break;

                case 2:
                    Nickname = mensagem.solicitarEntrada("Digite seu Nickname");
                    Email = mensagem.solicitarEntrada("Digite seu Email");
                    Senha = mensagem.solicitarEntrada("Digite seu Senha");
                    // Implement login functionality here
                    break;

                case 3:
                    listarUsuarios();
                    break;

                case 4:
                    System.exit(0);
                    break;

                default:
                    System.exit(0);
            }
        } while (true);
    }

    private static void listarUsuarios() {
        // Assuming you have access to the list of users
        StringBuilder usuariosStr = new StringBuilder("Usuários Cadastrados:\n");
        for (usuario usuario : ((Object) SaudeEmAcao).getusuarios()) {
            usuariosStr.append("Nome:").append(usuario.getnome()).append(", Nickname: ").append(usuario.getNickname()).append("\n");
        }
        JOptionPane.showMessageDialog(null, usuariosStr.toString());
    }
}
