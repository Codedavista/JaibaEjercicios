package Exercises;

public class Vehiculo {
    private String marca;
    private String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String mostrarInformacion() {
        return "Marca: " + marca + ", Modelo: " + modelo;
    }
}

class Automovil extends Vehiculo {
    private int numeroPuertas;

    public Automovil(String marca, String modelo, int numeroPuertas) {
        super(marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + ", Puertas: " + numeroPuertas;
    }
}

class Motocicleta extends Vehiculo {
    private int cilindrada;

    public Motocicleta(String marca, String modelo, int cilindrada) {
        super(marca, modelo);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + ", Cilindrada: " + cilindrada + "cc";
    }
}