package br.com.banco.excecao;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.FORBIDDEN)
public class AcessoNaoPermitido extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public AcessoNaoPermitido(String excecao) {
		super(excecao);
	}
}