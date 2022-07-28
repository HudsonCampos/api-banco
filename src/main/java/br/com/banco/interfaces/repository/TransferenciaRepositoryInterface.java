package br.com.banco.interfaces.repository;

import br.com.banco.model.vo.requisicao.RequisicaoTransfrenciaVO;
import br.com.banco.model.vo.resposta.RespostaContaCorrenteVO;

public interface TransferenciaRepositoryInterface {
	RespostaContaCorrenteVO realizarTransferencia(RequisicaoTransfrenciaVO requisicaoTransfrenciaVO);
}
