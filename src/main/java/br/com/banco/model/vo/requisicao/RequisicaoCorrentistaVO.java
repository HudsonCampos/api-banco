package br.com.banco.model.vo.requisicao;

import java.time.LocalDate;

import lombok.Data;

@Data
public class RequisicaoCorrentistaVO {

	private Integer idCorrentista;
	
	private String nome;
	
	private String cpf;
	
	private LocalDate dataNascimento;
	
}
