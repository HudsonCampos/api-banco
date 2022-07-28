package br.com.banco.model.vo.resposta;

import lombok.Data;

@Data
public class RespostaAgenciaComContaVO {
	
	private Integer numeroAgencia;
	
	private Integer idContaCorrente;
	
	private boolean comun;

}
