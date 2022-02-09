package com.duda.datastructure.pile.labs;

public class Livro {

	private String nome;
	private int anoLancamento;
	private String autor;
	private String isbn;
	
	public Livro() {
		super();
	}
	public Livro(String nome, int anoLancamento, String autor, String isbn) {
		super();
		this.nome = nome;
		this.anoLancamento = anoLancamento;
		this.autor = autor;
		this.isbn = isbn;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAnoLancamento() {
		return anoLancamento;
	}
	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	@Override
	public String toString() {
		return "Livro [nome=" + nome + ", anoLancamento=" + anoLancamento + ", autor=" + autor + ", isbn=" + isbn + "]";
	}
	
	
}
