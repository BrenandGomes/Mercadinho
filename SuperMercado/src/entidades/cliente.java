package entidades;

public class cliente {
private String nome=null;
private String email=null;


public cliente() {
	
	
}


public cliente(String nome, String email) {
	this.nome = nome;
	this.email = email;
}


public String getNome() {
	return nome;
}


public void setNome(String nome) {
	this.nome = nome;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}

}
