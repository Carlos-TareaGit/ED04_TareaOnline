package com.mycompany.hotel.objetos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Representa una habitación en el hotel con su información y métodos para su
 * gestión.
 *
 * @author Serrano López, Carlos
 * @version 1.0
 */
public class HabitacionCSL {

    private final int idHabitacion;
    private String tipo;
    private int numeroCamas;
    private double costePorDia;

    /**
     * Constructor para inicializar una habitación con su ID.
     *
     * @param idHabitacion Identificador único de la habitación.
     */
    public HabitacionCSL(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    /**
     * Obtiene el ID de la habitación.
     *
     * @return ID de la habitación.
     */
    public int getIdHabitacion() {
        return idHabitacion;
    }

    /**
     * Obtiene el tipo de la habitación.
     *
     * @return Tipo de la habitación.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Obtiene el número de camas de la habitación.
     *
     * @return Número de camas de la habitación.
     */
    public int getNumeroCamas() {
        return numeroCamas;
    }

    /**
     * Obtiene el coste por día de la habitación.
     *
     * @return Coste por día de la habitación.
     */
    public double getCostePorDia() {
        return costePorDia;
    }

    /**
     * Establece el tipo de la habitación.
     *
     * @param tipo Tipo de la habitación.
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Establece el número de camas de la habitación.
     *
     * @param numeroCamas Número de camas de la habitación.
     */
    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    /**
     * Establece el coste por día de la habitación.
     *
     * @param costePorDia Coste por día de la habitación.
     */
    public void setCostePorDia(double costePorDia) {
        this.costePorDia = costePorDia;
    }

    /**
     * Crea una nueva habitación y la agrega a la lista de habitaciones.
     *
     * @param teclado El scanner utilizado para leer los datos de la habitación.
     * @param habitacion El objeto habitación que se creará.
     * @param habitaciones La lista de habitaciones a la que se añadirá la nueva
     * habitación.
     * @return El objeto habitación recién creado.
     */
    public static HabitacionCSL crearHabitacion(Scanner teclado, HabitacionCSL habitacion, ArrayList<HabitacionCSL> habitaciones) {
        int idHabitacion;
        String tipo;
        int numeroCamas;
        double costePorDia;
        System.out.println("Introduzca el id de la nueva habitación: ");
        idHabitacion = teclado.nextInt();
        habitacion = new HabitacionCSL(idHabitacion);
        teclado.nextLine();
        System.out.println("Introduzca el tipo de la nueva habitación: ");
        tipo = teclado.nextLine();
        habitacion.setTipo(tipo);
        System.out.println("Introduzca número de camas de la nueva habitación: ");
        numeroCamas = teclado.nextInt();
        habitacion.setNumeroCamas(numeroCamas);
        System.out.println("Introduzca el coste por día de la nueva habitación: ");
        costePorDia = teclado.nextDouble();
        habitacion.setCostePorDia(costePorDia);
        teclado.nextLine();
        habitaciones.add(habitacion);
        return habitacion;
    }

    /**
     * Método para borrar una habitación.
     *
     * @param teclado El objeto Scanner para la entrada de datos.
     * @param habitaciones La lista de habitaciones donde se buscará la
     * habitación a eliminar.
     * @param habitacion La habitación a eliminar de la lista.
     * @return El objeto `HabitacionCSL` eliminado, o null si no se encontró.
     */

    public static HabitacionCSL borrarHabitacion(Scanner teclado, ArrayList<HabitacionCSL> habitaciones, HabitacionCSL habitacion) {
        int idCliente;
        System.out.println("Introduzca el id de la habitación a eliminar: ");
        idCliente = teclado.nextInt();
        if (habitaciones.isEmpty()) {
            System.out.println("No hay habitaciones para borrar...");
        } else {

            for (HabitacionCSL clienteABorrar : habitaciones) {
                if (clienteABorrar.getIdHabitacion() == idCliente) {
                    habitacion = clienteABorrar;
                }
            }
            habitaciones.remove(habitacion);
        }
        return habitacion;

    }

    /**
     * Muestra la lista de habitaciones registradas en el sistema.
     *
     * @param habitaciones Lista de habitaciones a mostrar.
     */
    public static void mostrarHabitacion(ArrayList<HabitacionCSL> habitaciones) {
        if (habitaciones.isEmpty()) {
            System.out.println("No hay habitaciones para mostrar...");
        } else {

            for (HabitacionCSL habitacionAMostrar : habitaciones) {
                System.out.println("ID: " + habitacionAMostrar.getIdHabitacion());
                System.out.println("Tipo: " + habitacionAMostrar.getTipo());
                System.out.println("Número de camas: " + habitacionAMostrar.getNumeroCamas());
                System.out.println("Coste por día: " + habitacionAMostrar.getCostePorDia());
                System.out.println("");
            }
        }
    }
}
