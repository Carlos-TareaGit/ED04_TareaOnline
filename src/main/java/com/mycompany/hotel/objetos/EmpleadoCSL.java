package com.mycompany.hotel.objetos;

import java.util.ArrayList;
import java.util.Scanner;

public class EmpleadoCSL {
    private final int idEmpleado;
    private String nombre;
    private String apellidos;
    private String DNI;
    private int numeroTelefono;

    public EmpleadoCSL(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    /**
     * @return the idEmpleado
     */
    public int getIdEmpleado() {
        return idEmpleado;
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
