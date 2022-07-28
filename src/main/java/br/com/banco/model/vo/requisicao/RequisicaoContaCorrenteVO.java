package br.com.banco.model.vo.requisicao;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RequisicaoContaCorrenteVO {

	private Integer idContaCorrente;

	private RequisicaoCorrentistaVO correntista;

	private RequisicaoAgenciaVO agencia;

	private BigDecimal limite;

	private BigDecimal saldo;

	private boolean ativa;

}
