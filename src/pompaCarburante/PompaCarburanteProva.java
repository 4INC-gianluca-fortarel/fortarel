package pompaCarburante;

public class PompaCarburanteProva {

    public static void main(String[] args) {
        PompaCarburante distributore = new PompaCarburante("distributtore", 1.8, 500);
        System.out.println("Quantita' rimasta: " + distributore.riempimentoCisterna());
        System.out.println("Quantita' neccesaria: " + distributore.riempimentoCisterna());
        System.out.println("Valore carburante rimasto: " + distributore.calcolaValoreRim());
        System.out.println("L'imperto del pieno e' di: " + distributore.calcolaImportoPieno());

        System.out.println("\n-------------------------");

        PompaCarburante distributore1 = new PompaCarburante("Distributore 1", 1.5, 1000);
        PompaCarburante distributore2 = new PompaCarburante("Distributore 2", 1.6, 1200);
        PompaCarburante distributore3 = new PompaCarburante("Distributore 3", 1.4, 900);

        double litri = 10.0;

        double costoDistributore1 = distributore1.calcolaCosto(litri);
        double costoDistributore2 = distributore2.calcolaCosto(litri);
        double costoDistributore3 = distributore3.calcolaCosto(litri);

        System.out.println("Costo del " + distributore1.getNomeDistributore() + ": " + costoDistributore1);
        System.out.println("Costo del " + distributore2.getNomeDistributore() + ": " + costoDistributore2);
        System.out.println("Costo del " + distributore3.getNomeDistributore() + ": " + costoDistributore3);

        if (costoDistributore1 < costoDistributore2 && costoDistributore1 < costoDistributore3) {
            System.out.println("Il distributore più conveniente è " + distributore1.getNomeDistributore());
        } else if (costoDistributore2 < costoDistributore1 && costoDistributore2 < costoDistributore3) {
            System.out.println("Il distributore più conveniente è " + distributore2.getNomeDistributore());
        } else {
            System.out.println("Il distributore più conveniente è " + distributore3.getNomeDistributore());
        }
    }

}    

