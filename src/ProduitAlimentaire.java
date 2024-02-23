import java.time.LocalDate;

public class ProduitAlimentaire extends Produit{
    private LocalDate dateLimite;

    public ProduitAlimentaire(String nom, String description, int prix, LocalDate dateLimite){
        super(nom, description, prix);
        this.dateLimite = dateLimite;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Date limite : " + dateLimite);
    }

    public LocalDate getDateLimite() {
        return dateLimite;
    }

    public void setDateLimite(LocalDate dateLimite) {
        this.dateLimite = dateLimite;
    }
}
