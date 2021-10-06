//Realice un algoritmo que le permita probar uno de los 4 primeros algoritmos que ha diseñado anteriormente aplicando una estructura condicional múltiple o algo similar, o las estructuras que se requiera usar.
import java.util.Scanner;
public class Problema5 {
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


  static void Problem4 (){
    //Diseñar un algoritmo que permita calcular una operación aritmética entre 2 valores introducidos y el signo correspondiente por teclado: si es el signo es + debe realizar la suma, si es el signo – debe realizar la resta, si es el signo / debe realizar la división, si es el signo * debe realizar la multiplicación, si es el signo ^ debe realizar la potencia; representar el algoritmo mediante un lenguaje de alto nivel.
    //Declarar variables 
    String signo="";
    double valor1=0, valor2=0, resultado=0;
    //Datos de entrada 
    System.out.println("Ingrese su primer valor:");
    valor1=sc.nextInt();
    System.out.println("Ingrese el signo de la operación(+,-,/,*,^):");
    signo=sc.next().toUpperCase();
    System.out.println("Ingrese su segundo valor:");
    valor2=sc.nextInt();
    //Proceso 
    if(signo.equals("+")){resultado=valor1 + valor2;
    }else if (signo.equals("-")){resultado=valor1 - valor2;
    }else if (signo.equals("/")){resultado=(valor1)/(valor2);
    }else if (signo.equals("*")){resultado=valor1 * valor2;
    }else if (signo.equals("^")){resultado= Math.pow(valor1,valor2);
    }
    //Datos de salida
    System.out.println("Su resultado es: "+valor1+signo+valor2+"="+resultado);

  }


  static void Problem5(){   
    //Realice un algoritmo que le permita probar uno de los 4 primeros algoritmos que ha diseñado anteriormente aplicando una estructura condicional múltiple o algo similar, o las estructuras que se requiera usar.
  //Declaracion de variables
  int opcionesA=0;
  //Datos de entrada
  System.out.println("-------------------------------");
  String msg="\nIngrese el Algoritmo que desea Probar 1=Problema1(Notas),2=Problema2(Bono),3=Problema3(Tipo De Vacuna),4=Problema4(Operacion Aritmética Entre dos valores):";
  System.out.println(msg);
  opcionesA=sc.nextInt();  
  //Proceso
  while(opcionesA!=0){
      switch(opcionesA) {
        case 1: Problem1();break;
        case 2: Problem2();break;
        case 3: Problem3();break;
        case 4: Problem4();break;
        default:
          System.out.println("El Algoritmo no existe!");
      }   
  //Datos de salida    
    System.out.println("------------------------------");  
    System.out.println(msg);
    opcionesA=sc.nextInt();        
  }

 }
 public static void main(String[] args) {
  Problem5();
   }
 
}
