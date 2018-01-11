/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adrian
 */
//import java.util.Scanner;
//
//public class Ex10acs01 {
//
//  public static void main(String[] args) {
//    Scanner s = new Scanner(System.in);
//    int precio = 0;
//    float nataPcio = 0;
//    int pcioConNata = 0;
//    String rosco = "";
//    String nataOno = "";
//    System.out.print("Seleccione el tamaño del roscón: ");
//    System.out.println("1. Pequeño 2. Mediano 3. Grande");
//    String tamano = s.nextLine();
//    System.out.print("Elija el tipo");
//    System.out.println("1. Normal 2.De chocolate");
//    String tipo = s.nextLine();
//    switch (tipo) {
//      case "1":
//        if (tamano.equals("1")) {
//          precio = 8;
//          rosco = "Rosco normal pequeño";
//        } else if (tamano.equals("2")) {
//          precio = 10;
//          rosco = "Rosco normal mediano";
//        } else if (tamano.equals("3")) {
//          precio = 14;
//          rosco = "Rosco normal Grande";
//        }
//        break;
//      case "2":
//        if (tamano.equals("1")) {
//          precio = 10;
//          rosco = "Rosco con cocholate pequeño";
//        } else if (tamano.equals("2")) {
//          precio = 13;
//          rosco = "Rosco con cocholate mediano";
//        } else if (tamano.equals("3")) {
//          rosco = "Roscón con cocholate grande";
//          precio = 16;
//
//        }
//        break;
//    }
//
//    System.out.println("¿Quiere nata? (s/n)");
//    String nata = s.nextLine();
//
//    switch (nata) {
//      case "s":
//        nataPcio = (float) 0.1;
//        nataOno = "Con nata";
//        break;
//      case "n":
//        nataOno = "Sin nata";
//        nataPcio = 0;
//        break;
//    }
//    System.out.println("¿Quiere la versión light ? (s/n)");
//    String version = s.nextLine();
//    switch (version) {
//      case "s":
//        float suma = precio + (precio * nataPcio);
//        System.out.println("gracias aquí tiene su ticket");
//        System.out.println(rosco + " " + precio + " €");
//        System.out.println(nataOno + " " + (precio * nataPcio) + " €");
//        System.out.println("Versión light " + suma + " €");
//        System.out.println("Total " + (suma + suma) + " €");
//
//        break;
//      case "n":
//        suma = precio + (precio * nataPcio);
//        System.out.println("Gracias aquí tiene su ticket");
//        System.out.println(rosco + " " + precio + " €");
//        System.out.println(nataOno + " " + (precio * nataPcio) + " €");
//        System.out.println("Total " + ((precio * nataPcio) + precio) + " €");
//        break;
//    }
//
//  }
//}
