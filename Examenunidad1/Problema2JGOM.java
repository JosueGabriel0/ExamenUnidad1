import java.util.Scanner;
public class Problema2JGOM {
  static Scanner sc = new Scanner(System.in);

  static void Problem2 (){
  //Realice un algoritmo que permita determinar el monto de bono que percibirá un profesor (debe Capturar el valor del salario mínimo y los puntos del profesor). Represente el algoritmo en un lenguaje de alto nivel.
  //Declaracion de variables
  int puntaj=0, salariomin=0; 
  double bono=0;
  //Datos de entrada
  System.out.println("Ingrese su puntaje:");
  puntaj=sc.nextInt();
  System.out.println("Ingrese su salario minimo:");
  salariomin=sc.nextInt();
  //Proceso
  if (puntaj>=100 && puntaj<=200){bono=0.1*salariomin;
  }else if(puntaj>=201 && puntaj<=300){bono=0.4*salariomin;
  }else if(puntaj>=301 && puntaj<=400){bono=0.7*salariomin;
  }else if(puntaj>=401){bono=0.8*salariomin;
  }
  //Datos de salida
  System.out.println("El monto del bono que recibira es:"+bono);
  }

  
  public static void main(String[] args) {
    Problem2();}
}


