package modelo;

import java.util.Date;

public class Topico {
	
	private int id;
	
	private String titulo;
	
	private int quantidadedeMensagem;
	
	private String post;
	
	private String autor;
	
	private Date data;
	
	public Topico() {


		
	}

	public Topico(int id, String titulo, int quantidadedeMensagem, String post,
			String autor, Date data) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.quantidadedeMensagem = quantidadedeMensagem;
		this.post = post;
		this.autor = autor;
		this.data = data;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getQuantidadedeMensagem() {
		return quantidadedeMensagem;
	}

	public void setQuantidadedeMensagem(int quantidadedeMensagem) {
		this.quantidadedeMensagem = quantidadedeMensagem;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	
	
	

}
