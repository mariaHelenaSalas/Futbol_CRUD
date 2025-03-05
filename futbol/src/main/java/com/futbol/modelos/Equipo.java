package com.futbol.modelos;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
  
    private String nombre;
    private String ciudad;
    private int fechaFundacion;
    private String presidente;
    private List<Jugador> jugadores;

    
    //Constructor

    public Equipo(String nombre, String ciudad, int fechaFundacion, String presidente) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.fechaFundacion = fechaFundacion;
        this.presidente = presidente;
        

    }
    //implemento el metodo agregar y eliminar jugaors
    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }
     
    public void eliminarJugador(String nombre) {
        jugadores.removeIf(jugador -> jugador.getNombre().equals(nombre));
    }
    
    //Getters y setters

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {return ciudad;}
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getFechaFundacion() {return fechaFundacion;}
    public void setFechaFundacion(int fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }
    
    public String getPresidente() {return presidente;} 
    public void setPresidente(String presidente) {
        this.presidente = presidente;
    }

    public List<Jugador> getJugadores() {return jugadores;}

    @Override
    public String toString() {
        return "Equipo{" +
                "nombre='" + nombre + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", fechaFundacion='" + fechaFundacion + '\'' +
                ", presidente='" + presidente + '\'' +
                ", jugadores=" + jugadores +
                '}';
    }



}
