package edu.upc.dsa.models;

import edu.upc.dsa.util.RandomUtils;

public class Objeto implements Comparable<Objeto>{
    // Variables objeto
    String id;
    String nombre;
    double precio;

    // Constructor objeto I
    public Objeto() {
        this.id = RandomUtils.getId();
    }
    // Constructor objeto II
    public Objeto(String nombre, double precio) {
        this();
        this.setPrecio(precio);
        this.setnombre(nombre);
    }

    // GETs, SETs, toString y CompareTo  + posibles funciones objeto
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id=id;
    }


    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Product [id="+id+", nombre=" + nombre + ", precio=" + precio +"]";
    }

    @Override
    public int compareTo(Objeto o) {
        return (int)(this.getPrecio()-o.getPrecio());
    }
}