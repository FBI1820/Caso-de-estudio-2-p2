package org.example;

import org.example.models.Cliente;
import org.example.models.Tienda;


public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Ana");
        Tienda tienda = new Tienda();

        cliente.realizarPedido(tienda, "Laptop", 2);
    }
}