package br.com.banco.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AgenciaEntity {

	private Integer numeroAgencia;

	private String nome;

	private String endereco;

}





