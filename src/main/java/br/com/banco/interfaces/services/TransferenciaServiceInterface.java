package br.com.banco.interfaces.services;

import java.math.BigDecimal;

import br.com.banco.model.vo.requisicao.RequisicaoTransfrenciaVO;

public interface TransferenciaServiceInterface {
	BigDecimal realizarTransferencia(RequisicaoTransfrenciaVO requisicaoTransfrenciaVO);
}
