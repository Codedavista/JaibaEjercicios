package Exercises;

public class Hijo extends Padre{
    String nombre;

    public Hijo (String nombre, String apellido){
        super(apellido);
        this.nombre = nombre;
    }
}