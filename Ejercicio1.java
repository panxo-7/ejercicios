package ejercicio;
import java.util.Scanner;
public class Ejercicio {
    
    public static void main(String[] args) {
        
        for (int i = 1; i <= 100; i++){
            print(fizzBuzz(i));
        } 
    }
    
    public static void print(String texto){
       System.out.println(texto);
    }
    
    public static String fizzBuzz(int numero){
       if (numero % 3 == 0 && numero % 5 == 0){
          return "FizzBuzz";
       } else 
           if (numero % 3 == 0){
          return "Fizz";
       } else 
           if (numero % 5 == 0){
          return "Buzz";
       } else {
          return String.valueOf(numero);
       }
    }
}
