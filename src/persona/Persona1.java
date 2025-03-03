package persona;


public class Persona1 {

    public String nombre;
    public String apellido;
    public int identificacion;
    public String fechaNacimiento;
    public String nacionalidad;
    public char genero;
    

    public Persona1 (String nombre, String apellido, int identificacion, String fechaNacimiento , String nacionalidad, char genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;
        this.genero = genero;
        
        
        
        
    }

    
    public void imprimir(){
        
        System.out.println("Nombre:" + nombre);
        System.out.println("Apellido:" + apellido);
        System.out.println("Identificacion:" + identificacion);
        System.out.println("FechaNacimiento:" + fechaNacimiento);
        System.out.print("Pais de nacimiento: " + nacionalidad);
        System.out.println("Genero: " + genero);
       
       
    }
    
    
    public void setGenero (char genero){
        
        if (genero == 'H' || genero == 'M'){
            
            this.genero = genero;
        } else {
            throw new IllegalArgumentException( "El genero debe ser 'H' o 'M' ");
        }
        
        
    }
    
    





    
}
    

