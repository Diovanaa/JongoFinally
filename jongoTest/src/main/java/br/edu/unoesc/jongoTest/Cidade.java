package br.edu.unoesc.jongoTest;

import org.bson.types.ObjectId;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Cidade {

	public static final String NOME_COLLECTION = Cidade.class.getSimpleName().toLowerCase();
	
	private ObjectId _id;
	private String nome;
	private UF uf;
	
	public String getNomeUf(){
		if(uf != null){
			return uf.getNome();
		}
		return "";
	}
}

