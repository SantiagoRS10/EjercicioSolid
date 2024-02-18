package co.edu.uniquindio.solid.model;

public abstract class Vehiculo {
        protected String marca;
        protected String modelo;

        public Vehiculo(String marca, String modelo) {
            this.marca = marca;
            this.modelo = modelo;
        }

        public abstract void añadirPartes(partes parte);
        public abstract void conectarPartes();

}
