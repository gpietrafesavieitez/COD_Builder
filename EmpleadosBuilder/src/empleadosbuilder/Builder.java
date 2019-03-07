/**
 * Gabriel P.
 * CPR Daniel Castelao
 * <gpietrafesavieitez@danielcastelao.org>
 */

package empleadosbuilder;

public class Builder {
    private String nombre, apellido1, apellido2, dni, localidad;
    private int edad;
    
    // Parametros obligatorios
    public Builder(String nombre, String apellido1, String dni){
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.dni = dni;
    }

    public Builder setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public Builder setApellido1(String apellido1) {
        this.apellido1 = apellido1;
        return this;
    }

    public Builder setApellido2(String apellido2) {
        this.apellido2 = apellido2;
        return this;
    }

    public Builder setDni(String dni) {
        this.dni = dni;
        return this;
    }

    public Builder setLocalidad(String localidad) {
        this.localidad = localidad;
        return this;
    }

    public Builder setEdad(int edad) {
        this.edad = edad;
        return this;
    }
    
    public Empleado createEmpleado(){
        return new Empleado(nombre,apellido1,apellido2,dni,localidad,edad);
    }
}