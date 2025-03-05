package com.futbol.modelos;

public class Jugador {
    private String nombre;
    private String nacionalidad;
    private int edad;
    private int numero;

    public Jugador(String nombre, String nacionalidad, int edad, int numero) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
        this.numero = numero;

        
    }

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {return nacionalidad;}
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getEdad() {return edad;}
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumero() {return numero;}
    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", edad=" + edad +
                ", numero=" + numero +
                '}';
    }



}
