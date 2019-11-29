package Clases;

public class Libro {
	private String titulo;
	private String editorial;
	private Autor autor;
	private int numero_paginas;
	private int ano_publicacion;
	
	
	public Libro() {
		titulo = "";
		autor = new Autor();
		editorial = "";
		numero_paginas = 0;
		ano_publicacion =0;
		
 	}
	
	public Libro(String t, String e, int is, Autor a, int ap) {
		titulo = t;
		autor = a;
		editorial = e;
		numero_paginas = is;
		ano_publicacion = ap;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String t) {
		titulo = t;
	}
	
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String e) {
		editorial = e;
	}
	
	public int getNumeroPaginas() {
		return numero_paginas;
	}
	public void setNumeroPaginas(int np) {
		numero_paginas = np;
	}
	
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor a) {
		autor = a;
	}
	
	public int getAnoPublicacion() {
		return ano_publicacion;
	}
	public void setIsbn(int ap) {
		ano_publicacion = ap;
	}
}
