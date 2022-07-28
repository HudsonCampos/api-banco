package br.com.banco.model.vo.resposta;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RespostaContaCorrenteVO {

	private Integer idContaCorrente;

	private RespostaCorrentistaVO correntista;

	private RespostaAgenciaVO agencia;

	private BigDecimal limite;

	private BigDecimal saldo;

	private boolean ativa;

}
