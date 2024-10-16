class PaiementCarteBancaire implements Paiement {
    @Override
    public void effectuerPaiement(double montant) {
        System.out.println("Paiement de "+montant+" effectue par carte bancaire.");
    }
}
