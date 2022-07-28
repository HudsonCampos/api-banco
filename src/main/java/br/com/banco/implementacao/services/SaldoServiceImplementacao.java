package br.com.banco.implementacao.services;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.banco.interfaces.repository.ContaCorrenteRepositoryInterface;
import br.com.banco.interfaces.services.SaldoServiceInterface;
import br.com.banco.model.ContaCorrenteEntity;
import br.com.banco.model.vo.requisicao.RequisicaoSaldoVO;

@Service
public class SaldoServiceImplementacao implements SaldoServiceInterface{

	
	@Autowired
	private ContaCorrenteRepositoryInterface contaCorrenteRepositoryInterface;
	
	@Override
	public BigDecimal consultarSaldo(RequisicaoSaldoVO requisicaoSaldoVO) {		
		
		ContaCorrenteEntity contaCorrenteEntity = contaCorrenteRepositoryInterface
				.buscarContaPorId(requisicaoSaldoVO.getIdContaCorrente(), requisicaoSaldoVO.getNumeroAgencia());
		
				 
		return contaCorrenteEntity.getSaldo();
	}

}
