package co.edu.uniquindio.solid.model;

import co.edu.uniquindio.solid.services.IEnsamblaje;

public abstract class partes implements IEnsamblaje {
    private String nombre;
    private int id;

    public partes(){

    }

    public partes(String nombre, int id){
        this.nombre=nombre;
        this.id=id;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
