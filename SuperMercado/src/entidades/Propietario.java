package entidades;

public class Propietario {

	private String login=null;
	private String senha=null;
	
	public Propietario (){
		
	}

	public Propietario(String login, String senha) {
		
		this.login = login;
		this.senha = senha;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
