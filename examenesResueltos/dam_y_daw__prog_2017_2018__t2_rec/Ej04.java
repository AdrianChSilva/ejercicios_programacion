/**
 * Crea la clase abstracta Figura con los atributos caracter y estaRellena que indican el carácter
 * con el que se debe pintar la figura y si está o no está rellena. Crea las clases Cuadrado y
 * Rectangulo como subclases de Figura. La clase Cuadrado debe tener el atributo lado y la clase
 * Rectangulo, los atributos altura y anchura. Implementa el método toString() para Cuadrado y para
 * Rectangulo de tal forma que se puedan visualizar las figuras. Prueba las clases y los métodos
 * desde un programa.
 * 
 * @author adrian.chamorrosilva
 *
 */
public class Ej04 {

  public static void main(String[] args) {
    
    Cuadrado cuad = new Cuadrado("*",false,8);
    System.out.println(cuad);
    Rectangulo rec = new Rectangulo("*",false,3,7);
    System.out.println(rec);
    Cuadrado cuad1 = new Cuadrado("*",true,8);
    System.out.println(cuad1);
    Rectangulo rec1 = new Rectangulo("*",true,3,7);
    System.out.println(rec1);
  }

}
