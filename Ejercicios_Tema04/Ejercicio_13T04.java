/**
Ejercicio 13
Escribe un programa que ordene tres números enteros introducidos por
teclado
* @Author: AdriánChSilva
 */

public class Ejercicio13_T04 {
  public static void main(String[] args) {

    System.out.println("Escribe tres números (enteros), los cuales a continuación serán ordenado-s de mayor a menor");
    System.out.println("Escriba el primer número");
    int a = Integer.parseInt(System.console().readLine());
    System.out.println("Escriba el segundo número");
    int b = Integer.parseInt(System.console().readLine());
    System.out.println("Escriba el tercer número"); 
    int c = Integer.parseInt(System.console().readLine());
    
    if ((a > b) && (a > c) && (b > c)) {
       System.out.println(a + " es mayor que " + b + " y éste que " + c);
    }
       
    if ((a > b) && (a > c) && (c > b)) {
       System.out.println(a + " es mayor que " + c + " y éste que " + b);
    }
    if ((b > a) && (b > c) && (c > a)) {
       System.out.println(b + " es mayor que " + c + " y éste que " + a);
    }
    
    if ((b > a) && (b > c) && (a > c)) {
       System.out.println(b + " es mayor que " + a + " y éste que " + c);
    }
 
    if ((c > a) && (c > b) && (a > b)) {
       System.out.println(c + " es mayor que " + a + " y éste que " + b);
    }
    
    if ((c > a) && (c > b) && (b > a)) {
       System.out.println(c + " es mayor que " + a + " y éste que " + b);
    }
 
 
           

  }
}
