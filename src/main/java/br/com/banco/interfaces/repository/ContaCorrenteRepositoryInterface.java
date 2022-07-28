package br.com.banco.interfaces.repository;

import br.com.banco.model.ContaCorrenteEntity;

public interface ContaCorrenteRepositoryInterface {

	ContaCorrenteEntity cadastrar(ContaCorrenteEntity contaCorrenteEntity);

	ContaCorrenteEntity buscarContaPorId(int id);

	ContaCorrenteEntity buscarContaPorId(int numero_agencia, int id_conta_corrente);
}
