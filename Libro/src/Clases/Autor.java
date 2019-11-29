package Clases;

public class Autor {
	private String nombre;
	private String apellido;
	private String nacionalidad;
	
	
	public Autor( ) {
		nombre = "";
		apellido = "";
		nacionalidad = "";
	}
	
	public Autor(String n, String a, String nac) {
		nombre = n;
		apellido = a;
		nacionalidad = nac;
	} 
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String n) {
		nombre = n;
	}
	
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String a) {
		apellido = a;
	}
	
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nac) {
		nacionalidad = nac;
	}	
}
