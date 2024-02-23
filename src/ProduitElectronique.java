public class ProduitElectronique extends Produit{
    private int garantie; //en mois

    public ProduitElectronique(String nom, String description, int prix, int garantie){
        super(nom, description, prix);
        this.garantie = garantie;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Garantie : " + garantie + " mois");
    }

    public int getGarantie() {
        return garantie;
    }

    public void setGarantie(int garantie) {
        this.garantie = garantie;
    }
}
