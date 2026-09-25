    class Profesor extends Sobrecarga{
        public Profesor(String nombre, String materia, int calificacion){
            super(nombre, materia, calificacion);
        }
        
        @Override 
        public String reprobar(){
            if(this.calificacion>5)
                return ">:) Sacaste " + calificacion + " en " + materia;
            else
                return ":(";
        }
    }