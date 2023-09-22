package supermercato;

public class Supermercato {

    private String nome;
    private String indirizzo;
    private Prodotto[] prodotto;
    private int dimL;

    public Supermercato(Prodotto[] prod, String nome, String indirizzo) {
        this.dimL = prodotto.length;
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.prodotto = copia(prod);
    }

    private Prodotto[] copia(Prodotto[] a) {
        Prodotto[] c = new Prodotto[a.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        return c;
    }

    public void addProdotto(Prodotto p) {
        Prodotto[] copiaProdotti = new Prodotto[dimL + 1];
        for (int i = 0; i < copiaProdotti.length; i++) {
            if (i < prodotto.length) {
                copiaProdotti[i] = prodotto[i];
            } else {
                copiaProdotti[i] = p;
            }
        }
        prodotto = copiaProdotti;
    }
    
    /*public void addProd(Prodotto p){
        if(dimL >= this.prodotto.lenght)
            prodotto = resize((prodotto.length*20)/100);
        prodotto[dimL] - pAdd;
        dimL++;
    }*/

    public void addProdotto2(double prezzo, double iva, double peso, double tara, String descrizione, String codiceABarre) {
        Prodotto[] copiaProdotti = new Prodotto[prodotto.length + 1];

        Prodotto prod = new Prodotto(prezzo, iva, peso, tara, descrizione, codiceABarre);
        for (int i = 0; i < copiaProdotti.length; i++) {
            if (i < prodotto.length) {
                copiaProdotti[i] = prodotto[i];
            } else {
                copiaProdotti[i] = prod;
            }
        }
        prodotto = copiaProdotti;
    }
    
    public void rimuoviProdotto(Prodotto pElliminare){
        Prodotto[] copiaProdotti = new Prodotto[prodotto.length - 1];
        
        
    }

    public String prezzoAlto() {
        String nom = "";
        int pos = 0;
        for (int i = 0; i < prodotto.length; i++) {
            if (prodotto[pos].prezzoIvato() <= prodotto[i].prezzoIvato()) {
                pos = i;
            }
        }
        nom = prodotto[pos].getDescrizione();
        return nom;
    }

    public double valoreMerce() {
        double valore = 0;
        for (int i = 0; i < prodotto.length; i++) {
            valore += prodotto[i].prezzoIvato();
        }
        return valore;
    }

    public String pesoMinore() {
        String nom = "";
        int pos = 0;
        for (int i = 0; i < prodotto.length; i++) {
            if (prodotto[pos].getPeso() >= prodotto[i].getPeso()) {
                pos = i;
            }
        }
        nom = prodotto[pos].getDescrizione();
        return nom;
    }

    public String merciSopraLaMedia() {
        String merci = "";
        int media = 0;
        for (int i = 0; i < prodotto.length; i++) {
            media += prodotto[i].getPrezzo();
        }
        media /= prodotto.length;

        for (int i = 0; i < prodotto.length; i++) {
            if (prodotto[i].getPrezzo() > media) {
                merci += prodotto[i].getDescrizione() + " - ";
            }
        }
        return merci;
    }

    public String stampa() {
        String t = "";
        t = "nome: " + nome + "\nindirizzo: " + indirizzo;
        return t;
    }

}
