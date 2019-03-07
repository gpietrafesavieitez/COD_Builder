/**
 * Gabriel P.
 * CPR Daniel Castelao
 * <gpietrafesavieitez@danielcastelao.org>
 */

package pizzabuilder;

public class Builder {
    private double grHarina, mlAgua, grSal, mlAceite, grTomate, grQueso, grPinha;
    private String tipoAceite,tipoQueso;
    
    public Builder(){
        grHarina = 350;
        mlAgua = 200;
    }
    
    public Builder(double grHarina, double mlAgua){
        this.grHarina = grHarina;
        this.mlAgua = mlAgua;
    }

    public Builder setGrHarina(double grHarina) {
        this.grHarina = grHarina;
        return this;
    }

    public Builder setMlAgua(double mlAgua) {
        this.mlAgua = mlAgua;
        return this;
    }

    public Builder setGrSal(double grSal) {
        this.grSal = grSal;
        return this;
    }

    public Builder setMlAceite(double mlAceite) {
        this.mlAceite = mlAceite;
        return this;
    }

    public Builder setGrTomate(double grTomate) {
        this.grTomate = grTomate;
        return this;
    }

    public Builder setGrQueso(double grQueso) {
        this.grQueso = grQueso;
        return this;
    }

    public Builder setGrPinha(double grPinha) {
        this.grPinha = grPinha;
        return this;
    }

    public Builder setTipoAceite(String tipoAceite) {
        this.tipoAceite = tipoAceite;
        return this;
    }

    public Builder setTipoQueso(String tipoQueso) {
        this.tipoQueso = tipoQueso;
        return this;
    }
    
    public Pizza createPizza(){
        return new Pizza(grHarina,mlAgua,grSal,mlAceite,grTomate,grQueso,grPinha,tipoAceite,tipoQueso);
    }
}