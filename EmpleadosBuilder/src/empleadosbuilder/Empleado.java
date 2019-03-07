/**
 * Gabriel P.
 * CPR Daniel Castelao
 * <gpietrafesavieitez@danielcastelao.org>
 */

package empleadosbuilder;

public class Empleado {
    private String nombre, apellido1, apellido2, dni, localidad;
    private int edad;

    public Empleado(String nombre, String apellido1, String apellido2, String dni, String localidad, int edad) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.dni = dni;
        this.localidad = localidad;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", dni=" + dni + ", localidad=" + localidad + ", edad=" + edad + '}';
    }
}