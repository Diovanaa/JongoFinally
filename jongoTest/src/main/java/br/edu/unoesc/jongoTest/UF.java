package br.edu.unoesc.jongoTest;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UF {

	public static final String NOME_COLLECTION = UF.class.getSimpleName().toLowerCase();
	
	private String nome;
	private String sigla;
}
