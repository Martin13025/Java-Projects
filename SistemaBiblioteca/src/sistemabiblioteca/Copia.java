package sistemabiblioteca;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Copia {
    
    public static final String EN_BIBLIOTECA = "En Biblioteca";
    public static final String PRESTADA = "Prestada";

    private int idCopia;          
    private String estado;        
    private Libro libro;          

    
    private LocalDate fechaPrestamo;

    public Copia(int idCopia, Libro libro) {
        this.idCopia = idCopia;
        this.libro = libro;
        this.estado = EN_BIBLIOTECA;
        this.fechaPrestamo = null;
    }

    public Copia(int idCopia, Libro libro, String estado) {
        this.idCopia = idCopia;
        this.libro = libro;
        this.estado = estado;
        this.fechaPrestamo = null;
    }

    public int getIdCopia() {
        return idCopia;
    }

    public void setIdCopia(int idCopia) {
        this.idCopia = idCopia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    
    public boolean prestar() {
        if (!estado.equals(PRESTADA)) {
            estado = PRESTADA;
            fechaPrestamo = LocalDate.now();
            return true;
        }
        return false;
    }

    
    public void devolver() {
        estado = EN_BIBLIOTECA;
        fechaPrestamo = null;
    }

    
    public boolean estaVencida() {
        if (!estado.equals(PRESTADA) || fechaPrestamo == null) {
            return false;
        }
        long diasPrestamo = ChronoUnit.DAYS.between(fechaPrestamo, LocalDate.now());
        return diasPrestamo > 30;
    }

    @Override
    public String toString() {
        String fechaStr = (fechaPrestamo == null) ? "No prestada" : fechaPrestamo.toString();
        return "Copia ID: " + idCopia + ", Estado: " + estado + ", Fecha Préstamo: " + fechaStr + ", Libro: [" + libro.toString() + "]";
    }
}