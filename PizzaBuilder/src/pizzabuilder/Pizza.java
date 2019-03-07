/**
 * Gabriel P.
 * CPR Daniel Castelao
 * <gpietrafesavieitez@danielcastelao.org>
 */

package pizzabuilder;

public class Pizza {
    
    private double grHarina, mlAgua, grSal, mlAceite, grTomate, grQueso, grPinha;
    private String tipoAceite,tipoQueso;

    public Pizza(double grHarina, double mlAgua, double grSal, double mlAceite, double grTomate, double grQueso, double grPinha, String tipoAceite, String tipoQueso) {
        this.grHarina = grHarina;
        this.mlAgua = mlAgua;
        this.grSal = grSal;
        this.mlAceite = mlAceite;
        this.grTomate = grTomate;
        this.grQueso = grQueso;
        this.grPinha = grPinha;
        this.tipoAceite = tipoAceite;
        this.tipoQueso = tipoQueso;
    }

    @Override
    public String toString() {
        return "Pizza{" + "grHarina=" + grHarina + ", mlAgua=" + mlAgua + ", grSal=" + grSal + ", mlAceite=" + mlAceite + ", grTomate=" + grTomate + ", grQueso=" + grQueso + ", grPinha=" + grPinha + ", tipoAceite=" + tipoAceite + ", tipoQueso=" + tipoQueso + '}';
    }
}