package br.com.banco.excecao;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class CustomizadaExcecaoHandle extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<RespostaExcecaoVO> todasExcecoesHandlen(Exception ex, WebRequest web){
		
		RespostaExcecaoVO respostaExcecao = 
				new RespostaExcecaoVO(
						new Date(),
						ex.getMessage()
						,web.getDescription(false)
				);
		
		return new ResponseEntity<>(respostaExcecao, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(UnsupportedOperationException.class)
	final ResponseEntity<RespostaExcecaoVO> badRequestExcecoesHandlen(UnsupportedOperationException ex, WebRequest web){
		
		RespostaExcecaoVO respostaExcecao = 
				new RespostaExcecaoVO(
						new Date(),
						ex.getMessage()
						,web.getDescription(false)
				);
		
		return new ResponseEntity<>(respostaExcecao, HttpStatus.BAD_REQUEST);
	}
	
	
}
