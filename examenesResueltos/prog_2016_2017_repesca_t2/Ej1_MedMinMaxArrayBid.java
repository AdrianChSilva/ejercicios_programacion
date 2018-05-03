import java.util.Arrays;

/**
 * Realiza un programa que calcule la estatura media, mínima y máxima en centímetros de personas de
 * diferentes países. El array que contiene los nombres de los paises es el siguiente: pais =
 * {“España”, “Rusia”, “Japón”, “Australia”}. Los datos sobre las estaturas se deben simular
 * mediante un array de 4 filas por 10 columnas con números aleatorios generados al azar entre 140 y
 * 210. Los decimales de la media se pueden despreciar. Los nombres de los países se deben mostrar
 * utilizando el array de países (no se pueden escribir directamente).
 * 
 * @author adrian.chamorrosilva
 *
 */
public class Ej1_MedMinMaxArrayBid {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    String[] paises = {"Españ", "Rusia", "Japón", "Austr"};
    int[][] estaturas = new int[4][10];
    int maxESP = Integer.MIN_VALUE;
    int minESP = Integer.MAX_VALUE;
    
    int maxRUS = Integer.MIN_VALUE;
    int minRUS = Integer.MAX_VALUE;
    
    int maxJAP = Integer.MIN_VALUE;
    int minJAP = Integer.MAX_VALUE;
    
    int maxAUS = Integer.MIN_VALUE;
    int minAUS = Integer.MAX_VALUE;
 
    int filas;
    int columnas;
    int sumaFilaESP;
    int sumaFilaRUS;
    int sumaFilaJAP;
    int sumaFilaAUS;
    int auxESP= 0;
    int auxRUS= 0;
    int auxJAP= 0;
    int auxAUS= 0;
    
    for (filas = 0; filas < 4; filas++) {
      for (columnas = 0; columnas < 10; columnas++) {
        estaturas[filas][columnas] = (int) (Math.random() * 70) + 140;
      }
    }
    // Generamos e imprimimos
    for (filas = 0; filas < 4; filas++) {
      System.out.printf("\n " + paises[filas]);
      sumaFilaESP= 0;
      sumaFilaRUS= 0;
      sumaFilaJAP= 0;
      sumaFilaAUS= 0;
      for (columnas = 0; columnas < 10; columnas++) {
        
        System.out.printf("%5d   ", estaturas[filas][columnas]);

        // Maximos y minimos ESPAÑA
        if (estaturas[0][columnas] > maxESP) {
          maxESP = estaturas[0][columnas];
          
        }
        
        if (estaturas[0][columnas] < minESP) {
          minESP = estaturas[0][columnas];

        }
        // Maximos y minimos RUSIA
        if (estaturas[1][columnas] > maxRUS) {
          maxRUS = estaturas[1][columnas];
        }
        if (estaturas[1][columnas] < minRUS && estaturas[1][columnas] != 0) {
          minRUS = estaturas[1][columnas];
        }
        
        // Maximos y minimos JAPON     
        if (estaturas[2][columnas] > maxJAP) {
          maxJAP = estaturas[2][columnas];
        }
        if (estaturas[2][columnas] < minJAP && estaturas[2][columnas] != 0) {
          minJAP = estaturas[2][columnas];
        }

        // Maximos y minimos AUSTRALIA
        if (estaturas[3][columnas] > maxAUS) {
          maxAUS = estaturas[3][columnas];
        }
        if (estaturas[3][columnas] < minAUS && estaturas[3][columnas] != 0) {
          minAUS = estaturas[3][columnas];
        }
        //CALCULOS DE MEDIAS ESPAÑA
        if(estaturas[0][columnas]> 0) {
          sumaFilaESP += estaturas[0][columnas];
          auxESP = sumaFilaESP;
        }
        
      //CALCULOS DE MEDIAS RUSIA
        if(estaturas[1][columnas]> 0) {
          sumaFilaRUS += estaturas[1][columnas];
          auxRUS = sumaFilaRUS;
        }
        //CALCULOS DE MEDIAS JAPON
        if(estaturas[2][columnas]> 0) {
          sumaFilaJAP += estaturas[2][columnas];
          auxJAP = sumaFilaJAP;
        }
        //CALCULOS DE MEDIAS australia
        if(estaturas[3][columnas]> 0) {
          sumaFilaAUS += estaturas[3][columnas];
          auxAUS = sumaFilaAUS;
        }
      }
    }
    System.out.println();
    System.out.println("Estatura maxima de españa " + maxESP + " y estatura minima " + minESP +
        " y su media " + auxESP/10);
    System.out.println("Estatura maxima de Rusia " + maxRUS + " y estatura minima " + minRUS + 
        " y su media " + auxRUS/10);
    System.out.println("Estatura maxima de JAPON " + maxJAP + " y estatura minima " + minJAP +
        " y su media " + auxJAP/10);
    System.out.println("Estatura maxima de AUSTRALIA " + maxAUS + " y estatura minima " + minAUS + 
        " y su media " + auxAUS/10);
  }
}

