package br.com.banco.excecao;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class AgenciaNaoLocalizadoExcecao extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public AgenciaNaoLocalizadoExcecao(String excecao) {
		super(excecao);
	}
}