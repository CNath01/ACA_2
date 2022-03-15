
import java.util.Scanner;

public class AcaDos_POO {
    private Scanner tecladoUno;
    int eleccion;
    
    public static void main(String[] args) {
       AcaDos_POO imprimir= new AcaDos_POO();
       imprimir.TipoUsuario();
    }
    
    public void TipoUsuario()
    {
        System.out.println("------------------------ | BIENVENIDO | ------------------------ ");
        System.out.println("\nDigite [1] si es estudiante o [2] si es administrativo:");
        System.out.print(">> ");
        
        tecladoUno= new Scanner(System.in);
        
        eleccion= tecladoUno.nextInt();
        
        if(eleccion == 1)
        {
            Estudiante estu= new Estudiante();
            
            estu.AñoEscolar();
            estu.ValorPension();
            estu.Horario();
            estu.MediodeTransporte();
            estu.ImprimirTodo();
            
        }else if(eleccion == 2)
        {
            Administrativos admi= new Administrativos ();
            admi.datos();
            admi.AreaTrabajo();
            admi.Horario();
            admi.MediodeTransporte();
            admi.Tipodecontrato();
            admi.ImprimirTodo();
                    
        }else
        {
            System.out.println("\nVALOR INVALIDO");
        }
    }
    
}

class Estudiante{
    //dato estudiante
    String nombre;
    int edad;
    int id;
    String direccion;
    float telefono;
    String precio;
    private Scanner consola;  
    String ruta;
    String año;
    String hor;
    
        

    public void datos(){
        System.out.println("==========================================");
        System.out.println("                REGISTRO");
        System.out.println("==========================================");
        
        //nombre
        System.out.println("\nDigite Nombre:");
        System.out.print(">> ");
        consola= new Scanner(System.in);
        
        nombre= consola.nextLine();
        //edad
        System.out.println("Digite Edad:");
        System.out.print(">> ");
        consola= new Scanner(System.in);
        
        edad= consola.nextInt();
        
        //id
        System.out.println("Digite identificacion:");
        System.out.print(">> ");
        consola= new Scanner(System.in);
        
        id= consola.nextInt();
        
        //telefono
        System.out.println("Digite telefono:");
        System.out.print(">> ");
        consola= new Scanner(System.in);
        
        telefono= consola.nextFloat();
        
        //direccion
        System.out.println("Digite Direccion:");
        System.out.print(">> ");
        consola= new Scanner(System.in);
        
        direccion= consola.nextLine();
        
        System.out.println("\n");
       
    }
 
   
	//aÃ±o
    public void AñoEscolar()
    { 
        datos();
        //primaria
        if(edad <= 11 && edad > 0){
            año="Año Escolar: Primaria";
            
        }
        //bachillerato
        else if(edad > 11 && edad <= 18){
             año="Año Escolar: Bachillerato";
        }
        else
        {
            System.out.println("VALOR INVALIDO");
        }
        
    }
    
        //pension
   public void ValorPension(){
        //primaria
        if(edad <= 11){
            precio= "$ 200.000";
            
            
        }
        //bachillerato
        else if(edad > 11 && edad <= 18){
            precio= "$ 300.000";
        }
    }
   
    public void Horario()
    {
        //primaria
         if(edad <= 11 && edad > 0){
             hor="Horario: [6:00am-12:00pm]";
            
        }
        //bachillerato
        else if(edad > 11 && edad <= 18){
            hor="Horario: [6:00am-2:00pm]";

        }
    }
    public void MediodeTransporte (){
         //primaria
         if(edad <= 11 && edad > 0){
             ruta="Ruta: A";
            
        }
        //bachillerato
        else if(edad > 11 && edad <= 18){
            ruta="Ruta: B";
           
        } 
    }
     public void ImprimirTodo (){
        System.out.println("==========================================");
        System.out.println("             DATOS PERSONALES");
        System.out.println("==========================================");
        
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("ID: "+id);
        System.out.println("Telefono: "+ telefono);
        System.out.println("Direccion: : "+direccion);
         System.out.println(año);
         System.out.println("Pension: "+ precio);
         System.out.println(hor);
         System.out.println(ruta);
        System.out.println("------------------------------------------");
    }

    
} 

class Administrativos {
    
    int edad2=0;
    int id2=0;
    float telefono2;
    private Scanner consola; 
    int cargo;
    int contrato;
    String contrdef, hor, cargodef, nombre2, direccion2, ruta;
   
    
     public void datos(){
        System.out.println("==========================================");
        System.out.println("                REGISTRO");
        System.out.println("==========================================");
        //nombre
        System.out.println("\nDigite Nombre:");
        System.out.print(">> ");
        consola= new Scanner(System.in);
        
        nombre2= consola.nextLine();
     
        
       //id
        System.out.println("Digite identificacion:");
        System.out.print(">> ");
        consola= new Scanner(System.in);
        
        id2= consola.nextInt();
        
        //telefono
        System.out.println("Digite telefono:");
        System.out.print(">> ");
        consola= new Scanner(System.in);
        
        telefono2= consola.nextFloat();
        
        //direccion
        System.out.println("Digite Direccion:");
        System.out.print(">> ");
        consola= new Scanner(System.in);
        
        direccion2= consola.nextLine();
        
        System.out.println("\n");
       
    }
    
    public void AreaTrabajo(){
         System.out.println("Digite [1] si es profesor de primaria o digite [2] si es profesor de bachillerato:");
         System.out.print(">> ");
         consola= new Scanner(System.in);
         
         cargo= consola.nextInt();
         if (cargo ==1) {
             cargodef="Area: Primaria";
        } else if (cargo == 2) {
            cargodef="Area: Bchillerato";
        }
        
    }
   
    public void Tipodecontrato(){  
         
         System.out.println("Digite [1] si es indefinido o digite [2] si por 6 meses:");
         System.out.print(">> ");
         consola= new Scanner(System.in);
         contrato= consola.nextInt();
          if (contrato ==1) {
             contrdef="Contrato: Indefinido";
        } else if (contrato == 2) {
            contrdef="Contrato: Temporal";
        }
    }  
    public void Horario()
    {
        //primaria
         if(cargo == 1){
             hor="Horario: 6:00am-12:00pm";
        }
        //bachillerato
        else if(cargo == 2){
            hor="Horario: 6:00am-2:00pm";
        }
        else
             System.out.println("VALOR INVALIDO");
    }
    public void MediodeTransporte (){
         //primaria
         if(cargo == 1){
             ruta="Ruta: A";
           
        }
        //bachillerato
        else if(cargo == 2){
            ruta="Medio de transporte publico o privado";
           
        }
    }
    
     public void ImprimirTodo (){
        System.out.println("==========================================");
        System.out.println("             DATOS PERSONALES");
        System.out.println("==========================================");
        
        System.out.println("Nombre: "+nombre2);
        System.out.println("Edad: "+edad2);
        System.out.println("ID: "+id2);
        System.out.println("Telefono: "+ telefono2);
        System.out.println("Direccion: : "+direccion2);
         System.out.println(cargodef);
         System.out.println(contrdef);
         System.out.println(hor);
         System.out.println(ruta);
        System.out.println("------------------------------------------");
    }

   
}