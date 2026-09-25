    class Alumno extends Sobrecarga{
        public Alumno(String nombre, String materia, int calificacion){
            super(nombre, materia, calificacion);
        }
        
        @Override
        public String reprobar(){
            return calificacion < 6 ? ":(" : ":)";
        }   
    }