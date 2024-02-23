import java.util.ArrayList;
import java.util.List;

public class Panier {
    List<Produit> produits;

    public Panier() {
        this.produits = new ArrayList<Produit>();
    }

    public void addProduitPanier(Produit produit) {
        this.produits.add(produit);
    }

    public int getPrixTotal() {
        int prixTotal = 0;
        for (Produit produit : produits) {
            prixTotal += produit.getPrix();
        }
        return prixTotal;
    }

    public void afficherPanier() {
        System.out.println("------------------------------------------------");
        System.out.println("Voici les produits dans votre panier :");
        for (Produit produit : produits) {
            produit.afficher();
        }
        System.out.println("Prix total : " + this.getPrixTotal() + " euros");
        System.out.println("------------------------------------------------");
    }
}
