package br.com.banco.model.vo.requisicao;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.Data;

@Data
public class RequisicaoCorrentistaSaldoLimiteVO {
	
	private Integer numeroAgencia;
	
	private String nome;
	
	private String cpf;
	
	private LocalDate dataNascimento;
	
	private BigDecimal limite;

	private BigDecimal saldo;
	
}
