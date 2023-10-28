
package Modelo;

public class Clientes extends Personas{

    String segundoNombre, direccion, cuidad, pais;

    public Clientes(){
    }
    
    public Clientes(String nombre, String segundoNombre,String apellidoPaterno, String apellidoMaterno,
            String direccion, String cuidad, String pais) {
        
        super(nombre, apellidoMaterno, apellidoPaterno);
        this.segundoNombre = segundoNombre;
        this.direccion = direccion;
        this.cuidad = cuidad;
        this.pais = pais;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCuidad() {
        return cuidad;
    }

    public void setCuidad(String cuidad) {
        this.cuidad = cuidad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }
   
    
    
  @Override
  public String toString(){
  return nombre;
  }


    


   

    
}
