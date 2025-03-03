package persona;
public class Principal {
    



    public static void main(String[] args) {
       Persona1 per1 = new Persona1 ("Jhon" , "Bellaizac", 152312,"25/01/2000", "Colombia", 'H');
       Persona1 per2 = new Persona1("Cristian","Giraldo" , 145623, "23/03/2001", "Canada", 'H');
       Persona1 per3 = new Persona1 ("Maria" , "Moreno", 12542,"23/01/1998","Inglaterra", 'M');
        
        
        
        System.out.println("Informacion de la persona1:");
        per1.imprimir();
        
        System.out.println();
        
        
        System.out.println("Informacion de la persona2:");
        per2.imprimir();
        
        System.out.println();
        
        System.out.println("Informacion de la persona3");
        per3.imprimir();
    }

  
    
}








    
    

