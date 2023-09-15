package prodotto;

public class ProdottoProva {

    public static void main(String[] args) {
        Prodotto p = new Prodotto(10.0, 22.0, 1.5, 0.2, "Prodotto di test", "1234567890120");
        System.out.println("Descrizione: " + p.getDescrizione());
        System.out.println("Prezzo: " + p.getPrezzo());
        System.out.println("IVA: " + p.getIva());
        System.out.println("Peso: " + p.getPeso());
        System.out.println("Tara: " + p.getTara());
        System.out.println("Codice a barre: " + p.getCodiceABarre());

        System.out.println("Prezzo ivato: " + p.prezzoIvato());
        System.out.println("Peso lordo: " + p.pesoLordo());

        if (p.controlloCodice() == true) {
            System.out.println("Il codice a barre è valido.");
        } else {
            System.out.println("Il codice a barre non è valido.");
        }
        
        System.out.println("\n----Attributi----\n" + p.stampa());
    }
    
}
