
package lab1_víctorromero;
import java.util.Scanner;

public class Lab1_VíctorRomero {

    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      
      System.out.println(">> Bienvenidos al Calculo de Promedios <<"); 
      System.out.print("- Ingrese su Nombre: "); // Ingrese nombre User
      String nombre = entrada.nextLine();
       
      System.out.println("Hola! "+nombre);
      System.out.println(" ");
        
      // Ingresar notas de las 4 Clases
      System.out.println(".:INGRESE LAS NOTAS:.");
      
      System.out.println(">> Ingrese la PRIMERA Nota Final de la clase: ");
      double primeraClase=entrada.nextDouble();
      
      System.out.println(">> Ingrese la SEGUNDA Nota Final de la clase: ");
      double segundaClase=entrada.nextDouble();
      
      System.out.println(">> Ingrese la TERCERA Nota Final de la clase: ");
      double terceraClase=entrada.nextDouble();
      
      System.out.println(">> Ingrese la CUARTA Nota Fi  nal de la clase: ");
      double cuartaClase=entrada.nextDouble();
      
      double Nota, Prom;
      Nota=primeraClase+segundaClase+terceraClase+cuartaClase;
      System.out.println(" ");
      System.out.println("-La Suma de las Notas es: "+ Nota);
      
      Prom=Nota/4;
      System.out.println(">>EL PROMEDIO DE NOTAS ES: "+Prom);
      System.out.println(" ");
      
      System.out.println("");
      
    }
    
}
