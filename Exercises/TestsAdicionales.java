package Exercises;

import java.util.ArrayList;
import java.util.List;

public class TestsAdicionales {

    public static void main(String[] args) {
        System.out.println("=== INICIANDO PRUEBAS ADICIONALES DE POO ===");

        probarCuentaBancaria();
        probarFiguras();
        probarVehiculos();
        probarNotificaciones();
        probarSistemaBiblioteca();

        System.out.println("=== TODAS LAS PRUEBAS PASARON EXITOSAMENTE ===");
    }

    private static void probarCuentaBancaria() {
        CuentaBancaria cuenta = new CuentaBancaria("Luis", 1000.0);
        verificar(cuenta.getSaldo() == 1000.0, "El saldo inicial debe ser 1000.0");

        verificar(cuenta.depositar(500.0), "Debe permitir depósito positivo");
        verificar(cuenta.getSaldo() == 1500.0, "El saldo tras depositar 500 debe ser 1500.0");

        verificar(!cuenta.depositar(-200.0), "No debe aceptar depósitos negativos");
        verificar(cuenta.getSaldo() == 1500.0, "El saldo no debe cambiar tras depósito inválido");

        verificar(!cuenta.retirar(2000.0), "No debe permitir retirar más que el saldo");
        verificar(cuenta.retirar(300.0), "Debe permitir retiro válido");
        verificar(cuenta.getSaldo() == 1200.0, "El saldo final debe ser 1200.0");
        System.out.println("[OK] Pruebas de CuentaBancaria (Encapsulamiento)");
    }

    private static void probarFiguras() {
        Figura circulo = new Circulo(2.0);
        Figura rectangulo = new Rectangulo(4.0, 5.0);

        verificar(Math.abs(circulo.calcularArea() - (Math.PI * 4.0)) < 0.0001, "Área del círculo incorrecta");
        verificar(rectangulo.calcularArea() == 20.0, "Área del rectángulo debe ser 20.0");

        boolean falloDimensionInvalida = false;
        try {
            new Rectangulo(-3.0, 5.0);
        } catch (IllegalArgumentException e) {
            falloDimensionInvalida = true;
        }
        verificar(falloDimensionInvalida, "Debe rechazar dimensiones menores o iguales a cero");
        System.out.println("[OK] Pruebas de Figura (Abstracción)");
    }

    private static void probarVehiculos() {
        Automovil auto = new Automovil("Toyota", "Corolla", 4);
        Motocicleta moto = new Motocicleta("Yamaha", "MT-07", 689);

        verificar(auto.mostrarInformacion().contains("Toyota"), "Debe incluir la marca del auto");
        verificar(auto.mostrarInformacion().contains("4"), "Debe incluir las puertas del auto");
        verificar(moto.mostrarInformacion().contains("Yamaha"), "Debe incluir la marca de la moto");
        verificar(moto.mostrarInformacion().contains("689"), "Debe incluir la cilindrada de la moto");
        System.out.println("[OK] Pruebas de Vehiculo (Herencia)");
    }

    private static void probarNotificaciones() {
        List<Notificacion> lista = new ArrayList<>();
        lista.add(new NotificacionCorreo("usuario@ejemplo.com"));
        lista.add(new NotificacionConsola());

        List<String> envios = Notificacion.enviarTodas(lista, "Hola POO");
        verificar(envios.size() == 2, "Deben haberse enviado 2 notificaciones");
        verificar(envios.get(0).contains("usuario@ejemplo.com"), "Primera notificación debe ser por correo");
        verificar(envios.get(1).contains("Consola"), "Segunda notificación debe ser por consola");
        System.out.println("[OK] Pruebas de Notificacion (Polimorfismo)");
    }

    private static void probarSistemaBiblioteca() {
        Biblioteca biblioteca = new Biblioteca();
        Libro libro1 = new Libro("Clean Code", "Robert C. Martin");
        Libro libro2 = new Libro("Effective Java", "Joshua Bloch");
        biblioteca.registrarLibro(libro1);
        biblioteca.registrarLibro(libro2);

        Usuario estudiante = new UsuarioEstudiante("Ana");
        Usuario profesor = new UsuarioProfesor("Dr. García");

        verificar(estudiante.calcularMaxLibros() == 3, "Estudiante debe tener máximo 3 libros");
        verificar(estudiante.calcularDiasPrestamo() == 7, "Estudiante debe tener 7 días de préstamo");
        verificar(profesor.calcularMaxLibros() == 5, "Profesor debe tener máximo 5 libros");
        verificar(profesor.calcularDiasPrestamo() == 15, "Profesor debe tener 15 días de préstamo");

        String msgEstudiante = biblioteca.prestarLibro(estudiante, libro1);
        verificar(msgEstudiante.contains("7 días"), "El préstamo al estudiante debe indicar 7 días");
        verificar(libro1.isPrestado(), "El libro 1 debe figurar como prestado");

        String intentoDoble = biblioteca.prestarLibro(profesor, libro1);
        verificar(intentoDoble.startsWith("Error"), "No debe prestar un libro que ya está prestado");

        String msgProfesor = biblioteca.prestarLibro(profesor, libro2);
        verificar(msgProfesor.contains("15 días"), "El préstamo al profesor debe indicar 15 días");

        verificar(biblioteca.devolverLibro(estudiante, libro1), "La devolución debe ser exitosa");
        verificar(!libro1.isPrestado(), "El libro 1 debe quedar disponible tras devolverse");
        System.out.println("[OK] Pruebas de SistemaBiblioteca (Integración de Pilares)");
    }

    private static void verificar(boolean condicion, String mensajeError) {
        if (!condicion) {
            throw new AssertionError("Fallo en prueba: " + mensajeError);
        }
    }
}