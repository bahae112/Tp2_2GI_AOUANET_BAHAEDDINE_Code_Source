class Bibliothecaire extends Utilisateur {
    public Bibliothecaire(String nom, String email , String motDePasse) {
        super(nom, email,motDePasse);
    }
    public void gererLivres(Livre livre, String action) {
        switch (action.toLowerCase()) {
        	case "ajouter":
                System.out.println("livre ajoute:" + livre.getTitre());
                break;
            case "modifier":
                System.out.println("livre modifie:" + livre.getTitre());
                break;
            case "supprimer":
                System.out.println("livre supprime:" + livre.getTitre());
                break;
            default:
                System.out.println("action not defined");
        }
    }
    public void gererUtilisateurs(Utilisateur utilisateur, String action) {
        switch (action.toLowerCase()) {
            case "ajouter":
                System.out.println("utilisateur ajoute:" + utilisateur.getNom());
                break;
            case "modifier":
                System.out.println("utilisateur modifie:" + utilisateur.getNom());
                break;
            case "supprimer":
                System.out.println("utilisateur supprime:" + utilisateur.getNom());
                break;
            default:
                System.out.println("action not defined");
        }
    }
    public void genererRapport(Rapport rapport) {
        rapport.generer();
    }
    @Override
    public void afficherInformations() {
        System.out.println("Bibliothécaire: " + nom + ", Email: " + email);
    }
}