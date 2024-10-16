class Emprunt {
    private Membre membre;
    private Livre livre;

    public Emprunt(Membre membre, Livre livre) {
        this.membre = membre;
        this.livre = livre;
    }

    public Membre getMembre() {
        return membre;
    }

    public Livre getLivre() {
        return livre;
    }
}