package Servicos;

public abstract class abstractServico implements IBandeiraCartao {
 private Integer setor=null;

public Integer getSetor() {
	return setor;
}

public void setSetor(Integer setor) {
	this.setor = setor;
}

public abstractServico(Integer setor) {
	super();
	this.setor = setor;
}
 
}
