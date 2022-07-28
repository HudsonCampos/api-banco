package br.com.banco.implementacao.services;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.banco.excecao.ValorNaoAutorizadoExcecao;
import br.com.banco.interfaces.repository.ContaCorrenteRepositoryInterface;
import br.com.banco.interfaces.services.TransferenciaServiceInterface;
import br.com.banco.model.ContaCorrenteEntity;
import br.com.banco.model.vo.requisicao.RequisicaoTransfrenciaVO;

@Service
public class TransferenciaServiceImplementacao implements TransferenciaServiceInterface{

	
	@Autowired
	private ContaCorrenteRepositoryInterface contaCorrenteRepositoryInterface;
	
	@Override
	public BigDecimal realizarTransferencia(RequisicaoTransfrenciaVO requisicaoTransfrenciaVO) {
		if (requisicaoTransfrenciaVO.getValorTransferir().compareTo(requisicaoTransfrenciaVO.getValorTransferir()) <= 0) {
			throw new ValorNaoAutorizadoExcecao("Valor não reconhecido.");
		}
		
		ContaCorrenteEntity contaCorrenteEntityOrigem = contaCorrenteRepositoryInterface
				.buscarContaPorId(requisicaoTransfrenciaVO.getNumeroAgenciaOrigem(), requisicaoTransfrenciaVO.getIdContaCorrenteOrigem());
		
		ContaCorrenteEntity contaCorrenteEntityDestino = contaCorrenteRepositoryInterface
				.buscarContaPorId(requisicaoTransfrenciaVO.getNumeroAgenciaDestino(), requisicaoTransfrenciaVO.getIdContaCorrenteDesito());
		
		contaCorrenteEntityOrigem.getSaldo().subtract(requisicaoTransfrenciaVO.getValorTransferir());
		
		contaCorrenteEntityDestino.getSaldo().add(requisicaoTransfrenciaVO.getValorTransferir());
		
		return contaCorrenteEntityOrigem.getSaldo();
	}

}
