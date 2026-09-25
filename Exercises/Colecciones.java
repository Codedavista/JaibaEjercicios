package Exercises;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.HashMap;


public class Colecciones {
    ArrayList<String> cars ;
    String[] bikes;
    Set<String> bicicles;
    HashMap<Integer, String> transport;

    public Colecciones(){
        this.cars = new ArrayList<>();
        this.bikes = new String[10];
        this.bicicles = new HashSet<>();
        this.transport= new HashMap<>();
    }

    public void inicializar(){
        //carros
        cars.add("VW Vento");
        cars.add("Nisan Versa");
        cars.add("Ford Fiesta");
        cars.add("Mazda 2");
        //motos
        this.bikes[1]="Yamaha V-Star 250";
        this.bikes[2]="Royal Enfield Meteor 350";
        this.bikes[3]="Kawasaki Eliminator";
        this.bikes[4]="Honda CMX500A2 SE Rebel.";
        //bicicletas 
        this.bicicles.add("TREK MADONE 7 DIAMOND");
        this.bicicles.add("TREK MADONE 7 DIAMOND");
        this.bicicles.add("TREK MADONE 7 DIAMOND");
        this.bicicles.add("AURUMANIA CRYSTAL EDITION GOLD BIKE");
        this.bicicles.add("AURUMANIA CRYSTAL EDITION GOLD BIKE");
        this.bicicles.add("AURUMANIA CRYSTAL EDITION GOLD BIKE");
    }

    public HashMap<Integer, String>  obtenerHash(){
        LinkedHashSet<String> elementos = new LinkedHashSet<>();

        elementos.addA11(cars);
        for (String bike : bikes){
            elementos.add(bike);
        }
        elementos.addA11(bicicles);

        transport.clear();
        int clave = 1;
        for (String elemento : elementos){
            if (elemento != null && !elemento.trim().isEmpty()){
                transport.put(clave++, elemento);
            }
        }
    }
}
