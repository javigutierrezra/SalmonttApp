# SalmonttApp

## Descripción
SalmonttApp es un prototipo en Java que representa la información de las personas que interactúan con la empresa salmonera Salmontt.  
El sistema organiza datos de empleados y otras personas mediante clases bien definidas, aplicando **encapsulamiento, composición y herencia**, cumpliendo buenas prácticas de programación orientada a objetos.  

---

## Estructura de paquetes y clases

- `model`
  - `Direccion.java` → representa la dirección de una persona.
  - `Persona.java` → clase base que contiene información general de una persona.
  - `Empleado.java` → hereda de Persona, agrega cargo y departamento.
- `app`
  - `Main.java` → clase principal para ejecutar el programa y probar el modelo.

---

## Funcionalidades del prototipo

- Crear instancias de `Persona` y `Empleado` con sus respectivas direcciones.
- Aplicar **composición**, donde una persona tiene una dirección.
- Aplicar **herencia**, donde `Empleado` extiende a `Persona`.
- Imprimir información de los objetos usando `toString()`.

---

## Ejecución del programa

1. Abrir el proyecto en NetBeans.
2. Hacer clic derecho sobre `Main.java` → **Run File**.
3. La salida por consola mostrará la información de las personas y empleados creados.  
   Ejemplo de salida:
   Juan Pérez, 30 años, Dirección: Av. Principal 123, Puerto Montt, Los Lagos, Chile.

---

## Requisitos cumplidos

- Proyecto Java organizado en paquetes (`model` y `app`).
- Clases con **atributos encapsulados** y métodos getters/setters.
- Uso de **composición** (`Persona` tiene `Direccion`).
- Uso de **herencia** (`Empleado` extiende `Persona`).
- Clase `Main` para probar instancias y mostrar resultados por consola.
