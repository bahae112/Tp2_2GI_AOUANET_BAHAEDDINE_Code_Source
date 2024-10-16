abstract class Utilisateur {
    protected String nom;
    protected String email;
    protected String motDePasse;

    public Utilisateur(String nom, String email , String motDePasse) {
        this.nom = nom;
        this.email = email;
        this.motDePasse = motDePasse;    }

    public String getNom() {
        return nom;
    }
    public String getEmail() {
        return email;
    }
    public String getmotDePasse() {
        return motDePasse;
    }
    public abstract void afficherInformations();
}