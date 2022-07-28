package br.com.banco.model.vo.resposta;

import java.time.LocalDate;
import java.util.List;

import lombok.Data;
@SuppressWarnings("hiding")
@Data
public class RespostaCorrentistaSuasContasVO<RespostaAgenciaComContaVO> {
	
	private Integer idCorrentista;
	
	private String nome;
	
	private String cpf;
	
	private LocalDate dataNascimento;
	
	private List<RespostaAgenciaComContaVO> contas;

}
