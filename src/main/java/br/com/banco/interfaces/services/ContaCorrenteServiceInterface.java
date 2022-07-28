package br.com.banco.interfaces.services;

import br.com.banco.model.vo.requisicao.RequisicaoCorrentistaSaldoLimiteVO;
import br.com.banco.model.vo.resposta.RespostaContaCorrenteVO;

public interface ContaCorrenteServiceInterface {

	public RespostaContaCorrenteVO cadastrar(RequisicaoCorrentistaSaldoLimiteVO requisicaoCorrentistaSaldoLimiteVO);
	
}
