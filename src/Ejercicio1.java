
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Ejercicio1 {



    public String nombre;
    public String apellido;
    public int identificacion;
    public String fechaNacimiento;
    public int edad;
    public String nacionalidad;
    public char genero;

    public Ejercicio1(String nombre, String apellido, int identificacion, String fechaNacimiento , String nacionalidad, char genero, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;
        this.genero = genero;
        this.edad = edad;
        
        
    }

    

    public void imprimir(){
        
        System.out.println("Nombre:" + nombre);
        System.out.println("Apellido:" + apellido);
        System.out.println("Identificacion:" + identificacion);
        System.out.println("FechaNacimiento:" + fechaNacimiento);
        System.out.println("Que edad tiene :" + calcularEdad() + "años");
        System.out.print("Pais de nacimiento: " + nacionalidad);
        System.out.println("Genero: " + genero);
    }
    
    
    public int calcularEdad(){
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/DD/YY");
        LocalDate fechaNac =LocalDate.parse(fechaNacimiento, formatter);
        LocalDate hoy = LocalDate.now();
        return Period.between(fechaNac, hoy).getYears();
    }
    
    public void setGenero (char genero){
        
        if (genero == 'H' || genero == 'M'){
            
            this.genero = genero;
        } else {
            throw new IllegalArgumentException( "El genero debe ser 'H' o 'M' ");
        }
        
        
    }
    
    





    
}
