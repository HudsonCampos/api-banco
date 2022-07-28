package br.com.banco.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.banco.interfaces.services.DadosCorrentistaServiceInterface;
import br.com.banco.model.vo.resposta.RespostaCorrentistaSuasContasVO;

@RestController
@RequestMapping(value = "/api-banco/corretista")
public class CorrentistaController {
	
	@Autowired
	private DadosCorrentistaServiceInterface dadosCorrentistaServiceInterface;
	
	@SuppressWarnings("rawtypes")
	@GetMapping(value = "/dados-correntista/{cpf}")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<RespostaCorrentistaSuasContasVO> consultarDadosCorrentista(@PathVariable("cpf") String cpf){
		var vo = dadosCorrentistaServiceInterface.consultarDadosCorrentista(cpf);
		return ResponseEntity.ok(vo);
		
	}

}
