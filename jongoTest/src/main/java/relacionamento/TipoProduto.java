package relacionamento;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.bson.types.ObjectId;

@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class TipoProduto {

	private ObjectId _Id;
	private String nome;
	
	public TipoProduto(String nome){
		this.nome = nome;
	}
}
