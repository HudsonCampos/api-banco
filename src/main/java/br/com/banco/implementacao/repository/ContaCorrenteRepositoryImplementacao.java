package br.com.banco.implementacao.repository;

import java.util.ArrayList;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import br.com.banco.excecao.ContaCorrenteNaoLocalizadoExcecao;
import br.com.banco.interfaces.repository.ContaCorrenteRepositoryInterface;
import br.com.banco.model.ContaCorrenteEntity;

@Repository
public class ContaCorrenteRepositoryImplementacao implements ContaCorrenteRepositoryInterface{

	private JdbcTemplate jdbcTemplate;

	@Override
	public ContaCorrenteEntity cadastrar(ContaCorrenteEntity contaCorrenteEntity) {		
		
		try {			
			
			
			String sql = "INSERT INTO t_conta_corrente"
					+ "VALUES (? ? ? ? ? ?)";
	
			var contaCorrenteEntitys= jdbcTemplate.queryForList(sql);
			var list = new ArrayList<ContaCorrenteEntity>();
			contaCorrenteEntitys.forEach(obj -> {
				
				var idContaCorrentes =  obj.get("id_conta_corrente").toString();
				var correntistas = obj.get("correntista").toString();
				var agencias = obj.get("agencia").toString();
				var limites = obj.get("limite").toString();
				var saldos = obj.get("saldo").toString();
				var ativas = obj.get("ativa").toString();
				
				var conta = new ContaCorrenteEntity(Integer.parseInt(idContaCorrentes), correntistas, agencias, limites, saldos, ativas);
				list.add(conta);
			});
	        return list.get(0);	 
        
		} catch (Exception e) {
			throw new ContaCorrenteNaoLocalizadoExcecao("Conta não localizada.");
		}
	}
	
	
	@Override
	public ContaCorrenteEntity buscarContaPorId(int numero_agencia, int id_conta_corrente) {

		
		try {			
			
		
			String sql = "SELECT * FROM t_conta_corrente WHERE id_conta_corrente = "+id_conta_corrente+ "and numero_agencia_fk = "+ numero_agencia;
	
			var contaCorrenteEntiry = jdbcTemplate.queryForList(sql);
			var list = new ArrayList<ContaCorrenteEntity>();
			contaCorrenteEntiry.forEach(obj -> {
				
				var idContaCorrente =  obj.get("id_conta_corrente").toString();
				var correntista = obj.get("correntista").toString();
				var agencia = obj.get("agencia").toString();
				var limite = obj.get("limite").toString();
				var saldo = obj.get("saldo").toString();
				var ativa = obj.get("ativa").toString();
				
				var conta = new ContaCorrenteEntity(Integer.parseInt(idContaCorrente), correntista, agencia, limite, saldo, ativa);
				list.add(conta);
			});
	        return list.get(0);	 
        
		} catch (Exception e) {
			throw new ContaCorrenteNaoLocalizadoExcecao("Conta não localizada.");
		}
	}


	@Override
	public ContaCorrenteEntity buscarContaPorId(int id) {
		try {			
			
			
			String sql = "SELECT * FROM t_conta_corrente WHERE id_conta_corrente = "+id;
	
			var contaCorrenteEntiry = jdbcTemplate.queryForList(sql);
			var list = new ArrayList<ContaCorrenteEntity>();
			contaCorrenteEntiry.forEach(obj -> {
				
				var idContaCorrente =  obj.get("id_conta_corrente").toString();
				var correntista = obj.get("correntista").toString();
				var agencia = obj.get("agencia").toString();
				var limite = obj.get("limite").toString();
				var saldo = obj.get("saldo").toString();
				var ativa = obj.get("ativa").toString();
				
				var conta = new ContaCorrenteEntity(Integer.parseInt(idContaCorrente), correntista, agencia, limite, saldo, ativa);
				list.add(conta);
			});
	        return list.get(0);	 
        
		} catch (Exception e) {
			throw new ContaCorrenteNaoLocalizadoExcecao("Conta não localizada.");
		}
	}	
	
}




