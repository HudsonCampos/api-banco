package br.com.banco.interfaces.repository;

import br.com.banco.model.AgenciaEntity;

public interface AgenciaRepositoryInterface {

	AgenciaEntity buscarAgenciaPorId(int id);
}
