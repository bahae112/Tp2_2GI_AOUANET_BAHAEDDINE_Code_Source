class PaiementCarteBancaire implements Paiement {
    @Override
    public void effectuerPaiement(double montant) {
        System.out.println("Paiement de " + montant + " effectué par carte bancaire.");
    }
}
