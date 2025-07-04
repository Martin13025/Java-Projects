package sistemabiblioteca;


public class Autor {

    private String nombre;               
    private String nacionalidad;        
    private String fechaNacimiento;      


    public Autor(String nombre, String nacionalidad, String fechaNacimiento) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.fechaNacimiento = fechaNacimiento;
    }

 
    public Autor(String nombre, String nacionalidad) {
        this(nombre, nacionalidad, "Desconocida");
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }


    @Override
    public String toString() {
        return nombre + " (" + nacionalidad + ") - Nacido el: " + fechaNacimiento;
    }
}


