package co.edu.uniquindio.solid;

import co.edu.uniquindio.solid.model.*;


public class Main {
    public static void main(String[] args) {

        Vehiculo moto2=new moto("kympco", "125ss");


        motor motor = new motor();
        carburador carburador = new carburador();
        piston piston = new piston();

        moto2.añadirPartes(motor);
        moto2.añadirPartes(carburador);
        moto2.añadirPartes(piston);


        moto2.conectarPartes();
    }
}