/**
 * Gabriel P.
 * CPR Daniel Castelao
 * <gpietrafesavieitez@danielcastelao.org>
 */

package pizzabuilder;

public class Main {

    public static void main(String[] args) {
        Pizza margarita = new Builder().createPizza();
        System.out.println("Margarita: " + margarita.toString());
        
        Pizza barbacoa = new Builder(500,600).setGrTomate(230).setMlAceite(100).setTipoAceite("oliva").createPizza();
        System.out.println("Barbacoa: " + barbacoa.toString());
        
        Pizza hawaiana = new Builder().setGrPinha(1820).createPizza();
        System.out.println("Hawaiana: " + hawaiana.toString());
    }
}
