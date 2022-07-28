package br.com.banco.excecao;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class RespostaExcecaoVO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Date timestamp;
	private String mensagem;
	private String detalhes;
	
	public RespostaExcecaoVO(Date timestamp, String mensagem, String detalhes) {
		this.timestamp = timestamp;
		this.mensagem = mensagem;
		this.detalhes = detalhes;
	}
	
	

}
