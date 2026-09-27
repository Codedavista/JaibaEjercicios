# Ejercicios de repaso de programación orientada a objetos

Este repositorio contiene ejercicios introductorios de Java sobre colecciones,
constructores, encapsulamiento, herencia, polimorfismo, abstracción y
sobrecarga.

## Objetivo

Completa el código de la carpeta `Exercises` y comprueba el resultado con
`Tests.java`. El archivo de pruebas ya contiene los casos principales y **no
debe modificarse**.

> [!IMPORTANT]
> Trabaja con Java 8 o una versión posterior. Cada clase pública debe estar en
> un archivo cuyo nombre coincida exactamente con el nombre de la clase.

## Requisitos previos

- JDK instalado y disponible en la terminal.
- Un editor compatible con Java, como Visual Studio Code.
- Conocimientos básicos de variables, métodos, clases y paquetes.

Comprueba la instalación con:

```bash
java --version
javac --version
```
</details>

## Paso a paso para obtener la solución

### 1. Abre el proyecto

Abre la carpeta del repositorio en VS Code y verifica que la estructura sea
similar a la siguiente:

```text
JavaExesrcises/
├── Exercises/
│   ├── Colecciones.java
│   ├── DataTypes.java
│   ├── Padre.java
│   └── Sobrecarga.java
├── README.md
└── Tests.java
```
</details>

### 2. Revisa el código inicial

Lee cada archivo de `Exercises` y localiza los métodos incompletos. No cambies
las importaciones de `Tests.java` ni sus condiciones de validación. Cuando una
clase pública se separe en varios archivos, conserva el paquete:

<details>
    <summary>Click para ver</summary>
```java
package Exercises;
```
</details>

### 3. Implementa un ejercicio a la vez

Completa primero `DataTypes`, después `Colecciones`, `Padre` y, por último,
`Sobrecarga`. Después de cada ejercicio, compila para detectar errores de
sintaxis, nombres de archivo o paquetes.

### 4. Compila desde la raíz del repositorio

Estos comandos crean las clases compiladas en `out`, sin mezclar archivos `.class`
con el código fuente:

```bash
rm -rf out
mkdir out
javac -d out Exercises/*.java Tests.java
```
</details>

### 5. Ejecuta las pruebas

```bash
java -cp out Tests
```
</details>

Una solución correcta debe imprimir `true`. Si aparece otro resultado, revisa
el ejercicio indicado por `Tests.java` y vuelve a compilar.

## Ejercicios incluidos

### 1. `DataTypes.java`: constructores

Implementa el constructor sin parámetros de `DataTypes` con estos valores:

| Atributo | Valor |
| --- | --- |
| `cadena` | `Hola Mundo` |
| `entero` | `10` |
| `flotante` | `5.9f` |
| `caracter` | `'A'` |
| `boleano` | `true` |

Conserva también el constructor con parámetros, porque las pruebas verifican
ambas formas de crear el objeto.

### 2. `Colecciones.java`: colecciones y `HashMap`

Completa `obtenerHash` para que:

1. Recorra `cars`, `bikes` y `bicicles`.
2. Ignore valores `null`, cadenas vacías y cadenas que solo contengan espacios.
3. Elimine elementos repetidos.
4. Guarde los elementos en `transport`.
5. Use claves incrementales desde `1` hasta el número de elementos guardados.
6. Regrese el `HashMap` resultante.

No agregues elementos manualmente a la colección solo para satisfacer la
prueba; el método debe trabajar con los datos existentes.

### 3. `Padre.java`: herencia

Separa las clases públicas en estos archivos:

- `Padre.java`
- `Hijo.java`
- `EspirituSanto.java`

En `Padre`, implementa `test()` para que:

1. Cree un `Hijo` usando el apellido recibido por `Padre` y el nombre `Juan`.
2. Cree un `EspirituSanto` usando el apellido del padre, el nombre del hijo y
   el apellido real `Lopez`.
3. Llame a `pruebaPaternidad()` y regrese su resultado.

Usa la comparación adecuada para cadenas. La prueba debe devolver `false` con
el caso proporcionado por `Tests.java`.

### 4. `Sobrecarga.java`: polimorfismo y sobreescritura

Completa `Alumno.reprobar()` con estas reglas:

- Si la calificación es menor que `6`, debe regresar `":("`.
- En cualquier otro caso, debe regresar `":)"`.

Mantén la relación de herencia con `Sobrecarga` y la implementación específica
de `Profesor`. El objetivo es observar cómo una misma operación puede tener
comportamientos distintos según el tipo de objeto.

## Prácticas adicionales sobre los cuatro pilares de POO

Estas actividades amplían los ejercicios existentes. Crea archivos nuevos para
ellas y agrega pruebas separadas; no modifiques `Tests.java`.

### Encapsulamiento: `CuentaBancaria.java`

Crea una clase con los atributos privados `titular` y `saldo`. Proporciona
constructores y métodos públicos para consultar el saldo, depositar y retirar.
Valida que no se acepten depósitos negativos ni retiros mayores que el saldo.
Evita exponer los atributos directamente.

### Abstracción: `Figura.java`

Crea una clase abstracta `Figura` con el método abstracto `calcularArea()`.
Implementa `Circulo` y `Rectangulo`. Cada subclase debe calcular su área con
sus propios atributos y validar que sus dimensiones sean mayores que cero.

### Herencia: `Vehiculo.java`

Crea una clase base `Vehiculo` con marca y modelo. Implementa las clases
`Automovil` y `Motocicleta`, que hereden esos datos y agreguen una propiedad
propia. Incluye un método común para mostrar la información del vehículo.

### Polimorfismo: `Notificacion.java`

Define una clase abstracta o una interfaz `Notificacion` con el método
`enviar(String mensaje)`. Implementa `NotificacionCorreo` y
`NotificacionConsola`. Guarda varios objetos en una colección de tipo
`Notificacion` y ejecútalos mediante la misma llamada.

### Integración de los pilares: `SistemaBiblioteca.java`

Diseña un pequeño sistema con las clases `Libro`, `Usuario` y `Biblioteca`.
Usa encapsulamiento para proteger el estado, herencia para distinguir tipos de
usuario, abstracción para definir las operaciones comunes y polimorfismo para
calcular las reglas de préstamo de cada tipo de usuario.

## Lista de comprobación

- [x] El proyecto compila sin errores con `javac`.
- [x] `Tests.java` no fue modificado.
- [x] Cada clase pública está en su propio archivo.
- [x] Los métodos devuelven los tipos y valores esperados.
- [x] Se validan valores nulos, vacíos, repetidos o inválidos cuando aplica.
- [x] Las nuevas prácticas tienen sus propias pruebas.
- [x] El programa termina mostrando `true`.

## Soluciones de referencia

Los siguientes ejemplos resuelven los cuatro ejercicios evaluados por
`Tests.java`. Coloca cada clase pública en el archivo indicado dentro de la
carpeta `Exercises`.

### Solución de `DataTypes.java`

<details>
    <summary>Click para ver</summary>
        ```java
        package Exercises;

        public class DataTypes {
        public String cadena;
        public int entero;
        public float flotante;
        public char caracter;
        public boolean boleano;

        public DataTypes() {
            this("Hola Mundo", 10, 5.9f, 'A', true);
        }

        public DataTypes(String cadena, int entero, float flotante,
                        char caracter, boolean boleano) {
            this.cadena = cadena;
            this.entero = entero;
            this.flotante = flotante;
            this.caracter = caracter;
            this.boleano = boleano;
        }
        }
        ```
</details>

### Solución de `Colecciones.java`

<details>
    <summary>Click para ver</summary>
        ```java

        package Exercises;

        import java.util.ArrayList;
        import java.util.HashMap;
        import java.util.HashSet;
        import java.util.LinkedHashSet;
        import java.util.Set;

        public class Colecciones {
        ArrayList<String> cars;
        String[] bikes;
        Set<String> bicicles;
        HashMap<Integer, String> transport;

        public Colecciones() {
            this.cars = new ArrayList<>();
            this.bikes = new String[10];
            this.bicicles = new HashSet<>();
            this.transport = new HashMap<>();
        }

        public void inicializar() {
            cars.add("VW Vento");
            cars.add("Nisan Versa");
            cars.add("Ford Fiesta");
            cars.add("Mazda 2");

            bikes[1] = "Yamaha V-Star 250";
            bikes[2] = "Royal Enfield Meteor 350";
            bikes[3] = "Kawasaki Eliminator";
            bikes[4] = "Honda CMX500A2 SE Rebel.";

            bicicles.add("TREK MADONE 7 DIAMOND");
            bicicles.add("TREK MADONE 7 DIAMOND");
            bicicles.add("AURUMANIA CRYSTAL EDITION GOLD BIKE");
            bicicles.add("AURUMANIA CRYSTAL EDITION GOLD BIKE");
        }

        public HashMap<Integer, String> obtenerHash() {
            LinkedHashSet<String> elementos = new LinkedHashSet<>();

            elementos.addAll(cars);
            for (String bike : bikes) {
                elementos.add(bike);
            }
            elementos.addAll(bicicles);

            transport.clear();
            int clave = 1;
            for (String elemento : elementos) {
                if (elemento != null && !elemento.trim().isEmpty()) {
                    transport.put(clave++, elemento);
                }
            }
            return transport;
        }
        }
        ```
</details>


### Solución de `Padre.java`

<details>
    <summary>Click para ver</summary>
        ```java

        package Exercises;

        public class Padre {
        String apellido;

        public Padre(String apellido) {
            this.apellido = apellido;
        }

        public Boolean test() {
            Hijo hijo = new Hijo("Juan", apellido);
            EspirituSanto espirituSanto = new EspirituSanto(
                    hijo.nombre, hijo.apellido, "Lopez");
            return espirituSanto.pruebaParternidad();
        }
        }
        ```
</details>

### Solución de `Hijo.java`

<details>
    <summary>Click para ver</summary>
        ```java

        package Exercises;

        public class Hijo extends Padre {
        String nombre;

        public Hijo(String nombre, String apellido) {
            super(apellido);
            this.nombre = nombre;
        }
        }
        ```
</details>

### Solución de `EspirituSanto.java`

<details>
    <summary>Click para ver</summary>
        ```java

        package Exercises;

        public class EspirituSanto extends Hijo {
        String apellidoReal;

        public EspirituSanto(String nombre, String apellido, String apellidoReal) {
            super(nombre, apellido);
            this.apellidoReal = apellidoReal;
        }

        public Boolean pruebaParternidad() {
            return apellido.equals(apellidoReal);
        }
        }
        ```
</details>

### Solución de `Sobrecarga.java`

<details>
    <summary>Click para ver</summary>
        ```java

        package Exercises;

        public class Sobrecarga {
        String nombre;
        String materia;
        int calificacion;

        public Sobrecarga(String nombre, String materia, int calificacion) {
            this.nombre = nombre;
            this.materia = materia;
            this.calificacion = calificacion;
        }

        public String reprobar() {
            return calificacion < 6 ? ":(" : ":)";
        }
        }
        ```
</details>

### Solución de `Profesor.java`

<details>
    <summary>Click para ver</summary>
        ```java

        package Exercises;

        public class Profesor extends Sobrecarga {
        public Profesor(String nombre, String materia, int calificacion) {
            super(nombre, materia, calificacion);
        }

        @Override
        public String reprobar() {
            if (calificacion > 5) {
                return ">:) Sacaste " + calificacion + " en " + materia;
            }
            return ":(";
        }
        }
        ```
</details>

### Solución de `Alumno.java`

<details>
    <summary>Click para ver</summary>
        ```java

        package Exercises;

        public class Alumno extends Sobrecarga {
        public Alumno(String nombre, String materia, int calificacion) {
            super(nombre, materia, calificacion);
        }

        @Override
        public String reprobar() {
            return calificacion < 6 ? ":(" : ":)";
        }
        }
        ```
</details>

## Soluciones de las prácticas adicionales

Las siguientes soluciones corresponden a las actividades propuestas para
reforzar los cuatro pilares de la programación orientada a objetos. Al igual
que en los ejercicios anteriores, cada clase pública debe guardarse en un
archivo independiente dentro de `Exercises`.

### Solución de `CuentaBancaria.java` (encapsulamiento)

<details>
    <summary>Click para ver</summary>
        ```java

        package Exercises;

        public class CuentaBancaria {
        private final String titular;
        private double saldo;

        public CuentaBancaria(String titular, double saldoInicial) {
            if (titular == null || titular.trim().isEmpty()) {
                throw new IllegalArgumentException("El titular es obligatorio");
            }
            if (saldoInicial < 0) {
                throw new IllegalArgumentException("El saldo no puede ser negativo");
            }
            this.titular = titular;
            this.saldo = saldoInicial;
        }

        public String getTitular() {
            return titular;
        }

        public double getSaldo() {
            return saldo;
        }

        public void depositar(double cantidad) {
            validarCantidad(cantidad);
            saldo += cantidad;
        }

        public void retirar(double cantidad) {
            validarCantidad(cantidad);
            if (cantidad > saldo) {
                throw new IllegalArgumentException("Saldo insuficiente");
            }
            saldo -= cantidad;
        }

        private void validarCantidad(double cantidad) {
            if (cantidad <= 0) {
                throw new IllegalArgumentException("La cantidad debe ser positiva");
            }
        }
        }
        ```
</details>

### Solución de `Figura.java` (abstracción)

<details>
    <summary>Click para ver</summary>
        ```java

        package Exercises;

        public abstract class Figura {
        public abstract double calcularArea();
        }
        ```
</details>

### Solución de `Circulo.java`

<details>
    <summary>Click para ver</summary>
        ```java

        package Exercises;

        public class Circulo extends Figura {
        private final double radio;

        public Circulo(double radio) {
            if (radio <= 0) {
                throw new IllegalArgumentException("El radio debe ser positivo");
            }
            this.radio = radio;
        }

        @Override
        public double calcularArea() {
            return Math.PI * radio * radio;
        }
        }
        ```
</details>

### Solución de `Rectangulo.java`

<details>
    <summary>Click para ver</summary>
        ```java

        package Exercises;

        public class Rectangulo extends Figura {
        private final double base;
        private final double altura;

        public Rectangulo(double base, double altura) {
            if (base <= 0 || altura <= 0) {
                throw new IllegalArgumentException(
                    "La base y la altura deben ser positivas");
            }
            this.base = base;
            this.altura = altura;
        }

        @Override
        public double calcularArea() {
            return base * altura;
        }
        }
        ```
</details>

### Solución de `Vehiculo.java` (herencia)

<details>
    <summary>Click para ver</summary>
        ```java

        package Exercises;

        public class Vehiculo {
        private final String marca;
        private final String modelo;

        public Vehiculo(String marca, String modelo) {
            this.marca = marca;
            this.modelo = modelo;
        }

        public String mostrarInformacion() {
            return marca + " " + modelo;
        }
        }
        ```
</details>

### Solución de `Automovil.java`

<details>
    <summary>Click para ver</summary>
        ```java

        package Exercises;

        public class Automovil extends Vehiculo {
        private final int puertas;

        public Automovil(String marca, String modelo, int puertas) {
            super(marca, modelo);
            if (puertas <= 0) {
                throw new IllegalArgumentException("El número de puertas es inválido");
            }
            this.puertas = puertas;
        }

        @Override
        public String mostrarInformacion() {
            return super.mostrarInformacion() + " - Puertas: " + puertas;
        }
        }
        ```
</details>

### Solución de `Motocicleta.java`

<details>
    <summary>Click para ver</summary>
        ```java

        package Exercises;

        public class Motocicleta extends Vehiculo {
        private final boolean tieneCanastilla;

        public Motocicleta(String marca, String modelo, boolean tieneCanastilla) {
            super(marca, modelo);
            this.tieneCanastilla = tieneCanastilla;
        }

        @Override
        public String mostrarInformacion() {
            return super.mostrarInformacion() + " - Canastilla: " + tieneCanastilla;
        }
        }
        ```
</details>

### Solución de `Notificacion.java` (polimorfismo)

<details>
    <summary>Click para ver</summary>
        ```java

        package Exercises;

        public interface Notificacion {
        void enviar(String mensaje);
        }
        ```
</details>

### Solución de `NotificacionCorreo.java`

<details>
    <summary>Click para ver</summary>
        ```java

        package Exercises;

        public class NotificacionCorreo implements Notificacion {
        private final String destinatario;

        public NotificacionCorreo(String destinatario) {
            this.destinatario = destinatario;
        }

        @Override
        public void enviar(String mensaje) {
            System.out.println("Correo para " + destinatario + ": " + mensaje);
        }
        }
        ```
</details>

### Solución de `NotificacionConsola.java`

<details>
    <summary>Click para ver</summary>
        ```java

        package Exercises;

        public class NotificacionConsola implements Notificacion {
        @Override
        public void enviar(String mensaje) {
            System.out.println("Notificación: " + mensaje);
        }
        }
        ```

        Una colección polimórfica puede utilizar ambas implementaciones de la misma forma:

        ```java

        List<Notificacion> notificaciones = Arrays.asList(
            new NotificacionCorreo("alumno@ejemplo.com"),
            new NotificacionConsola());

        for (Notificacion notificacion : notificaciones) {
        notificacion.enviar("La actividad fue registrada");
        }
        ```
        para este ejemplo se requieren los siguientes imports:

         ```java

        import java.util.Arrays;
        import java.util.List;
        ```

</details>


### Solución de `Libro.java` (integración de POO)

<details>
    <summary>Click para ver</summary>
        ```java

        package Exercises;

        public class Libro {
        private final String titulo;
        private boolean prestado;

        public Libro(String titulo) {
            if (titulo == null || titulo.trim().isEmpty()) {
                throw new IllegalArgumentException("El título es obligatorio");
            }
            this.titulo = titulo;
        }

        public String getTitulo() {
            return titulo;
        }

        public boolean estaPrestado() {
            return prestado;
        }

        public void prestar() {
            if (prestado) {
                throw new IllegalStateException("El libro ya está prestado");
            }
            prestado = true;
        }

        public void devolver() {
            prestado = false;
        }
        }
        ```
</details>

### Solución de `Usuario.java`

<details>
    <summary>Click para ver</summary>
    ```java

        package Exercises;

        public abstract class Usuario {
        private final String nombre;

        protected Usuario(String nombre) {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new IllegalArgumentException("El nombre es obligatorio");
            }
            this.nombre = nombre;
        }

        public String getNombre() {
            return nombre;
        }

        public abstract int getMaximoPrestamos();
        }
    ```
</details>


### Solución de `UsuarioRegular.java`

<details>
    <summary>Click para ver</summary>

    ```java

        package Exercises;

        public class UsuarioRegular extends Usuario {
        public UsuarioRegular(String nombre) {
            super(nombre);
        }

        @Override
        public int getMaximoPrestamos() {
            return 2;
        }
    }
    ```
</details>


### Solución de `UsuarioPremium.java`

<details>
    <summary>Click para ver</summary>
        ```java

        package Exercises;

        public class UsuarioPremium extends Usuario {
        public UsuarioPremium(String nombre) {
            super(nombre);
        }

        @Override
        public int getMaximoPrestamos() {
            return 5;
        }
        }
        ```
</details>

### Solución de `Biblioteca.java`

<details>
    <summary>Click para ver</summary>
        ```java

        package Exercises;

        import java.util.ArrayList;
        import java.util.HashMap;
        import java.util.List;
        import java.util.Map;

        public class Biblioteca {
        private final List<Libro> libros = new ArrayList<>();
        private final Map<Usuario, List<Libro>> prestamos = new HashMap<>();

        public void agregarLibro(Libro libro) {
            libros.add(libro);
        }

        public void prestarLibro(Libro libro, Usuario usuario) {
            if (!libros.contains(libro)) {
                throw new IllegalArgumentException("El libro no pertenece a la biblioteca");
            }
            List<Libro> librosDelUsuario = prestamos.computeIfAbsent(
                    usuario, clave -> new ArrayList<>());
            if (librosDelUsuario.size() >= usuario.getMaximoPrestamos()) {
                throw new IllegalStateException("Se alcanzó el límite de préstamos");
            }
            libro.prestar();
            librosDelUsuario.add(libro);
        }

        public void devolverLibro(Libro libro, Usuario usuario) {
            List<Libro> librosDelUsuario = prestamos.get(usuario);
            if (librosDelUsuario == null || !librosDelUsuario.remove(libro)) {
                throw new IllegalArgumentException("El usuario no tiene este libro");
            }
            libro.devolver();
        }
        }
        ```
</details>


 
