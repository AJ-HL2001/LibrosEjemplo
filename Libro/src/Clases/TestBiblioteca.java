package Clases;

public class TestBiblioteca {

	public static void main(String[] args) {
		Autor jkr = new Autor("Joanne​", "Rowling", "Britanica");
		Libro harry = new Libro("Harry Potter","Bloomsbury Publishing",  309, jkr, 1999);
		
		Autor sc = new Autor("Suzanne​", " Collins", "EE.UU");
		Libro jh = new Libro("Los Juegos Del Hambre","Molino",  400, sc, 2008);
		
		Autor vh = new Autor("Victor", "Marie Hugo​", "Frances");
		Libro lm = new Libro("Los Miserables","BlackList", 1332, vh, 1862);
		
		System.out.println(harry.getTitulo() + " tiene " + harry.getNumeroPaginas() + " páginas");
		System.out.println(jh.getTitulo() + " tiene " + jh.getNumeroPaginas() + " páginas");
		System.out.println(lm.getTitulo() + " tiene " + lm.getNumeroPaginas() + " páginas");
	}

}
