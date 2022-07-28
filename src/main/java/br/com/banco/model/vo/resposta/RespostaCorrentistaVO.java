package br.com.banco.model.vo.resposta;

import java.time.LocalDate;

import lombok.Data;

@Data
public class RespostaCorrentistaVO {

	private Integer idCorrentista;
	
	private String nome;
	
	private String cpf;
	
	private LocalDate dataNascimento;
	
}
