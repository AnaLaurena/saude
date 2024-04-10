package model;

public class usuario {

	private  String Nome, Celular, Email, Senha,Nickname;
	
	private boolean Estalogado = false;
	
	public usuario (String Nome, String Celular, String Email, String Senha,String Nickname) {
		this.Nome = Nome;
		this.Celular = Celular;
		this.Email = Email;
		this.Senha = Senha;
		this.Nickname = Nickname;
	}
	 
	void Autenticacao(String Email, String Senha) {
		if (this.Email == Email && this.Senha == Senha) {
			Estalogado = true;
		}
		
		
	}
	public String getUsuario() {
		return (
				"\nNome" + this.Nome
				+ "\nCelular" + this.Celular
				+ "\nEmail" + this.Email
				+ "\nSenha" + this.Senha
				+ "\nNickname" + this.Nickname
				+ "\nEstalogado" + this.Estalogado
				);
		
	}

	public boolean validarcadastro(String confirmacaoSenha) {
		// TODO Auto-generated method stub
		return false;
	}

	public Object getsenha() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getickname() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean validarCadastro(String confirmacaoSenha) {
		// TODO Auto-generated method stub
		return false;
	}

	public Object getNome() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
