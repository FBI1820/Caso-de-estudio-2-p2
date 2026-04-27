package org.example.modelos;

import java.util.ArrayList;


public class Empresa {
    String nombre;
    ArrayList<Empleado> empleados;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado emp) {
        empleados.add(emp);
    }

    public double calcularTotalSalarios() {
        double total = 0;
        for (Empleado e : empleados) {
            total += e.calcularSalarioTotal();
        }
        return total;
    }

    public void mostrarEmpleados() {
        System.out.println("Empleados de la empresa " + nombre + ":");
        for (Empleado e : empleados) {
            System.out.println("- " + e.nombre + " | Salario total: " + e.calcularSalarioTotal());
        }
    }
}

