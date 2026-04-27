package org.example.modelos;

public class Empleado {
    String nombre;
    double salarioBase;

    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    // Método sin retorno
    public void mostrarSalario() {
        System.out.println("Salario base: " + salarioBase);
    }

    // Método con retorno
    public double calcularBono() {
        return salarioBase * 0.10;
    }

    // Método con retorno que reutiliza otro método
    public double calcularSalarioTotal() {
        return salarioBase + calcularBono();
    }

    // Método con retorno boolean
    public boolean aplicaDescuento() {
        return salarioBase > 400;
    }

    // Método sin retorno que muestra mensaje según condición
    public void mostrarCondicionDescuento() {
        if (aplicaDescuento()) {
            System.out.println("El empleado aplica a descuento.");
        } else {
            System.out.println("El empleado no aplica a descuento.");
        }
    }
}
