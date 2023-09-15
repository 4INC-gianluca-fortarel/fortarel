package testo;

import java.util.Scanner;

public class TestoProva {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Inserisci il messaggio da codificare: ");
        String messaggio = s.nextLine();
        Testo t = new Testo(messaggio);
        System.out.println("Messaggio originale: " + messaggio);
        System.out.println("Messaggio codificato: " + t.codificMessaggio());
    }
}

