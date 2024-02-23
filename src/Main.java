import java.time.LocalDate;
import java.util.List;

public class Main {
    public Main() {
    }

    public static void main(String[] var0) {
        Boutique maBoutique = new Boutique();

        Produit produit1 = new Produit("Livre", "Un livre de qualité", 10);
        Produit produit2 = new Produit("Ordinateur", "Un ordinateur de qualité", 1000);
        Produit produit3 = new Produit("Vélo", "Un vélo de qualité", 150);

        maBoutique.addProduit(produit1);
        maBoutique.addProduit(produit2);
        maBoutique.addProduit(produit3);

        List<Produit> produitsDispo = maBoutique.getProduits();
        System.out.println("Voici les produits disponibles dans la boutique :");
        for (Produit produit : produitsDispo) {
            System.out.println(produit.getNom() + " : " + produit.getDescription() + " - " + produit.getPrix() + " euros");
        }

        maBoutique.afficherStock();

        Boutique maBoutique2 = new Boutique();

        ProduitAlimentaire produit4 = new ProduitAlimentaire("Pain", "Un pain de qualité", 2, LocalDate.of(2021, 12, 31));
        ProduitAlimentaire produit5 = new ProduitAlimentaire("Yaourt", "Un yaourt de qualité", 1, LocalDate.of(2021, 12, 31));
        ProduitBoisson produit6 = new ProduitBoisson("Jus d'orange", "Un jus de qualité", 3, 100);
        ProduitElectronique produit7 = new ProduitElectronique("Télévision", "Une télévision de qualité", 500, 42);

        maBoutique2.addProduit(produit4);
        maBoutique2.addProduit(produit5);
        maBoutique2.addProduit(produit6);
        maBoutique2.addProduit(produit7);

        maBoutique2.afficherStock();

        Panier monPanier = new Panier();

        monPanier.addProduitPanier(produit1);
        monPanier.addProduitPanier(produit2);
        monPanier.addProduitPanier(produit3);
        monPanier.addProduitPanier(produit4);

        monPanier.afficherPanier();
    }
}
