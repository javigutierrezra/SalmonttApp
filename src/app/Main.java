package app;

import model.Direccion;
import model.Persona;
import model.Empleado;

public class Main {
    public static void main(String[] args) {
        Direccion dir1 = new Direccion("Av. Principal 123", "Puerto Montt", "Los Lagos", "Chile");
        Persona persona1 = new Persona("Juan", "Pérez", 30, dir1);
        System.out.println(persona1);
    }
}
