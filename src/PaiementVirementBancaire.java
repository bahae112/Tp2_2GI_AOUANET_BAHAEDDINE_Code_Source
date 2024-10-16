
class PaiementVirementBancaire implements Paiement{
	@Override 
	public void effectuerPaiement(double montant) {
        System.out.println("Paiement de "+montant + "effectue par virement bancaire.");
    }
	
}
