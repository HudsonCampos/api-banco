package br.com.banco.interfaces.services;

import java.math.BigDecimal;

import br.com.banco.model.vo.requisicao.RequisicaoSaqueVO;

public interface SaqueServiceInterface {
	BigDecimal realizarSaque(RequisicaoSaqueVO requisicaoSaqueVO);
}
