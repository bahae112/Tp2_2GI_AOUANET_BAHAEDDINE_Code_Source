public class Main {
    public static void main(String[] args) {
        // Création d'un membre avec un nom, un email et un mot de passe
        Membre membre = new Membre("Bahae", "bahae@gmail.com", "@@/1399");

        Bibliothecaire bibliothecaire = new Bibliothecaire("Aouanet", "aouanet@gmail.com", "an&et44@");

        Livre livre1 = new Livre("Les Misérables", "Victor Hugo",true);
        Livre livre2 = new Livre("1984", "George Orwell", false);

        membre.rechercherLivre(livre1);
        membre.emprunterLivre(livre1); 
        membre.emprunterLivre(livre2); 


        Paiement paiementVirement = new PaiementVirementBancaire();
        Paiement paiementCarte = new PaiementCarteBancaire();

        
        membre.payerAmende(paiementVirement, 10.0);
        membre.payerAmende(paiementCarte, 5.0);

       
        bibliothecaire.gererLivres(livre1, "ajouter");
        bibliothecaire.genererRapport(new RapportEmpruntQuotidien());
        bibliothecaire.genererRapport(new RapportEmpruntMensuel());
    }
}
