/**
Ejercicio 11
Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al
final aparecerá el número de suspensos, el número de suficientes, el número
de bienes, etc
@author: AdrianChSilva
 */
public class Ejercicio11_T06NotasAleatoriasContador{
  public static void main(String[] args) {
    
    int nota = 0;
    int contadorSuspenso = 0;
    int contadorSuficiente = 0;
    int contadorBien = 0;
    int contadorNotable = 0;
    int contadorSobresaliente = 0;

    for(int fila = 0; fila < 5; fila++){
     System.out.println(nota);
     nota = (int)(Math.random() * 11);
     if (nota <= 4){
       contadorSuspenso++;
       
     } else if (nota == 5){
       contadorSuficiente++;
      
     } else if ((nota >=6) && (nota <= 7)){
       contadorBien++;
       
     } else if ((nota >=8) && (nota <= 9)){
       contadorNotable++;
       
     } else if (nota == 10){
       contadorSobresaliente++;
     } //las notas salen mal contadas y no entiendo por qué.
     }
     System.out.println("Nº de Sobresalientes "+ contadorSobresaliente);
     System.out.println("Nº de Notables "+ contadorNotable);
     System.out.println("Nº de Bienes "+ contadorBien);
     System.out.println("Nº de Suficientes "+ contadorSuficiente);
     System.out.println("Nº de suspensos"+ contadorSuspenso);
  }
}
