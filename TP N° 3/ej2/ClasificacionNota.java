package ej2;

public enum ClasificacionNota {
    SOBRESALIENTE("Su nota fue sobresaliente"), 
    APROBADO("Aprobado"),
    DESAPROBADO("Desaprobado"); 
    
    String nombre;


    public String getNombre(){
        return nombre;

    }    

    ClasificacionNota(String nombre){ 
        this.nombre = nombre;       
    }
}