package com.futbol;

import com.futbol.servicio.EquipoService;

public class Main {
    public static void main(String[] args) {
       
        EquipoService equipoService = new EquipoService();

        // Crear equipos
        equipoService.crearEquipo("Barcelona", "Barcelona", 1899, "Joan Laporta");
        equipoService.crearEquipo("Real Madrid", "Madrid", 1902, "Florentino Pérez");

        // Listar equipos
        equipoService.listarEquipos();

        // Buscar equipo
        System.out.println("🔎 Buscando equipo: " + equipoService.buscarEquipo("Barcelona"));

        // Actualizar equipo
        equipoService.actualizarEquipo("Barcelona", "Barcelona", 1900, "Nuevo Presidente");

        // Eliminar equipo
        equipoService.eliminarEquipo("Real Madrid");

        // Listar equipos después de la eliminación
        equipoService.listarEquipos();
    }
}