package br.com.banco.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CorrentistaEntity {	

	private Integer idCorrentista;
	
	private String nome;
	
	private String cpf;
	
	private LocalDate dataNascimento;
	
}
