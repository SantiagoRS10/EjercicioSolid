package co.edu.uniquindio.solid.model;

import co.edu.uniquindio.solid.services.IElementoMoto;
import co.edu.uniquindio.solid.services.IEnsamblaje;

public class bateria extends partes{
    public bateria() {
    }

    public void ensamblar() {
        System.out.println("bateria ensamblada.");
    }
}