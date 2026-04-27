package org.example.modelos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Empresa empresa = new Empresa("pedidos ya!!!");

        System.out.print("¿Cuántos empleados quieres registrar? ");
        int cantidad = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        for (int i = 0; i < cantidad; i++) {
            System.out.println("\nRegistro del empleado " + (i + 1));
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Salario base: ");
            double salarioBase = sc.nextDouble();
            sc.nextLine(); // limpiar buffer

            Empleado emp = new Empleado(nombre, salarioBase);
            empresa.agregarEmpleado(emp);

            emp.mostrarSalario();
            System.out.println("Bono: " + emp.calcularBono());
            System.out.println("Salario total: " + emp.calcularSalarioTotal());
            emp.mostrarCondicionDescuento();
        }

        System.out.println("\nResumen de la empresa:");
        empresa.mostrarEmpleados();
        System.out.println("Total de salarios en la empresa: " + empresa.calcularTotalSalarios());

        sc.close();
    }
}
