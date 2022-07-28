package br.com.banco.interfaces.repository;

import br.com.banco.model.ContaCorrenteEntity;
import br.com.banco.model.vo.requisicao.RequisicaoDepositoVO;

public interface DepositoRepositoryInterface {

	ContaCorrenteEntity consultarSaldo(RequisicaoDepositoVO equisicaoDepositoVO);
}
