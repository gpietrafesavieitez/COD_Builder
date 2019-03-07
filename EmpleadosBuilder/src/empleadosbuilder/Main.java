/**
 * Gabriel P.
 * CPR Daniel Castelao
 * <gpietrafesavieitez@danielcastelao.org>
 */

package empleadosbuilder;

public class Main {

    public static void main(String[] args) {
        Empleado e1 = new Builder("gabriel","pietra","1234A").setApellido1("pietrafesa").setEdad(23).createEmpleado();
        System.out.println(e1.toString());
    }
}
