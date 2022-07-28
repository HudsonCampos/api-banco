package br.com.banco.model.vo.requisicao;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class RequisicaoTransfrenciaVO {
	
	private Integer numeroAgenciaOrigem;
	
	private Integer idContaCorrenteOrigem;
	
	private Integer numeroAgenciaDestino;
	
	private Integer idContaCorrenteDesito;
	
	private BigDecimal valorTransferir;	
	
}
