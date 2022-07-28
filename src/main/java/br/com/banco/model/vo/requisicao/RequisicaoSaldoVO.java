package br.com.banco.model.vo.requisicao;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RequisicaoSaldoVO {

	private Integer numeroAgencia;
	
	private Integer idContaCorrente;
}
