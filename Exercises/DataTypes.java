package Exercises;

public class DataTypes {
    public String cadena;
    public int entero;
    public float flotante;
    char caracter;
    boolean boleano;

    public DataTypes(){
            this("Hola Mundo", 10, 5.9f, 'A', true);
    }

    public DataTypes(String cadena, int entero, float flotante, char caracter, boolean booleano){
        this.cadena = cadena;
        this.entero = entero;
        this.flotante = flotante;
        this.caracter = caracter;
        this.boleano = booleano;
    }

}
