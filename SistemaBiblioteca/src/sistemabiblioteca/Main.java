package sistemabiblioteca;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Autor autor1 = new Autor("Gabriel García Márquez", "Colombiano", "1927");
        Autor autor2 = new Autor("Pablo Neruda", "Chileno");

        Libro libro1 = new Libro("Cien años de soledad", "Novela", "Sudamericana", 1967, autor1);
        Libro libro2 = new Libro("Veinte poemas de amor", "Poesía", "Desconocida", autor2);

        Copia copia1 = new Copia(1, libro1);
        Copia copia2 = new Copia(2, libro2);
        Copia copia3 = new Copia(3, libro2);
        Copia copia4 = new Copia(4, libro1);

        Lector lector = new Lector("Juan Pérez", "12345678");

        System.out.println("---- Intentando prestar copias ----");
        lector.prestarCopia(copia1);
        lector.prestarCopia(copia2);
        lector.prestarCopia(copia3);

        boolean prestamoExtra = lector.prestarCopia(copia4);
        if (!prestamoExtra) {
            System.out.println("El lector no puede tener más de 3 libros en préstamo.");
        }

        System.out.println("\n---- Estado del lector ----");
        System.out.println(lector);

        System.out.println("\n---- Copias prestadas al lector ----");
        for (Copia c : lector.getCopiasPrestadas()) {
            System.out.println(c);
        }

        System.out.println("\n---- Simulando que la copia con ID=1 fue prestada hace 40 días (vencida) ----");
        copia1.setFechaPrestamo(LocalDate.now().minusDays(40));

        System.out.println("¿Tiene multa? " + lector.tieneMulta());
        System.out.println("¿Está bloqueado? " + lector.isBloqueado());

        System.out.println("\n---- Intentando prestar una copia nueva mientras hay multa ----");
        boolean intentoPrestamo = lector.prestarCopia(copia4);
        System.out.println("Intento de préstamo: " + (intentoPrestamo ? "Exitoso" : "Fallido"));

        System.out.println("\n---- Devolviendo la copia vencida con ID=1 ----");
        lector.devolverCopia(copia1);

        System.out.println("\n---- Estado después de devolver la copia vencida ----");
        System.out.println(lector);
        for (Copia c : lector.getCopiasPrestadas()) {
            System.out.println(c);
        }

        System.out.println("\n---- Intentando prestar la copia con ID=4 nuevamente ----");
        intentoPrestamo = lector.prestarCopia(copia4);
        System.out.println("Intento de préstamo: " + (intentoPrestamo ? "Exitoso" : "Fallido"));
    }
}
/* RESUMEN DEL MAIN / RESULT FROM MAIN
---- Intentando prestar copias ----
No se puede prestar más de 3 libros.

El lector no puede tener más de 3 libros en préstamo.

---- Estado del lector ----

Lector: Juan Pérez, DNI: 12345678, Bloqueado: false, Libros prestados: 3

---- Copias prestadas al lector ----

Copia ID: 1, Estado: Prestada, Fecha Préstamo: 2025-07-03, Libro: [Cien años de soledad (Novela), Editorial: Sudamericana, Año: 1967, Autor: Gabriel García Márquez (Colombiano) - Nacido el: 1927]

Copia ID: 2, Estado: Prestada, Fecha Préstamo: 2025-07-03, Libro: [Veinte poemas de amor (Poesía), Editorial: Desconocida, Año: Desconocida, Autor: Pablo Neruda (Chileno) - Nacido el: Desconocida]

Copia ID: 3, Estado: Prestada, Fecha Préstamo: 2025-07-03, Libro: [Veinte poemas de amor (Poesía), Editorial: Desconocida, Año: Desconocida, Autor: Pablo Neruda (Chileno) - Nacido el: Desconocida]

---- Simulando que la copia con ID=1 fue prestada hace 40 días (vencida) ----

¿Tiene multa? true

¿Está bloqueado? false

---- Intentando prestar una copia nueva mientras hay multa ----

No se puede prestar, lector bloqueado por multa.

Intento de préstamo: Fallido

---- Devolviendo la copia vencida con ID=1 ----

---- Estado después de devolver la copia vencida ----

Lector: Juan Pérez, DNI: 12345678, Bloqueado: false, Libros prestados: 2

Copia ID: 2, Estado: Prestada, Fecha Préstamo: 2025-07-03, Libro: [Veinte poemas de amor (Poesía), Editorial: Desconocida, Año: Desconocida, Autor: Pablo Neruda (Chileno) - Nacido el: Desconocida]

Copia ID: 3, Estado: Prestada, Fecha Préstamo: 2025-07-03, Libro: [Veinte poemas de amor (Poesía), Editorial: Desconocida, Año: Desconocida, Autor: Pablo Neruda (Chileno) - Nacido el: Desconocida]

---- Intentando prestar la copia con ID=4 nuevamente ----

Intento de préstamo: Exitoso
*/
