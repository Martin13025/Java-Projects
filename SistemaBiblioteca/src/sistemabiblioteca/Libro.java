package sistemabiblioteca;

public class Libro {

	private String nombre;
	private String tipo;
	private String editorial;
	private int año;
	private Autor autor;
	
	public Libro(String nombre, String tipo, String editorial, int año, Autor autor) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.editorial = editorial;
		this.año = año;
		this.autor = autor;
	}
	
	public Libro(String nombre, String tipo, String editorial, Autor autor) {
		this(nombre, tipo, editorial, 0, autor);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	
	
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
	}
	
	
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	
	@Override
	public String toString() {
	    String añoStr = (año == 0) ? "Desconocida" : String.valueOf(año);
	    return nombre + " (" + tipo + "), Editorial: " + editorial + ", Año: " + añoStr + ", Autor: " + autor;
	}
}
