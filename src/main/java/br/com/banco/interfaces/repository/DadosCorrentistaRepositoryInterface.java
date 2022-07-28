package br.com.banco.interfaces.repository;

import br.com.banco.model.vo.resposta.RespostaCorrentistaSuasContasVO;

public interface DadosCorrentistaRepositoryInterface {
	RespostaCorrentistaSuasContasVO<?> consultarDadosCorrentista(String cpf);
}
