import java.util.Scanner;
public class Problema3 {
  static Scanner sc = new Scanner(System.in);

  static void Problem3 (){
  //El ministro de salud requiere un diagrama de flujo que represente el algoritmo que permita determinar que tipo de vacuna (A, B o C) contra el Covid-19 debe aplicar a una persona; considerando que si es mayor de 70 años, sin importar el sexo se le aplica el tipo C; si tiene entre 16 y 69 años, y es mujer se le aplica el Tipo B, y si es hombre, el tipo A; si es menor de 16 años, se le aplica el tipo A, sin importar el sexo.
  //Declaracion de variables
  int sexo=0, edad=0;
  String tipodevacuna="";
  //Datos de entrada
  System.out.println("Ingrese su sexo (1 si es hombre y 2 si es mujer):");
  sexo=sc.nextInt();
  System.out.println("Ingrese su edad:");
  edad=sc.nextInt();
  //Proceso
   if (edad>=70){switch(sexo) {
   case 1: tipodevacuna="C";break;
   case 2: tipodevacuna="C";break;
   default:
      tipodevacuna="No existente(Asegurese de solo insertar 1 ó 2)";
  }
  }else if (edad>=16 && edad<=69 && sexo==2){switch(sexo) {
   case 2: tipodevacuna="B";break;
   default:
      tipodevacuna="No existente(Asegurese de solo insertar 1 ó 2)";
  }
  }else if (edad>=16 && edad<=69 && sexo==1){switch(sexo) {
   case 1: tipodevacuna="A";break;
   default:
      tipodevacuna="No existente(Asegurese de solo insertar 1 ó 2)";
  }
  }else if (edad<16){switch(sexo) {
   case 1: tipodevacuna="A";break;
   case 2: tipodevacuna="A";break;
   default:
      tipodevacuna="No existente(Asegurese de solo insertar 1 ó 2)";
  }
  }
  //Datos de salida
  System.out.println("Su tipo de vacuna es: "+tipodevacuna);

  }
  


public static void main(String[] args) {
    Problem3();}
}