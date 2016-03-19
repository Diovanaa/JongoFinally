package br.edu.unoesc.blog;


import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Post {
	
	private Date data;
	private String titulo;
	private String texto;
	private List<Comentario> comentarios;
	public void setDataCriacao(LocalDate data){
		Instant instant = data.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant();
		Date date = Date.from (instant);
		this.data = date;
		}
	
	public LocalDate getDataLocalDate(){
		return LocalDate.from(data.toInstant());
	}
	
	public void addComentario(Comentario comentario){
		if(comentarios == null){
			comentarios = new ArrayList<>();
			
		}
		comentarios.add(comentario);
	}
}
