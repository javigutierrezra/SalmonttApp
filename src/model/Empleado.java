package model;

public class Empleado extends Persona {
    private String cargo;
    private String departamento;

    public Empleado(String nombre, String apellido, int edad, Direccion direccion,
                    String cargo, String departamento) {
        super(nombre, apellido, edad, direccion);
        this.cargo = cargo;
        this.departamento = departamento;
    }

    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }

    public String getDepartamento() { return departamento; }
    public void setDepartamento(String departamento) { this.departamento = departamento; }

    @Override
    public String toString() {
        return super.toString() + ", Cargo: " + cargo + ", Departamento: " + departamento;
    }
}
