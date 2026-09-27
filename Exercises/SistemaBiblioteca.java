package Exercises;

import java.util.ArrayList;
import java.util.List;

public class SistemaBiblioteca {
}

class Libro {
    private String titulo;
    private String autor;
    private boolean prestado;

    public Libro(String titulo, String autor) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("El título no puede estar vacío.");
        }
        this.titulo = titulo;
        this.autor = autor;
        this.prestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void marcarPrestado() {
        this.prestado = true;
    }

    public void marcarDevuelto() {
        this.prestado = false;
    }
}

abstract class Usuario {
    private String nombre;
    private List<Libro> librosPrestados;

    public Usuario(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        this.nombre = nombre;
        this.librosPrestados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidadLibrosPrestados() {
        return librosPrestados.size();
    }

    public boolean puedePedirLibro() {
        return librosPrestados.size() < calcularMaxLibros();
    }

    public void agregarLibro(Libro libro) {
        librosPrestados.add(libro);
    }

    public boolean quitarLibro(Libro libro) {
        return librosPrestados.remove(libro);
    }

    public abstract int calcularMaxLibros();
    public abstract int calcularDiasPrestamo();
}

class UsuarioEstudiante extends Usuario {
    public UsuarioEstudiante(String nombre) {
        super(nombre);
    }

    @Override
    public int calcularMaxLibros() {
        return 3;
    }

    @Override
    public int calcularDiasPrestamo() {
        return 7;
    }
}

class UsuarioProfesor extends Usuario {
    public UsuarioProfesor(String nombre) {
        super(nombre);
    }

    @Override
    public int calcularMaxLibros() {
        return 5;
    }

    @Override
    public int calcularDiasPrestamo() {
        return 15;
    }
}

class Biblioteca {
    private List<Libro> catalogo;

    public Biblioteca() {
        this.catalogo = new ArrayList<>();
    }

    public void registrarLibro(Libro libro) {
        catalogo.add(libro);
    }

    public String prestarLibro(Usuario usuario, Libro libro) {
        if (libro.isPrestado()) {
            return "Error: El libro ya está prestado.";
        }
        if (!usuario.puedePedirLibro()) {
            return "Error: " + usuario.getNombre() + " alcanzó su límite de " + usuario.calcularMaxLibros() + " libros.";
        }
        libro.marcarPrestado();
        usuario.agregarLibro(libro);
        return "Préstamo exitoso de '" + libro.getTitulo() + "' a " + usuario.getNombre()
                + " por " + usuario.calcularDiasPrestamo() + " días.";
    }

    public boolean devolverLibro(Usuario usuario, Libro libro) {
        if (usuario.quitarLibro(libro)) {
            libro.marcarDevuelto();
            return true;
        }
        return false;
    }
}