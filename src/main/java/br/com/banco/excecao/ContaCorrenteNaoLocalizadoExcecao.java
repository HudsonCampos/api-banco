package br.com.banco.excecao;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ContaCorrenteNaoLocalizadoExcecao extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public ContaCorrenteNaoLocalizadoExcecao(String excecao) {
		super(excecao);
	}
}