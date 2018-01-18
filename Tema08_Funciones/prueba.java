/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adrian
 */
import funciones.Ejercicios01Al14;
import java.util.Scanner;

public class Prueba {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Introduce un número ");
    int num = s.nextInt();
    System.out.println("Introduce una potencia");
    int potenciaIntro = s.nextInt();
    System.out.println("Introduce una 'posicion'");
    int posicion = s.nextInt();
    System.out.println("Introduce un digito");
    int digito = s.nextInt();
    System.out.println("Introduce cuantos numeros quieres quitar");
    int quitar = s.nextInt();
    System.out.println("Introduce algún numero que quieras pegar");
    int pegar = s.nextInt();
    System.out.println("Introduce una 'posicion inicial'");
    int posicionInicial = s.nextInt();
    System.out.println("Introduce una 'posicion Final'");
    int posicionFinal = s.nextInt();
    System.out.println("Para terminar, juntaremos dos numeros ");
    System.out.println("Introduce el primer numero para juntar ");
    int primero = s.nextInt();
    System.out.println("Introduce el segundo numero para juntar ");
    int segundo = s.nextInt();

    System.out.println();

    //Comprueba si es capicuo///////////////////////////////////////////////////
    if (Ejercicios01Al14.esCapicua(num)) {
      System.out.println("El numero es capicuo");
    } else {
      System.out.println("El numero NO es capicuo");
    }
    //Comprueba si es primo y da el siguiente primo más cerano//////////////////
    if (Ejercicios01Al14.esPrimo(num)) {
      System.out.println("El numero es primo");
    } else {
      System.out.println("El numero NO es primo");
      System.out.println("Éste es el primo siguiente más cercano " + Ejercicios01Al14.siguientePrimo(num));
    }
    //Nos da la potencia////////////////////////////////////////////////////////
    System.out.println("La potencia (" + potenciaIntro + ") es " + Ejercicios01Al14.potencia(num, potenciaIntro));
    //Contamos el número de digitos del numero introducido//////////////////////
    System.out.println("El número que introduciste tiene " + Ejercicios01Al14.digitos(num) + " dígitos");
    //Volteamos el número///////////////////////////////////////////////////////
    System.out.println("Mostramos el número volteado " + Ejercicios01Al14.voltea(num));
    //Sacamos el digito según la posición N/////////////////////////////////////
    System.out.println("El digito que está en la posición " + posicion + " es el " + Ejercicios01Al14.digitoN(num, posicion));
    //Sacamosla posicion del digito/////////////////////////////////////////////
    System.out.println("La posicion de la primera ocurrencia del digito es " + Ejercicios01Al14.posicionDeDigito(num, digito));
    //Quitamos N numeros por detras/////////////////////////////////////////////
    System.out.println("Quitando " + quitar + " números por detrás, el número se queda: " + Ejercicios01Al14.quitaPorDetras(num, quitar));
    //Quitamos N numeros por detras/////////////////////////////////////////////
    System.out.println("Quitando " + quitar + " números por delante, el número se queda: " + Ejercicios01Al14.quitaPorDelante(num, quitar));
    //Pegamos N numeros por detras//////////////////////////////////////////////
    System.out.println("Pegando " + pegar + " números por detrás, el número se queda: " + Ejercicios01Al14.pegaPorDetras(num, pegar));
    //Pegamos N numeros por delante/////////////////////////////////////////////
    System.out.println("Pegando " + pegar + " números por delante, el número se queda: " + Ejercicios01Al14.pegaPorDelante(num, pegar));
    //Trozo de numeros//////////////////////////////////////////////////////////
    System.out.println("Al " + num + " le cogemos el trozo que va desde " + posicionInicial + " hasta la " + posicionFinal + " y nos da " + Ejercicios01Al14.trozoDeNumero(num, posicionInicial, posicionFinal));
    //Juntamos dos numeros//////////////////////////////////////////////////////
    System.out.println("Si juntamos el " + primero + " y el " + segundo + " nos da " + Ejercicios01Al14.juntaNumeros(primero, segundo));

  }
}
