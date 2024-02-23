import java.util.ArrayList;
import java.util.List;
public class Boutique {
    private List<Produit> produits;

    public Boutique() {
        this.produits = new ArrayList<Produit>();
    }

    public void addProduit(Produit produit) {
        this.produits.add(produit);
    }

    public void afficherStock() {
        System.out.println("------------------------------------------------");
        System.out.println("Voici les produits disponibles dans la boutique :");
        for (Produit produit : produits) {
            produit.afficher();
        }
        System.out.println("------------------------------------------------");
    }

    public List<Produit> getProduits() {
        return produits;
    }
}