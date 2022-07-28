package br.com.banco.interfaces.services;

import java.math.BigDecimal;

import br.com.banco.model.vo.requisicao.RequisicaoSaldoVO;

public interface SaldoServiceInterface {
	BigDecimal consultarSaldo(RequisicaoSaldoVO requisicaoSaldoVO);
}
