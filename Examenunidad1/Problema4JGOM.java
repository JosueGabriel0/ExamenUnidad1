import java.util.Scanner;
public class Problema4JGOM {
  static Scanner sc = new Scanner(System.in);

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




public static void main(String[] args) {
    Problem4();}
}