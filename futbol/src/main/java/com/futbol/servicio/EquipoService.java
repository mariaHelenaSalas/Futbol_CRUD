package com.futbol.servicio;

import java.util.HashMap;
import java.util.Map;

import com.futbol.modelos.Equipo;

public class EquipoService {
    
    private Map<String, Equipo> equipos = new HashMap<>();

    // Crear un equipo
    public void crearEquipo(String nombre, String ciudad, int fechaFundacion, String presidente) {
        if (equipos.containsKey(nombre)) {
            System.out.println(" El equipo ya existe.");
            return;
        }
        Equipo nuevoEquipo = new Equipo(nombre, ciudad, fechaFundacion, presidente);
        equipos.put(nombre, nuevoEquipo);
        System.out.println(" Equipo agregado: " + nuevoEquipo);
    }

    // Leer (listA) todos los equipos
    public void listarEquipos() {
        if (equipos.isEmpty()) {
            System.out.println(" No hay equipos registrados.");
            return;
        }
        equipos.values().forEach(System.out::println);
    }

    // Busca un equipo por nombre
    public Equipo buscarEquipo(String nombre) {
        return equipos.get(nombre);
    }

    // ActualizO un equipo
    public void actualizarEquipo(String nombre, String nuevaCiudad, int nuevaFecha, String nuevoPresidente) {
        Equipo equipo = equipos.get(nombre);
        if (equipo != null) {
            equipo.setCiudad(nuevaCiudad);
            equipo.setFechaFundacion(nuevaFecha);
            equipo.setPresidente(nuevoPresidente);
            System.out.println(" Equipo actualizado: " + equipo);
        } else {
            System.out.println("Equipo no encontrado.");
        }
    }

    // EliminO un equipo
    @SuppressWarnings("unlikely-arg-type")
    public void eliminarEquipo(int id) {
        if (equipos.remove(id) != null) {
            System.out.println(" Equipo eliminado: " );
        } else {
            System.out.println(" No se encontró el equipo.");
        }
    }

}
