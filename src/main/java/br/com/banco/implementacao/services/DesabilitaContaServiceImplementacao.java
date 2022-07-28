package br.com.banco.implementacao.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.banco.interfaces.repository.DesabilitaContaRepositoryInterface;
import br.com.banco.interfaces.services.DesabilitaContaServiceInterface;
import br.com.banco.model.ContaCorrenteEntity;
import br.com.banco.model.vo.resposta.RespostaContaCorrenteVO;
import br.com.banco.utils.DozerConverter;

@Service
public class DesabilitaContaServiceImplementacao implements DesabilitaContaServiceInterface{

	@Autowired
	private DesabilitaContaRepositoryInterface desabilitaContaRepositoryInterface;
	
	@Override
	public RespostaContaCorrenteVO desabilitarConta(int numeroAgencia, int idConta, boolean desativar) {

		ContaCorrenteEntity contaCorrenteEntity = desabilitaContaRepositoryInterface
				.desabilitarConta(numeroAgencia, idConta, desativar);
		
		
		return DozerConverter.parseObjetct(contaCorrenteEntity, RespostaContaCorrenteVO.class);
	}


}
