package sistemabiblioteca;

import java.util.ArrayList;
import java.util.List;

public class Lector {
    private String nombre;                  
    private String dni;                      
    private List<Copia> copiasPrestadas;    
    private boolean bloqueado;              

    public Lector(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.copiasPrestadas = new ArrayList<>();  
        this.bloqueado = false;                  
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public List<Copia> getCopiasPrestadas() {
        return copiasPrestadas;
    }

    public boolean isBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(boolean bloqueado) {
        this.bloqueado = bloqueado;
    }

    
    public boolean tieneMulta() {
        for (Copia copia : copiasPrestadas) {
            if (copia.estaVencida()) {
                return true;
            }
        }
        return false;
    }

   
    public boolean prestarCopia(Copia copia) {
        if (tieneMulta()) {
            System.out.println("No se puede prestar, lector bloqueado por multa.");
            bloqueado = true;
            return false;
        }
        if (copiasPrestadas.size() >= 3) {
            System.out.println("No se puede prestar más de 3 libros.");
            return false;
        }
        if (copia.prestar()) {
            copiasPrestadas.add(copia);
            return true;
        } else {
            System.out.println("La copia ya está prestada.");
            return false;
        }
    }

    
    public boolean devolverCopia(Copia copia) {
        if (copiasPrestadas.remove(copia)) {
            copia.devolver();
            if (!tieneMulta()) {
                bloqueado = false; 
            }
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Lector: " + nombre + ", DNI: " + dni + ", Bloqueado: " + bloqueado + ", Libros prestados: " + copiasPrestadas.size();
    }
}