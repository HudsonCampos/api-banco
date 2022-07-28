package br.com.banco.implementacao.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.banco.interfaces.repository.AgenciaRepositoryInterface;
import br.com.banco.interfaces.repository.ContaCorrenteRepositoryInterface;
import br.com.banco.interfaces.repository.CorrentistaRepositoryInterface;
import br.com.banco.interfaces.services.ContaCorrenteServiceInterface;
import br.com.banco.model.AgenciaEntity;
import br.com.banco.model.ContaCorrenteEntity;
import br.com.banco.model.CorrentistaEntity;
import br.com.banco.model.vo.requisicao.RequisicaoCorrentistaSaldoLimiteVO;
import br.com.banco.model.vo.resposta.RespostaContaCorrenteVO;
import br.com.banco.utils.DozerConverter;

@Service
public class ContaCorrenteServiceImplementacao implements ContaCorrenteServiceInterface{

	@Autowired
	private AgenciaRepositoryInterface agenciaRepositoryInterface;
	
	@Autowired
	private CorrentistaRepositoryInterface correntistaRepositoryInterface;
	
	@Autowired
	private ContaCorrenteRepositoryInterface contaCorrenteRepositoryInterface;
	
	@Override
	public RespostaContaCorrenteVO cadastrar(RequisicaoCorrentistaSaldoLimiteVO requisicaoCorrentistaSaldoLimiteVO) {		
		
		
		AgenciaEntity agenciaEntity = agenciaRepositoryInterface
				.buscarAgenciaPorId(requisicaoCorrentistaSaldoLimiteVO.getNumeroAgencia());
					
		CorrentistaEntity correntistaEntity = correntistaRepositoryInterface
				.buscarCorrentistaPorCpf(requisicaoCorrentistaSaldoLimiteVO.getCpf());
		
		ContaCorrenteEntity contaCorrenteEntity = ContaCorrenteEntity.builder().agencia(agenciaEntity)
				.correntista(correntistaEntity).limite(requisicaoCorrentistaSaldoLimiteVO.getLimite())
				.saldo(requisicaoCorrentistaSaldoLimiteVO.getSaldo()).build();
		
		ContaCorrenteEntity contaCorrenteEntityCadastro = contaCorrenteRepositoryInterface.cadastrar(contaCorrenteEntity);
		
		return DozerConverter.parseObjetct(contaCorrenteEntityCadastro, RespostaContaCorrenteVO.class);
	}

}
