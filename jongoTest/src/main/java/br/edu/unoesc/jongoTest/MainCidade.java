package br.edu.unoesc.jongoTest;

import org.jongo.Jongo;
import org.jongo.MongoCollection;
import org.jongo.MongoCursor;

import com.mongodb.DB;
import com.mongodb.MongoClient;

public class MainCidade {

	public static void main(String[] args) {
		MongoClient mongoClient = new MongoClient("localhost", 27017);
		DB db = mongoClient.getDB("test");
		
		Jongo jongo = new Jongo(db);
		
		MongoCollection collectionCidades = 
				jongo.getCollection(Cidade.NOME_COLLECTION);
		
		MongoCursor<Cidade> cursorCidade = collectionCidades
											.find().as(Cidade.class);
		
		cursorCidade
			.forEach(c->
				System.out.println(c.getNome()+" - "+c.getNomeUf()));
		
		Cidade xaxim = new Cidade();
		xaxim.setNome("Xaxim");
		UF uf = new UF();
		uf.setNome("Santa Catarina");
		uf.setSigla("SC");
		xaxim.setUf(uf);
		
		collectionCidades.insert(xaxim);
	}
}
