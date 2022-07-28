package br.com.banco.interfaces.repository;

import br.com.banco.model.CorrentistaEntity;

public interface CorrentistaRepositoryInterface {

	CorrentistaEntity buscarCorrentistaPorCpf(String cpf);
}
