package prodotto;

public class Prodotto {

    private double prezzo;
    private double iva;
    private double peso;
    private double tara;
    private String descrizione;
    private String codiceABarre;

    public Prodotto(double prezzo, double iva, double peso, double tara, String descrizione, String codiceABarre) {
        this.prezzo = prezzo;
        this.iva = iva;
        this.peso = peso;
        this.tara = tara;
        this.descrizione = descrizione;
        this.codiceABarre = codiceABarre;
    }

    public String getCodiceABarre() {
        return codiceABarre;
    }

    public void setCodiceABarre(String codiceABarre) {
        this.codiceABarre = codiceABarre;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public double getTara() {
        return tara;
    }

    public void setTara(double tara) {
        this.tara = tara;
    }

    public double prezzoIvato() {
        return prezzo + (prezzo * (iva / 100));
    }

    public double pesoLordo() {
        return peso + tara;
    }

    public boolean controlloCodice() {
        boolean controllo;
        if (codiceABarre.length() != 13) {
            controllo = false;
        } else {
            int somma = 0;
            for (int i = 0; i < codiceABarre.length()-1; i += 2) {
                int cifra = Character.getNumericValue(codiceABarre.charAt(i));
                somma += cifra * 3;
            }
            
            for(int i = 1; i < codiceABarre.length()-1; i+=2){
                int cifra = Character.getNumericValue(codiceABarre.charAt(i));
                somma += cifra;
            }
            
            int cifra = somma % 10;
            int cifraContollo = Character.getNumericValue(codiceABarre.charAt(12));
            if (cifra == cifraContollo) {
                controllo = true;
            } else {
                controllo = false;
            }
        }
        return controllo;
    }

    public String stampa() {
        String t = "";
        t = "prezzo: " + prezzo + "\niva: " + iva + "\npeso: " + peso + "\ntara: "
                + tara + "\ndescrizione: " + descrizione + "\ncodiceABarre: " + codiceABarre;
        return t;
    }
}
