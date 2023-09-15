package circonferenza;

import java.util.Scanner;

public class CirconferenzaProva {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Inserie il valore dell'ascissa del punto A: ");
        double x1A = s.nextDouble();
        System.out.print("Inserie il valore dell'ordinata del punto A: ");
        double y1A = s.nextDouble();
        System.out.print("Inserie il valore dell'ascissa del punto B: ");
        double x2B = s.nextDouble();
        System.out.print("Inserie il valore dell'ordinata del punto B: ");
        double y2B = s.nextDouble();

        Circonferenza c = new Circonferenza(x1A, y1A, x2B, y2B);
        System.out.println("Il raggio è di: " + c.getRaggio());
        System.out.println("Il perimetro è di: " + c.getPerimetro());
        System.out.println("L'area è di: " + c.getArea());
        
        System.out.println(c.stampa());

    }

}
