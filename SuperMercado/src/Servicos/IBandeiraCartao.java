package Servicos;

import Error.Personalizado;

public interface IBandeiraCartao {

String verificarBandeira() throws Personalizado;

default String senha(int senha) throws Personalizado{
	if (senha==123) {
		return " Senha Válida";}
		else {
			throw new Personalizado ("Senha Inválida");
		}
}
}
