package co.edu.uniquindio.solid.model;

import co.edu.uniquindio.solid.services.IEnsamblaje;

import java.util.ArrayList;
import java.util.List;

public class moto extends Vehiculo{

    private List<partes> partes;


    public moto(String marca, String modelo) {
        super(marca,modelo);
        this.partes = new ArrayList<>();
    }

@Override
    public void añadirPartes(partes parte) {
        partes.add(parte);
        System.out.println("parte añadida a la moto");
    }

@Override
    public void conectarPartes() {
        for (partes parte : partes) {
            parte.ensamblar();
        }
    }

}
