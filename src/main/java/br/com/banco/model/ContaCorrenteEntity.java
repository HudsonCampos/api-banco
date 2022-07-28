package br.com.banco.model;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ContaCorrenteEntity {
	

	public ContaCorrenteEntity(int parseInt, String correntistas, String agencias, String limites, String saldos,
			String ativas) {
		// TODO Auto-generated constructor stub
	}

	private Integer idContaCorrente;

	private CorrentistaEntity correntista;

	private AgenciaEntity agencia;

	private BigDecimal limite;

	private BigDecimal saldo;

	private boolean ativa;

}
