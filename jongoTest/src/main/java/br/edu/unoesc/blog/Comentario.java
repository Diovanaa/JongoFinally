package br.edu.unoesc.blog;


import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Comentario {
	
	private Date data;
	private String autor;
	private String comentarios;
	
	public void setDataCriacao(LocalDate data){
		Instant instant = data.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant();
		Date date = Date.from (instant);
		this.data = date;
		}

}

