package relacionamento;

import lombok.Getter;
import lombok.Setter;

import org.bson.types.ObjectId;

@Getter @ Setter
public class Produto {
	
	private ObjectId _id;
	private String nome;
	private Double valor;
	
	private ObjectId idTipoProduto;
	
	
	
}
