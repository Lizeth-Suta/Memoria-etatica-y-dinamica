import java.util.ArrayList;
import java.util.Scanner;

class Empleado {
    private static int contadorEmpleados = 0;
    private int id;
    private String nombre;
    private double salario;

    public Empleado(String nombre, double salario) {
        this.id = ++contadorEmpleados;
        this.nombre = nombre;
        this.salario = salario;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public double getSalario() { return salario; }

    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Salario: " + salario;
    }
}

class GestionEmpleados {
    private ArrayList<Empleado> listaEmpleados;

    public GestionEmpleados() {
        this.listaEmpleados = new ArrayList<>();
    }

    public void agregarEmpleado(String nombre, double salario) {
        Empleado nuevoEmpleado = new Empleado(nombre, salario);
        listaEmpleados.add(nuevoEmpleado);
        System.out.println("Empleado agregado: " + nuevoEmpleado);
    }

    public void listarEmpleados() {
        if (listaEmpleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
            return;
        }
        System.out.println("Lista de empleados:");
        for (Empleado emp : listaEmpleados) {
            System.out.println(emp);
        }
    }
}

