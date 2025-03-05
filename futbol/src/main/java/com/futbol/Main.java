package com.futbol;

import java.util.Scanner;

import com.futbol.modelos.Jugador;
import com.futbol.servicio.EquipoService;

public class Main {
    public static void main(String[] args) {
        EquipoService servicio = new EquipoService();
        Scanner teclado = new Scanner(System.in);

        while (true) {
            System.out.println("DATOS DEL EQUIPO");
            System.out.println("1. Agrgar equipo");
            System.out.println("2. Listar Equipo");
            System.out.println("3. Actualizar equipo");
            System.out.println("4. Eliminar equipo");
            System.out.println("5. Salir");
            System.out.println("Selecciona una opcion");

            int opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("nombre");
                    String nombre = teclado.nextLine();

                    System.out.println("ciudad");
                    String ciudad = teclado.nextLine();

                    System.out.println("fechaFundacion");
                    int fechaFundacion = teclado.nextInt();

                    System.out.println("presidente");
                    String presidente = teclado.nextLine();

                    
                        for (int i = 0; i < numjugador; i++) {
                        System.out.println("\n agregando jugador #"+(i + 1));
                        System.out.print("Número de dorsal: ");
                        int dorsal = teclado.nextInt();
                        teclado.nextLine();

                        System.out.print("Nombre del jugador: ");
                        String nombreJugador = teclado.nextLine();

                        System.out.print("Ciudad del jugador: ");
                        String ciudadJugador = teclado.nextLine();

                        System.out.print("Edad del jugador: ");
                        int edad = teclado.nextInt();
                        teclado.nextLine();

                    jugador.add(new Jugador(ciudadJugador, nombreJugador, dorsal, edad));

                                        }

                    break;

                case 2:
                    servicio.listarEquipos();
                    break;

                case 3:
                    System.out.println("ID del equipo a actualizar");
                    int idActualizar = teclado.nextInt();
                    teclado.nextLine();

                    System.out.println("Nuevo  nombre");
                    String nuevonombre = teclado.nextLine();

                    System.out.println("Nueva Ciudad ");
                    String nuevaciudad = teclado.nextLine();

                    System.out.println("Nueva fecha de fundacion");
                    System.out.println("Nuevo Presidente");
                    String Nuevopresidente = teclado.nextLine();

                    servicio.actualizarEquipo(nuevonombre, nuevaciudad, idActualizar, Nuevopresidente);
                    break;

                case 4:
                    System.out.println("ID de la persona a eliminar: ");
                    int idEliminar = teclado.nextInt();
                    servicio.eliminarEquipo(idEliminar);
                    break;

                case 5:
                System.out.println("Saliendo del progragrama...");
                teclado.close();

                default:
                    System.out.println("Opcfion no valida");
            }

        }

    }
}