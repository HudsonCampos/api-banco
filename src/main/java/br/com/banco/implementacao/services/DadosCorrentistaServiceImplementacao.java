package br.com.banco.implementacao.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.banco.interfaces.repository.ContaCorrenteRepositoryInterface;
import br.com.banco.interfaces.repository.CorrentistaRepositoryInterface;
import br.com.banco.interfaces.services.DadosCorrentistaServiceInterface;
import br.com.banco.model.ContaCorrenteEntity;
import br.com.banco.model.CorrentistaEntity;
import br.com.banco.model.vo.resposta.RespostaCorrentistaSuasContasVO;

@Service
public class DadosCorrentistaServiceImplementacao implements DadosCorrentistaServiceInterface{

	@Autowired
	private CorrentistaRepositoryInterface correntistaRepositoryInterface;
	
	@Autowired
	private ContaCorrenteRepositoryInterface contaCorrenteRepositoryInterface;
	
	@Override
	public RespostaCorrentistaSuasContasVO<ContaCorrenteEntity> consultarDadosCorrentista(String cpf) {

		CorrentistaEntity correntistaEntity = correntistaRepositoryInterface.buscarCorrentistaPorCpf(cpf);
		
		Integer idCorrentista = correntistaEntity.getIdCorrentista();
		
		@SuppressWarnings("unused")
		ContaCorrenteEntity contaCorrenteEntity = contaCorrenteRepositoryInterface.buscarContaPorId(idCorrentista);
		
		return new RespostaCorrentistaSuasContasVO<ContaCorrenteEntity>();
	}

}
