package br.com.banco.implementacao.repository;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import br.com.banco.excecao.ContaCorrenteNaoLocalizadoExcecao;
import br.com.banco.interfaces.repository.DesabilitaContaRepositoryInterface;
import br.com.banco.model.ContaCorrenteEntity;
@Repository
public class DesabilitaContaRepositoryImplementacao implements DesabilitaContaRepositoryInterface{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public ContaCorrenteEntity desabilitarConta(int numeroAgencia, int numeroConta, boolean ativar) {

		try {			
			
			
			String sql = "INSERT INTO t_conta_corrente"
					+ "VALUES (? ? ? ? ? ?)";
	
			var contaCorrenteEntity = jdbcTemplate.queryForList(sql);
			var list = new ArrayList<ContaCorrenteEntity>();
			contaCorrenteEntity.forEach(obj -> {
				
				var idContaCorrente =  obj.get("id_conta_corrente").toString();
				var correntista = obj.get("correntista").toString();
				var agencia = obj.get("agencia").toString();
				var limite = obj.get("limite").toString();
				var saldo = obj.get("saldo").toString();
				var ativa = obj.get("ativar").toString();
				
				var conta = new ContaCorrenteEntity(Integer.parseInt(idContaCorrente), correntista, agencia, limite, saldo, ativa);
				list.add(conta);
			});
	        return list.get(0);
        
		} catch (Exception e) {
			throw new ContaCorrenteNaoLocalizadoExcecao("Conta não localizada.");
		}
	}
	

}
