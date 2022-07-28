package br.com.banco.interfaces.services;

import br.com.banco.model.vo.resposta.RespostaContaCorrenteVO;

public interface DesabilitaContaServiceInterface {

	RespostaContaCorrenteVO desabilitarConta(int numeroAgencia, int idConta, boolean desativar);
}
