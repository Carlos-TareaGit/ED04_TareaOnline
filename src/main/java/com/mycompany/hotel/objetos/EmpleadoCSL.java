package com.mycompany.hotel.objetos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase que representa a un empleado del hotel, conteniendo sus datos
 * personales y métodos para la gestión de los mismos. Permite crear, borrar y
 * mostrar empleados en el sistema.
 *
 * @author Serrano López, Carlos
 * @version 1.0
 */
public class EmpleadoCSL {

    private final int idEmpleado;
    private String nombre;
    private String apellidos;
    private String DNI;
    private int numeroTelefono;

    /**
     * Constructor de la clase EmpleadoCSL.
     *
     * @param idEmpleado Identificador único del empleado.
     */
    public EmpleadoCSL(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    /**
     * Obtiene el ID del empleado.
     *
     * @return El ID del empleado.
     */
    public int getIdEmpleado() {
        return idEmpleado;
    }

    /**
     * Obtiene el nombre del empleado.
     *
     * @return El nombre del empleado.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene los apellidos del empleado.
     *
     * @return Los apellidos del empleado.
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Obtiene el DNI del empleado.
     *
     * @return El DNI del empleado.
     */
    public String getDNI() {
        return DNI;
    }

    /**
     * Obtiene el número de teléfono del empleado.
     *
     * @return El número de teléfono del empleado.
     */
    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    /**
     * Establece el nombre del empleado.
     *
     * @param nombre El nombre del empleado.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Establece los apellidos del empleado.
     *
     * @param apellidos Los apellidos del empleado.
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * Establece el DNI del empleado.
     *
     * @param DNI El DNI del empleado.
     */
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    /**
     * Establece el número de teléfono del empleado.
     *
     * @param numeroTelefono El número de teléfono del empleado.
     */
    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

   /**
 * Crea un nuevo empleado y lo añade a la lista de empleados.
 * 
 * @param teclado El scanner utilizado para leer los datos de entrada.
 * @param empleado El objeto empleado que se creará.
 * @param empleados La lista de empleados a la que se añadirá el nuevo empleado.
 * @return El objeto empleado recién creado.
 */
    public static EmpleadoCSL crearEmpleado(Scanner teclado, EmpleadoCSL empleado, ArrayList<EmpleadoCSL> empleados) {
        int idEmpleado;
        String nombre;
        String apellidos;
        String DNI;
        int numeroTelefono;
        System.out.println("Introduzca el id del nuevo empleado: ");
        idEmpleado = teclado.nextInt();
        empleado = new EmpleadoCSL(idEmpleado);
        teclado.nextLine();
        System.out.println("Introduzca el nombre del nuevo empleado: ");
        nombre = teclado.nextLine();
        empleado.setNombre(nombre);
        System.out.println("Introduzca los apellidos del nuevo empleado: ");
        apellidos = teclado.nextLine();
        empleado.setApellidos(apellidos);
        System.out.println("Introduzca el DNI del nuevo empleado: ");
        DNI = teclado.nextLine();
        empleado.setDNI(DNI);
        System.out.println("Introduzca el número de teléfono del nuevo empleado: ");
        numeroTelefono = teclado.nextInt();
        empleado.setNumeroTelefono(numeroTelefono);
        empleados.add(empleado);
        return empleado;
    }

    /**
 * Elimina un empleado de la lista de empleados según el ID.
 * 
 * @param teclado El scanner utilizado para leer el ID del empleado a eliminar.
 * @param empleados La lista de empleados de la que se eliminará un empleado.
 * @param empleado El objeto empleado que se eliminará de la lista.
 * @return El empleado eliminado o null si no se encuentra.
 */
    public static EmpleadoCSL borrarEmpleado(Scanner teclado, ArrayList<EmpleadoCSL> empleados, EmpleadoCSL empleado) {
        int idCliente;
        System.out.println("Introduzca el id del empleado a dar de baja: ");
        idCliente = teclado.nextInt();
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados para dar de baja...");
        } else {

            for (EmpleadoCSL clienteABorrar : empleados) {
                if (clienteABorrar.getIdEmpleado() == idCliente) {
                    empleado = clienteABorrar;

                }
            }
            empleados.remove(empleado);
        }
        return empleado;
    }

    /**
     * Muestra la información de todos los empleados registrados en el sistema.
     *
     * @param empleados Lista de empleados que se mostrarán.
     */
    public static void mostrarEmpleados(ArrayList<EmpleadoCSL> empleados) {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados para mostrar...");
        } else {

            for (EmpleadoCSL empleadoAMostrar : empleados) {
                System.out.println("ID: " + empleadoAMostrar.getIdEmpleado());
                System.out.println("Nombre: " + empleadoAMostrar.getNombre());
                System.out.println("Apellidos: " + empleadoAMostrar.getApellidos());
                System.out.println("DNI: " + empleadoAMostrar.getDNI());
                System.out.println("Número de teléfono: " + empleadoAMostrar.getNumeroTelefono());
                System.out.println("");
            }
        }
        return;
    }
}
