package br.com.banco.interfaces.services;

import br.com.banco.model.vo.resposta.RespostaCorrentistaSuasContasVO;

public interface DadosCorrentistaServiceInterface {
	RespostaCorrentistaSuasContasVO<?> consultarDadosCorrentista(String cpf);
}
