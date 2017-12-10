package facture;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Date;

public class Facture {
    
    private final ArrayList<LigneFacture> CatalogueFacture = new ArrayList<>();
    
    private final Client destinataire;
    private final Date emission;
    private final int numero;

    public Facture(Client destinataire, Date emission, int numero) {
        this.destinataire=destinataire;
        this.emission=emission;
        this.numero=numero;
    }

    /**
     * Get the value of numero
     *
     * @return the value of numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Get the value of emission
     *
     * @return the value of emission
     */
    public Date getEmission() {
        return emission;
    }

    /**
     * Get the value of destinataire
     *
     * @return the value of destinataire
     */
    public Client getDestinataire() {
        return destinataire;
    }


    
    public void ajouteLigne(Article a, int nombre, float remise ) {
        LigneFacture l = new LigneFacture (nombre, this, a, remise);
        CatalogueFacture.add(l);
   }
    
   public float montantTTC(float tauxTVA) {
        float total= 0f;
        for (LigneFacture ligne : CatalogueFacture){
            total = total + ligne.montantLigne();
        }
        total=total*(1+tauxTVA);
        
        return total;
   }
   
   public void print(PrintStream out, float tva) {
        CatalogueFacture.toString();
   }
   
}
