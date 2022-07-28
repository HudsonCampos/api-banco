package br.com.banco.interfaces.repository;

import br.com.banco.model.ContaCorrenteEntity;
import br.com.banco.model.vo.requisicao.RequisicaoSaqueVO;

public interface SaqueRepositoryInterface {
	ContaCorrenteEntity realizarSaque(RequisicaoSaqueVO requisicaoSaqueVO);
}
