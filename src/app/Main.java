package app;

import model.*;
import util.RutInvalidoException;

/**
 * Clase principal: crea objetos, valida RUT con excepción personalizada,
 * y muestra resultados por consola usando toString().
 */
public class Main {
    public static void main(String[] args) {
        try {
            // 1) Objetos de soporte
            Rut rutValido = new Rut("12345678-K"); // Cambia para probar validación
            Direccion dir = new Direccion("Av. Austral", 1234, "Mirasol", "Puerto Montt", "Los Lagos");

            // 2) Persona y Empleado
            Persona p1 = new Persona(rutValido, "Andrea", "Silva", dir);
            Empleado e1 = new Empleado(
                    new Rut("15222333-1"),
                    "Carla",
                    "Oyarzo",
                    new Direccion("Los Salmónidos", 456, "Chinquihue", "Puerto Montt", "Los Lagos"),
                    "EMP-001",
                    "Jefa de Planta",
                    1_500_000
            );

            // 3) Salida por consola
            System.out.println("========== PERSONA ==========");
            System.out.println(p1);

            System.out.println("\n========== EMPLEADO ==========");
            System.out.println(e1);

        } catch (RutInvalidoException e) {
            // Si el RUT es inválido, se captura aquí con mensaje claro
            System.out.println("❌ Error de RUT: " + e.getMessage());
        }
    }
}
