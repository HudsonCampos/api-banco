package br.com.banco.interfaces.repository;

import java.math.BigDecimal;

public interface SaldoRepositoryInterface {
	BigDecimal consultarSaldo(int numero_agencia, int numero_conta_corrente);
}
