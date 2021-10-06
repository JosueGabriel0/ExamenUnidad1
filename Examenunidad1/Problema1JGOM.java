import java.util.Scanner;
public class Problema1JGOM {
  static Scanner sc = new Scanner(System.in);

  static void Problem1 (){
   //Diseñe un algoritmo para determinar el promedio que obtendrá un alumno considerando que realiza tres exámenes de los cuales el primero y el segundo tienen una ponderación de 25% Mientras que el tercero de 50%.
   //Declaracion de variables 
   int nota1=0, nota2=0, nota3=0;
   double promediofinal=0;
   //Datos de entrada
   System.out.println("Ingrese nota del examen 1");
   nota1=sc.nextInt();
   System.out.println("Ingrese nota del examen 2");
   nota2=sc.nextInt();
   System.out.println("Ingrese nota del examen 3");
   nota3=sc.nextInt();
  //Proceso
  promediofinal=(0.25*nota1)+(0.25*nota2)+(0.5*nota3);
  //Datos de salida
  System.out.println("El promedio final es de:"+promediofinal);
  }


  public static void main(String[] args) {
    Problem1();}
}