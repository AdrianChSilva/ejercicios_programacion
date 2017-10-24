/**
Ejercicio 10
Escribe un programa que nos diga el horóscopo a partir del día y el mes de
nacimiento
* @Author: AdriánChSilva
 */

public class Ejercicio_10T04 {
  public static void main(String[] args) {
  
    System.out.println("Por favor, introduce el día de tu nacimiento: ");
    int dia = Integer.parseInt( System.console().readLine() );
   
    System.out.println("Ahora escribe con letras el mes en el que naciste: ");
    int mes = Integer.parseInt( System.console().readLine() );
    String horoscopo = "";
    switch (mes) {
      case 1:
        if (dia < 21) {
          horoscopo = "♑ Capricornio";
        } else {
          horoscopo = "♒ Acuario";
        }
          break;
          
      case 2:
        if (dia < 19) {
          horoscopo = "♒ Acuario";
        } else {
          horoscopo = "♊ piscis";
        }
          break;
          
      case 3: 
        if (dia < 21) {
          horoscopo = "♊ piscis";
        } else {
          horoscopo = "♈ aries";
        }
          break;
      
      case 4: 
        if (dia < 21) {
          horoscopo = "♈ aries";
        } else {
          horoscopo = "♉ Tauro";
        }
          break;
      
      case 5:
        if (dia < 20) {
          horoscopo = "♉ Tauro";
        } else {
          horoscopo = "♊ Gémini";
        }
        break;
        
      case 6:
        if (dia < 22) {
          horoscopo = "♊ Gémini";
        } else {
          horoscopo = "♋ cáncer";
        }
        break;
        
      case 7:
        if (dia < 22) {
          horoscopo = "♋ cáncer";
        } else {
          horoscopo = "♌ Leo";
        }
        break;
        
      case 8:
        if (dia < 24) {
          horoscopo = "♌ Leo";
        } else {
          horoscopo = "♍ virgo";
        }
        break;
        
      case 9:
        if (dia < 23) {
          horoscopo = "♍ virgo";
        } else {
          horoscopo = "♎ libra";
        }
        break;
    
      case 10:
        if (dia < 23) {
          horoscopo = "♎ libra";
        } else {
          horoscopo = "♏ escorpio";
        }
        break;
   
      case 11:
        if (dia < 23) {
          horoscopo = "♏ escorpio";
        } else {
          horoscopo = "♐ sagitario";
        }
        break;
   
      case 12:
        if (dia < 21) {
          horoscopo = "♐ sagitario";
        } else {
          horoscopo = "♑ Capricornio";
        }
        break;
    
      default:
    }

    System.out.print("Su horóscopo es " + horoscopo);

  }
}

