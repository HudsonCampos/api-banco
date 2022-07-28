package br.com.banco.implementacao.repository;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import br.com.banco.interfaces.repository.SaldoRepositoryInterface;

@Repository
public class SaldoRepositoryImplementacao implements SaldoRepositoryInterface{

	@Override
	public BigDecimal consultarSaldo(int numero_agencia, int numero_conta_corrente) {
//		// fazer o select (O endpoint deverá receber o número da agência e o número da conta (int) e deve retornar o
//		saldo (BigDecimal) em conta corrente. O código de retorno HTTP deve ser 200. Caso a conta
//		não exista, deve retornar 404.)
		return null;
	}

}
