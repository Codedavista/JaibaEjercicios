package Exercises;

public class Padre {
    String apellido;
    public Padre(String apellido){
        this.apellido = apellido;
    }
   
}
public Boolean test(){
    Hijo hijo = new Hijo ("Juan", apellido);
    EspirituSanto espirituSanto = new EspirituSanto(hijo.nombre, hijo.apellido, "López");

    return espirituSanto.pruebaPaternidad();
}