package com.mycompany.hotel.objetos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase que representa un cliente del hotel. Contiene información personal como
 * nombre, apellidos, DNI y número de teléfono. También proporciona métodos para
 * crear, eliminar y mostrar clientes.
 *
 * @author Serrano López, Carlos
 * @version 1.0
 */
public class ClienteCSL {

    private final int idCliente;
    private String nombre;
    private String apellidos;
    private String DNI;
    private int numeroTelefono;

    /**
     * Constructor de ClienteCSL.
     *
     * @param idCliente Identificador único del cliente.
     */
    public ClienteCSL(int idCliente) {
        this.idCliente = idCliente;
    }

    /**
     * Obtiene el ID del cliente.
     *
     * @return ID del cliente.
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * Obtiene el nombre del cliente.
     *
     * @return Nombre del cliente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene los apellidos del cliente.
     *
     * @return Apellidos del cliente.
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Obtiene el DNI del cliente.
     *
     * @return DNI del cliente.
     */
    public String getDNI() {
        return DNI;
    }

    /**
     * Obtiene el número de teléfono del cliente.
     *
     * @return Número de teléfono del cliente.
     */
    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    /**
     * Establece el nombre del cliente.
     *
     * @param nombre Nuevo nombre del cliente.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Establece los apellidos del cliente.
     *
     * @param apellidos Nuevos apellidos del cliente.
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * Establece el DNI del cliente.
     *
     * @param DNI Nuevo DNI del cliente.
     */
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    /**
     * Establece el número de teléfono del cliente.
     *
     * @param numeroTelefono Nuevo número de teléfono del cliente.
     */
    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    /**
     * Crea un nuevo cliente y lo añade a la lista de clientes.
     *
     * @param teclado Scanner para la entrada de datos.
     * @param clientes Lista donde se almacenarán los clientes.
     */
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

    /**
     * Elimina un cliente de la lista por su ID.
     *
     * @param teclado Scanner para la entrada de datos.
     * @param clientes Lista de clientes registrados.
     */
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

    /**
     * Muestra la lista de clientes registrados.
     *
     * @param clientes Lista de clientes registrados.
     */
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
