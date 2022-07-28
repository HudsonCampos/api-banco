package br.com.banco.implementacao.services;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.banco.interfaces.repository.ContaCorrenteRepositoryInterface;
import br.com.banco.interfaces.services.SaqueServiceInterface;
import br.com.banco.model.ContaCorrenteEntity;
import br.com.banco.model.vo.requisicao.RequisicaoSaqueVO;

@Service
public class SaqueServiceImplementacao implements SaqueServiceInterface{
	
	@Autowired
	private ContaCorrenteRepositoryInterface contaCorrenteRepositoryInterface;
	
	
	@Override
	public BigDecimal realizarSaque(RequisicaoSaqueVO requisicaoSaqueVO) {
		
		ContaCorrenteEntity contaCorrenteEntity = contaCorrenteRepositoryInterface
				.buscarContaPorId(requisicaoSaqueVO.getIdContaCorrente(), requisicaoSaqueVO.getNumeroAgencia());	
		
		
		return contaCorrenteEntity.getSaldo().subtract(requisicaoSaqueVO.getValorSaque());
	}

}
