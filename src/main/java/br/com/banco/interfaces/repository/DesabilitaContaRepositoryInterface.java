package br.com.banco.interfaces.repository;

import br.com.banco.model.ContaCorrenteEntity;

public interface DesabilitaContaRepositoryInterface {
	ContaCorrenteEntity desabilitarConta(int numeroAgencia, int numeroConta, boolean desativar);
}
