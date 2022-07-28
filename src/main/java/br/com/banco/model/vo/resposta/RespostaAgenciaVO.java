package br.com.banco.model.vo.resposta;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RespostaAgenciaVO {

	private Integer numeroAgencia;

	private String nome;

	private String endereco;

}





