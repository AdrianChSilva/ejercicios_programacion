
public class Alumno {
  private static int expedienteInicial = 0;
  private String nombre;
  private String apellido;
  private String email;
  private int numero;
  public static int getExpedienteInicial() {
    return expedienteInicial;
  }
  public static void setExpedienteInicial(int expedienteInicial) {
    Alumno.expedienteInicial = expedienteInicial;
  }
  public String getNombre() {
    return nombre;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  public String getApellido() {
    return apellido;
  }
  public void setApellido(String apellido) {
    this.apellido = apellido;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public int getNumero() {
    return numero;
  }
  public void setNumero(int numero) {
    this.numero = numero;
  }  
  
  static int obtenerNumero() {
    Alumno.setExpedienteInicial(Alumno.getExpedienteInicial() +1);
    return Alumno.getExpedienteInicial();
  }
  public Alumno(String nombre,String apellido, String email) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.email = email;
    this.numero = Alumno.obtenerNumero();
  }
  @Override
  public String toString() {
    return numero + ": " + this.apellido + ", " + this.nombre + " <" + this.email + ">";
  }
  
  
}
