import java.util.ArrayList;
import java.util.List;

class Membre extends Utilisateur {
    private List<Emprunt> historiqueEmprunts = new ArrayList<>();

    public Membre(String nom, String email , String motDePasse) {
        super(nom, email,motDePasse);
    }

    public void rechercherLivre(Livre livre) {
        System.out.println(nom + " recherche le livre: " + livre.getTitre());
    }

    public void emprunterLivre(Livre livre) {
        if (livre.estDisponible()) {
            Emprunt emprunt = new Emprunt(this, livre);
            historiqueEmprunts.add(emprunt);
            livre.setDisponible(false);
            System.out.println(nom +" a emprunte le livre: "+ livre.getTitre());
        } else {
            System.out.println("Le livre "+livre.getTitre()+" n'est pas disponible.");
        }
    }

    public void payerAmende(Paiement methodePaiement, double montant) {
        methodePaiement.effectuerPaiement(montant);
    }

    @Override
    public void afficherInformations() {
        System.out.println("Membre: "+nom+", Email: "+email);
    }
}