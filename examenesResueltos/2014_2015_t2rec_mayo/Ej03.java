/**
 * Crea la clase abstracta Figura con el atributo caracter, que indicará el carácter con el que se
 * debe pintar la figura por pantalla. Crea, a su vez, las clases Rectangulo - con los atributos
 * base y altura – y Piramide – con el atributo altura - como subclases de Figura. Implementa el
 * método toString() para Rectangulo y para Piramide de tal forma que se puedan pintar por pantalla
 * las figuras (huecas) mediante print o println. Debe haber tres variables de clase llamadas
 * figurasCreadas, rectangulosCreados y piramidesCreadas (colócalas donde corresponda) con sus
 * correspondientes getter. Prueba estas clases en un programa para comprobar que todo funciona
 * bien.
 * 
 * @author adrian.chamorrosilva
 *
 */
public class Ej03 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Rectangulo rec = new Rectangulo("*",5,3);
    Rectangulo rec2 = new Rectangulo("*",8,2);
    Piramide pir = new Piramide("*", 6);
    Piramide pir2 = new Piramide("*", 4);
    System.out.println(rec);
    System.out.println(rec2);
    System.out.println(pir);
    System.out.println(pir2);
    System.out.println("Número de Piramides: " + Piramide.getPiramidesCreadas());
    System.out.println("Número de Rectángulos: " + Rectangulo.getRectangulosCreados());
    System.out.println("Número de Figuras: " + Figura.getFigurasCreadas());
  }

}
