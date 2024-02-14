package recuGIT;

import java.util.Scanner;

public class Calculadora {

  private static Scanner sc = new Scanner(System.in);
  
  public static void main(String[] args) {
      
    //Bucle de operaciones
    int continuar = 1;
    while(continuar != 0){
      System.out.println("CALCULADORA");
      System.out.println("-----------");
      System.out.println("1.Suma");
      System.out.println("2.Resta");
      System.out.println("0.Salir de la aplicación");
      continuar = Integer.parseInt(sc.nextLine());
      
      if(continuar == 1) {
        System.out.print("Introduzca el primer numero:");
        int numeroUno = Integer.parseInt(sc.nextLine());
        System.out.print("Introduzca el segundo numero: ");
        int numeroDos = Integer.parseInt(sc.nextLine());        
        System.out.println( suma(numeroUno,numeroDos));
   
      }else if(continuar == 2) {
        System.out.print("Introduzca el primer numero:");
        int numeroUno = Integer.parseInt(sc.nextLine());
        System.out.print("Introduzca el segundo numero: ");
        int numeroDos = Integer.parseInt(sc.nextLine());        
        System.out.println( resta(numeroUno,numeroDos));      }
    }
  }

  
  private static int suma(int numeroUno,int numeroDos) {
    return (numeroUno + numeroDos);
  }
  
  private static int resta(int numeroUno,int numeroDos) {
    return (numeroUno - numeroDos);
  }
}
