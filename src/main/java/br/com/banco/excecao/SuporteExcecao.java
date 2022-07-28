package br.com.banco.excecao;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class SuporteExcecao extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public SuporteExcecao(String excecao) {
		super(excecao);
	}
}
