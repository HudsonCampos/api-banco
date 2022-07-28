package br.com.banco.interfaces.services;

import java.math.BigDecimal;

import br.com.banco.model.vo.requisicao.RequisicaoDepositoVO;

public interface DepositoServiceInterface {
	BigDecimal realizarDeposito(RequisicaoDepositoVO requisicaoDepositoVO);
}
