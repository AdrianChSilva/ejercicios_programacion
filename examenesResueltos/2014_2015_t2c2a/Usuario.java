
public class Usuario {
  private String nombre;
  private String apellidos;
  private String email;
  private static int activado;
  private boolean activa = false;
  private int pass;

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellidos() {
    return apellidos;
  }

  public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public static int getActivado() {
    return activado;
  }

  public static void setActivado(int activado) {
    Usuario.activado = activado;
  }


  public Usuario(String nombre, String apellidos, String email) {

    this.nombre = nombre;
    this.apellidos = apellidos;
    this.email = email;
      activado = 0;
  }

  public void activa() {
    this.activa = true;
    if(this.activa == true) {
      activado++;
      this.pass =(int)(Math.random()*900000) +100000;
    }
  }

  @Override
  public String toString() {
    String resultado;
    if(this.activa == true) {
      resultado= apellidos + ", " + nombre + " <" + email+ "> - " + pass;
    }else {
      resultado= apellidos + ", " + nombre + " <" + email+ "> - Usuario no activado";
    }
    return resultado;
  }
  

}
