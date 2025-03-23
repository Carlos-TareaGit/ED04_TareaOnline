package com.mycompany.hotel.objetos;

import java.util.ArrayList;
import java.util.Scanner;

public class ClienteCSL {
    private final int idCliente;
    private String nombre;
    private String apellidos;
    private String DNI;
    private int numeroTelefono;

    public ClienteCSL(int idCliente) {
        this.idCliente = idCliente;
    }

    /**
     * @return the idCliente
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @return the DNI
     */
    public String getDNI() {
        return DNI;
    }

    /**
     * @return the numeroTelefono
     */
    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @param DNI the DNI to set
     */
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    /**
     * @param numeroTelefono the numeroTelefono to set
     */
    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
     public static void crearCliente(Scanner teclado, ArrayList<ClienteCSL> clientes) {
        int idCliente;
        ClienteCSL cliente;
        String nombre;
        String apellidos;
        int numeroTelefono;
        System.out.println("Introduzca el id del nuevo cliente: ");
        idCliente = teclado.nextInt();
        cliente = new ClienteCSL(idCliente);
        teclado.nextLine();
        System.out.println("Introduzca el nombre del nuevo cliente: ");
        nombre = teclado.nextLine();
        cliente.setNombre(nombre);
        System.out.println("Introduzca los apellidos del nuevo cliente: ");
        apellidos = teclado.nextLine();
        cliente.setApellidos(apellidos);
        System.out.println("Introduzca el DNI del nuevo cliente: ");
        cliente.setDNI(teclado.nextLine());
        System.out.println("Introduzca el número de teléfono del nuevo cliente: ");
        numeroTelefono = teclado.nextInt();
        cliente.setNumeroTelefono(numeroTelefono);
        clientes.add(cliente);
        return;
    }
      public static void borrarCliente(Scanner teclado, ArrayList<ClienteCSL> clientes) {
        int idCliente;
        System.out.println("Introduzca el id del cliente a dar de baja: ");
        idCliente = teclado.nextInt();
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes para dar de baja...");
        } else {
            for (ClienteCSL clienteABorrar : clientes) {
                if (clienteABorrar.getIdCliente() == idCliente) {
                    clientes.remove(clienteABorrar);
                }
            }
        }
    }
 public static void mostrarClientes(ArrayList<ClienteCSL> clientes) {
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes para mostrar...");
        } else {
            for (ClienteCSL clienteAMostrar : clientes) {
                System.out.println("ID: " + clienteAMostrar.getIdCliente());
                System.out.println("Nombre: " + clienteAMostrar.getNombre());
                System.out.println("Apellidos: " + clienteAMostrar.getApellidos());
                System.out.println("DNI: " + clienteAMostrar.getDNI());
                System.out.println("Número de teléfono: " + clienteAMostrar.getNumeroTelefono());
                System.out.println("");
            }
        }
        return;
    }
}
