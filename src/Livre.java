class Livre {
    private String titre;
    private String auteur;
    private boolean disponible;

    public Livre(String titre , String auteur , boolean disponible) {
        this.titre = titre;
        this.auteur = auteur;
        this.disponible = disponible;
    }

    public String getTitre() {
        return titre;
    }
    public String getAuteur() {
        return auteur;
    }

    public boolean estDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}