/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adrian
 */
import Ejercicios01Al14.ejercicios01Al14;
import java.util.Scanner;

public class prueba {

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
    if (esCapicua(num)) {
      System.out.println("El numero es capicuo");
    } else {
      System.out.println("El numero NO es capicuo");
    }
    //Comprueba si es primo y da el siguiente primo más cerano//////////////////
    if (esPrimo(num)) {
      System.out.println("El numero es primo");
    } else {
      System.out.println("El numero NO es primo");
      System.out.println("Éste es el primo siguiente más cercano " + siguientePrimo(num));
    }
    //Nos da la potencia////////////////////////////////////////////////////////
    System.out.println("La potencia (" + potenciaIntro + ") es " + potencia(num, potenciaIntro));
    //Contamos el número de digitos del numero introducido//////////////////////
    System.out.println("El número que introduciste tiene " + digitos(num) + " dígitos");
    //Volteamos el número///////////////////////////////////////////////////////
    System.out.println("Mostramos el número volteado " + voltea(num));
    //Sacamos el digito según la posición N/////////////////////////////////////
    System.out.println("El digito que está en la posición " + posicion + " es el " + digitoN(num, posicion));
    //Sacamosla posicion del digito/////////////////////////////////////////////
    System.out.println("La posicion de la primera ocurrencia del digito es " + posicionDeDigito(num, digito));
    //Quitamos N numeros por detras/////////////////////////////////////////////
    System.out.println("Quitando " + quitar + " números por detrás, el número se queda: " + quitaPorDetras(num, quitar));
    //Quitamos N numeros por detras/////////////////////////////////////////////
    System.out.println("Quitando " + quitar + " números por delante, el número se queda: " + quitaPorDelante(num, quitar));
    //Pegamos N numeros por detras//////////////////////////////////////////////
    System.out.println("Pegando " + pegar + " números por detrás, el número se queda: " + pegaPorDetras(num, pegar));
    //Pegamos N numeros por delante/////////////////////////////////////////////
    System.out.println("Pegando " + pegar + " números por delante, el número se queda: " + pegaPorDelante(num, pegar));
    //Trozo de numeros//////////////////////////////////////////////////////////
    System.out.println("Al " + num + " le cogemos el trozo que va desde " + posicionInicial + " hasta la " + posicionFinal + " y nos da " + trozoDeNumero(num, posicionInicial, posicionFinal));
    //Juntamos dos numeros//////////////////////////////////////////////////////
    System.out.println("Si juntamos el " + primero + " y el " + segundo + " nos da " + juntaNumeros(primero, segundo));

  }
}
