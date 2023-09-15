/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testo;

/**
 *
 * @author gianluca.fortarel
 */
public class Testo {

    private String messaggio;

    public Testo(String messaggio) {
        this.messaggio = messaggio;
    }

    public String getMessaggio() {
        return messaggio;
    }

    public void setMessaggio(String m) {
        this.messaggio = m;
    }

    private char codificaCarattere(char c) {
        char risultato = c;
        String vocali = "AEIOUaeiou";
        String consonanti = "BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz";
        if (Character.isDigit(c)) {
            if (c == '9') {
                risultato = '0';
            } else {
                risultato = (char) (c + 1);
            }
        } else if (vocali.contains(String.valueOf(c))) {
            switch (c) {
                case 'u':
                    risultato = 'a';
                    break;
                case 'U':
                    risultato = 'A';
                    break;
                default:
                    int i = vocali.indexOf(c);
                    risultato = vocali.charAt(i + 1);
                    break;
            }
        } else if (consonanti.contains(String.valueOf(c))) {
            switch (c) {
                case 'z':
                    risultato = 'b';
                    break;
                case 'Z':
                    risultato = 'B';
                    break;
                default:
                    int i = consonanti.indexOf(c);
                    risultato = consonanti.charAt(i + 1);
                    break;
            }
        }
        return risultato;

    }

    public String codificMessaggio() {
        String testo = "";
        int i = 0;
        for (i = 0; i < messaggio.length(); i++) {
            testo += codificaCarattere(messaggio.charAt(i));
        }
        return testo;
    }

    public String stampa() {
        return "messaggio: " + messaggio;
    }

}
