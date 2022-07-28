package br.com.banco.implementacao.repository;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import br.com.banco.excecao.AgenciaNaoLocalizadoExcecao;
import br.com.banco.interfaces.repository.AgenciaRepositoryInterface;
import br.com.banco.model.AgenciaEntity;

@Repository
public class AgenciaRepositoryImplementacao implements AgenciaRepositoryInterface{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public AgenciaEntity buscarAgenciaPorId(int id) {

		
		try {			
			
		
			String sql = "SELECT * FROM t_agencia WHERE numero_agencia = "+id;
	
			var agenciaEntity = jdbcTemplate.queryForList(sql);
			var list = new ArrayList<AgenciaEntity>();
			agenciaEntity.forEach(obj -> {
				
				var numeroAgencia =  obj.get("numero_agencia").toString();
				var nome = obj.get("nome").toString();
				var endereco = obj.get("endereco").toString();
				
				var agencia = new AgenciaEntity(Integer.parseInt(numeroAgencia), nome, endereco);
				list.add(agencia);
			});
	        return list.get(0);	 
        
		} catch (Exception e) {
			throw new AgenciaNaoLocalizadoExcecao("Agencia não localizada.");
		}
	}

}


