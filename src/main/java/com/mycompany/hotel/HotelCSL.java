package com.mycompany.hotel;

import com.mycompany.hotel.objetos.ClienteCSL;
import static com.mycompany.hotel.objetos.ClienteCSL.borrarCliente;
import static com.mycompany.hotel.objetos.ClienteCSL.crearCliente;
import static com.mycompany.hotel.objetos.ClienteCSL.mostrarClientes;
import com.mycompany.hotel.objetos.EmpleadoCSL;
import static com.mycompany.hotel.objetos.EmpleadoCSL.borrarEmpleado;
import static com.mycompany.hotel.objetos.EmpleadoCSL.crearEmpleado;
import static com.mycompany.hotel.objetos.EmpleadoCSL.mostrarEmpleados;
import com.mycompany.hotel.objetos.HabitacionCSL;
import static com.mycompany.hotel.objetos.HabitacionCSL.borrarHabitacion;
import static com.mycompany.hotel.objetos.HabitacionCSL.crearHabitacion;
import static com.mycompany.hotel.objetos.HabitacionCSL.mostrarHabitacion;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * Clase principal del programa HotelCSL, que gestiona las operaciones del sistema de hotel,
 * incluyendo el registro y la eliminación de clientes, empleados y habitaciones, así como la visualización
 * de los datos de cada entidad.
 * 
 * @author Serrano López, Carlos
 * @version 1.0
 */
public class HotelCSL {
/**
     * Método principal que ejecuta el programa del hotel. Gestiona el menú y las opciones que el usuario
     * puede seleccionar para interactuar con el sistema de hotel.
     * 
     * @param args Argumentos de la línea de comandos (no se utilizan en este caso).
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        ArrayList<ClienteCSL> clientes = new ArrayList<ClienteCSL>();
        ArrayList<EmpleadoCSL> empleados = new ArrayList<EmpleadoCSL>();
        ArrayList<HabitacionCSL> habitaciones = new ArrayList<HabitacionCSL>();

        ClienteCSL cliente = null;
        EmpleadoCSL empleado = null;
        HabitacionCSL habitacion = null;
        int idCliente; 
        int idEmpleado;
        String nombre;
        String apellidos;
        String DNI;
        int numeroTelefono;
        int idHabitacion;
        String tipo;
        int numeroCamas;
        double costePorDia;

        int opcion = 10;

        do {
            System.out.println("1. Registrar cliente.");
            System.out.println("2. Dar de baja a un cliente.");
            System.out.println("3. Registrar empleado.");
            System.out.println("4. Dar de baja a un empleado.");
            System.out.println("5. Agregar nueva habitación.");
            System.out.println("6. Eliminar una habitación.");
            System.out.println("7. Mostrar todos los clientes.");
            System.out.println("8. Mostrar todos los empleados.");
            System.out.println("9. Mostrar todas las habitaciones.");
            System.out.println("10. Salir del programa.");
            System.out.println("Introduce el número de la opcion deseada: ");

            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    crearCliente(teclado, clientes);
                    break;
                case 2:
                    borrarCliente(teclado, clientes);

                    break;
                case 3:
                    empleado = crearEmpleado(teclado, empleado, empleados);
                    break;
                case 4:
                    empleado = borrarEmpleado(teclado, empleados, empleado);

                    break;
                case 5:
                    habitacion = crearHabitacion(teclado, habitacion, habitaciones);
                    break;
                case 6:
                    habitacion = borrarHabitacion(teclado, habitaciones, habitacion);
                    break;
                case 7:
                mostrarClientes(clientes);
                    break;
                case 8:
                mostrarEmpleados(empleados);
                    break;
                case 9:
                mostrarHabitacion(habitaciones);

                    break;
                case 10:
                    System.out.println("Cerrando el programa...");

                    break;
                default:
                    System.out.println("La opción seleccionada no existe...");
            }
        } while (opcion != 10);
    }
}
