package br.com.banco.implementacao.services;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.banco.excecao.AcessoNaoPermitido;
import br.com.banco.interfaces.repository.AgenciaRepositoryInterface;
import br.com.banco.interfaces.repository.ContaCorrenteRepositoryInterface;
import br.com.banco.interfaces.services.DepositoServiceInterface;
import br.com.banco.model.AgenciaEntity;
import br.com.banco.model.ContaCorrenteEntity;
import br.com.banco.model.vo.requisicao.RequisicaoDepositoVO;

@Service
public class DepositoServiceImplementacao implements DepositoServiceInterface{

	
	@Autowired
	private AgenciaRepositoryInterface agenciaRepositoryInterface;
	
	@Autowired
	private ContaCorrenteRepositoryInterface contaCorrenteRepositoryInterface;
	
	@SuppressWarnings("unchecked")
	@Override
	public BigDecimal realizarDeposito(RequisicaoDepositoVO requisicaoDepositoVO) {
		
		if(((Comparable<BigDecimal>) requisicaoDepositoVO).compareTo(BigDecimal.ZERO) <= 0) {
			new AcessoNaoPermitido("Acesso não permitido.");
		}		
		
		
		AgenciaEntity agenciaEntity = agenciaRepositoryInterface.buscarAgenciaPorId(requisicaoDepositoVO.getNumeroAgencia());
		
		ContaCorrenteEntity contaCorrenteEntity = contaCorrenteRepositoryInterface
				.buscarContaPorId(requisicaoDepositoVO.getIdContaCorrente(), requisicaoDepositoVO.getNumeroAgencia());
		
		ContaCorrenteEntity contaCorrente = ContaCorrenteEntity.builder()
				.agencia(agenciaEntity)
				.idContaCorrente(requisicaoDepositoVO.getIdContaCorrente())
				.saldo(contaCorrenteEntity.getSaldo().add(requisicaoDepositoVO.getValorDeposito())).build();	
		
		
		return contaCorrente.getSaldo();
	}

}
