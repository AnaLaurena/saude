package model;

import java.util.ArrayList;
import java.util.List;

public class SaudeEmAcao {
    
    private List<usuario> usuarios = new ArrayList<>();

    public void adicionarUsuario(usuario usuario) {
        usuarios.add(usuario);
    }

    public usuario buscarusuario(String nickname, String senha) {
        for (usuario usuario : usuarios) {
            if (usuario.getickname().equals(nickname) && usuario.getsenha().equals(senha)) {
                return usuario;
        }
        return null;
    }
		return null;
    }
    public List<usuario> getusuarios() {
        return usuarios;
    }
}