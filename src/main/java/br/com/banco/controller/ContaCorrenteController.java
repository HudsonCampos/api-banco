package br.com.banco.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.banco.interfaces.services.ContaCorrenteServiceInterface;
import br.com.banco.interfaces.services.DepositoServiceInterface;
import br.com.banco.interfaces.services.DesabilitaContaServiceInterface;
import br.com.banco.interfaces.services.SaldoServiceInterface;
import br.com.banco.interfaces.services.SaqueServiceInterface;
import br.com.banco.interfaces.services.TransferenciaServiceInterface;
import br.com.banco.model.vo.requisicao.RequisicaoCorrentistaSaldoLimiteVO;
import br.com.banco.model.vo.requisicao.RequisicaoDepositoVO;
import br.com.banco.model.vo.requisicao.RequisicaoSaldoVO;
import br.com.banco.model.vo.requisicao.RequisicaoSaqueVO;
import br.com.banco.model.vo.requisicao.RequisicaoTransfrenciaVO;
import br.com.banco.model.vo.resposta.RespostaContaCorrenteVO;

@RestController
@RequestMapping(value = "/api-banco/conta-corrente")
public class ContaCorrenteController {

	@Autowired
	private ContaCorrenteServiceInterface contaCorrenteServiceInterface;
	
	@Autowired
	private SaldoServiceInterface saldoServiceInterface;
	
	@Autowired
	private DepositoServiceInterface depositoServiceInterface;
	
	@Autowired
	private SaqueServiceInterface saqueServiceInterface;
	
	@Autowired
	private TransferenciaServiceInterface TransferenciaServiceInterface;	
	
	
	@Autowired
	private DesabilitaContaServiceInterface desabilitaContaServiceInterface;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<RespostaContaCorrenteVO> cadastrar(@RequestBody RequisicaoCorrentistaSaldoLimiteVO requisicaoCorrentistaSaldoLimiteVO){
	
		var vo = contaCorrenteServiceInterface.cadastrar(requisicaoCorrentistaSaldoLimiteVO);
		
		return ResponseEntity.ok(vo);
	}
	
	@GetMapping(value = "/saldo")
	@ResponseStatus(HttpStatus.OK)
	public BigDecimal consultarSaldo(@RequestBody RequisicaoSaldoVO requisicaoSaldoVO){
		
		var vo = saldoServiceInterface.consultarSaldo(requisicaoSaldoVO);
		return vo;
	}
	
	@PostMapping(value = "/deposito")
	@ResponseStatus(HttpStatus.OK)
	public BigDecimal realizarDeposito(@RequestBody RequisicaoDepositoVO requisicaoDepositoVO){
		var vo = depositoServiceInterface.realizarDeposito(requisicaoDepositoVO);
		return vo;
	}
	
	@PostMapping(value = "/saque")
	@ResponseStatus(HttpStatus.OK)
	public BigDecimal realizarSaque(@RequestBody RequisicaoSaqueVO requisicaoSaqueVO){
		var vo = saqueServiceInterface.realizarSaque(requisicaoSaqueVO);
		return vo;
	}
	
	
	@PostMapping(value = "/transferencia")
	@ResponseStatus(HttpStatus.OK)
	public BigDecimal realizarTransferencia(@RequestBody RequisicaoTransfrenciaVO requisicaoTransfrenciaVO){
		var vo = TransferenciaServiceInterface.realizarTransferencia(requisicaoTransfrenciaVO);
		return vo;
	}
	
	
	
	@PatchMapping(value = "/desabilitar-conta/{numeroAgencia}/{idConta}/{ativar}")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<RespostaContaCorrenteVO> desabilitarConta(@PathVariable("numeroAgencia") int numeroAgencia,
																	@PathVariable("idConta") int idConta,
																	@PathVariable("ativar") Boolean ativar){
		var vo = desabilitaContaServiceInterface.desabilitarConta(numeroAgencia, idConta, ativar);
		return ResponseEntity.ok(vo);
		
	}
	
	
	
}
