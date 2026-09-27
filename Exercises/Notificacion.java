package Exercises;

import java.util.ArrayList;
import java.util.List;

public interface Notificacion {
    String enviar(String mensaje);

    public static List<String> enviarTodas(List<Notificacion> notificaciones, String mensaje) {
        List<String> resultados = new ArrayList<>();
        for (Notificacion notificacion : notificaciones) {
            resultados.add(notificacion.enviar(mensaje));
        }
        return resultados;
    }
}

class NotificacionCorreo implements Notificacion {
    private String correoDestino;

    public NotificacionCorreo(String correoDestino) {
        this.correoDestino = correoDestino;
    }

    public String getCorreoDestino() {
        return correoDestino;
    }

    @Override
    public String enviar(String mensaje) {
        String salida = "[Correo a " + correoDestino + "]: " + mensaje;
        System.out.println(salida);
        return salida;
    }
}

class NotificacionConsola implements Notificacion {
    @Override
    public String enviar(String mensaje) {
        String salida = "[Consola]: " + mensaje;
        System.out.println(salida);
        return salida;
    }
}