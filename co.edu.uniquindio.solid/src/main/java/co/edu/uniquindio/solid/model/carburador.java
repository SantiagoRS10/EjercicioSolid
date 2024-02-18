package co.edu.uniquindio.solid.model;

import co.edu.uniquindio.solid.services.IElementoMoto;
import co.edu.uniquindio.solid.services.IEnsamblaje;

public class carburador extends partes {
    public carburador() {
    }

    public void ensamblar() {
        System.out.println("carburador ensamblado.");
    }
}