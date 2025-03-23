package com.mycompany.hotel.objetos;

import java.util.ArrayList;
import java.util.Scanner;

public class HabitacionCSL {
    private final int idHabitacion;
    private String tipo;
    private int numeroCamas;
    private double costePorDia;

    public HabitacionCSL(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    /**
     * @return the idHabitacion
     */
    public int getIdHabitacion() {
        return idHabitacion;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @return the numeroCamas
     */
    public int getNumeroCamas() {
        return numeroCamas;
    }

    /**
     * @return the costePorDia
     */
    public double getCostePorDia() {
        return costePorDia;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @param numeroCamas the numeroCamas to set
     */
    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    /**
     * @param costePorDia the costePorDia to set
     */
    public void setCostePorDia(double costePorDia) {
        this.costePorDia = costePorDia;
    }
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
