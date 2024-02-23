public class ProduitBoisson extends Produit{
    private int volume; //en cl

    public ProduitBoisson(String nom, String description, int prix, int volume){
        super(nom, description, prix);
        this.volume = volume;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Volume : " + volume + " cl");
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
