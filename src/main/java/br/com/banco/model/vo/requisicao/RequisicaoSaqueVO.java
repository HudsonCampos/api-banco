package br.com.banco.model.vo.requisicao;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class RequisicaoSaqueVO {

	private Integer numeroAgencia;
	
	private Integer idContaCorrente;
	
	private BigDecimal valorSaque;
}
