package supermercato;

public class SupermercatoProva {

    public static void main(String[] args) {

        Prodotto p1 = new Prodotto(10.0, 22.0, 1.5, 0.2, "Pane", "1234567890120");
        Prodotto p2 = new Prodotto(14.0, 12.0, 6.5, 2.2, "Acqua", "173562936298");
        Prodotto[] pr = new Prodotto[2];
        pr[0] = p1;
        pr[1] = p2;

        Prodotto p3 = new Prodotto(23, 23, 23, 76, "yogurt", "1165345272");

        Supermercato s = new Supermercato(pr, "MD", "indirizzo");
        s.addProdotto2(54, 24, 25, 6, "pizza", "11902736282");
        s.addProdotto(p3);

        System.out.println("Il prodotto con il prezzo maggiore è: " + s.prezzoAlto());
        System.out.println("Il valore di tutta la merce è di: " + s.valoreMerce());
        System.out.println("Il peso minore è di: " + s.pesoMinore());
        System.out.println("Pordotti con il valore non ivato superiore al valore medio sono: " + s.merciSopraLaMedia());
        System.out.println(s.stampa());
    }

}
