package br.com.banco.implementacao.repository;

import java.time.LocalDate;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import br.com.banco.excecao.AgenciaNaoLocalizadoExcecao;
import br.com.banco.interfaces.repository.CorrentistaRepositoryInterface;
import br.com.banco.model.CorrentistaEntity;

@Repository
public class CorrentistaRepositoryImplementacao implements CorrentistaRepositoryInterface{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public CorrentistaEntity buscarCorrentistaPorCpf(String cpf) {
		
		
		try {			
		
			String sql = "SELECT * FROM t_correntista WHERE cpf = "+cpf;			
			
			var correntistaEntity = jdbcTemplate.queryForList(sql);
			var list = new ArrayList<CorrentistaEntity>();
			correntistaEntity.forEach(obj -> {
				
				var idCorrentista =  obj.get("id_correntista").toString();
				var nome = obj.get("nome").toString();
				var documento = obj.get("cpf").toString();
				LocalDate dataNascimento = (LocalDate) obj.get("dataNascimento");
				
				var correntista = new CorrentistaEntity(Integer.parseInt(idCorrentista), nome, documento, dataNascimento);
				list.add(correntista);
			});
	        return list.get(0);	
	        
		} catch (Exception e) {
			throw new AgenciaNaoLocalizadoExcecao("Cpf não localizado.");
		}
		
	}

}






