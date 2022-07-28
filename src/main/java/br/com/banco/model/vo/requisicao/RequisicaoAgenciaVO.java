package br.com.banco.model.vo.requisicao;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RequisicaoAgenciaVO {

	private Integer numeroAgencia;

	private String nome;

	private String endereco;

}





