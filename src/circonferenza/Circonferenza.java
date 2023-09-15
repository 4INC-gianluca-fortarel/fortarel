package circonferenza;

public class Circonferenza {

    private double x1A;
    private double y1A;
    private double x2B;
    private double y2B;

    public Circonferenza(double x1A, double y1A, double x2B, double y2B) {
        this.x1A = x1A;
        this.y1A = y1A;
        this.x2B = x2B;
        this.y2B = y2B;
    }

    public double getX1A() {
        return x1A;
    }

    public void setX1A(double x1A) {
        this.x1A = x1A;
    }

    public double getX2B() {
        return x2B;
    }

    public void setX2B(double x2B) {
        this.x2B = x2B;
    }

    public double getY1A() {
        return y1A;
    }

    public void setY1A(double y1A) {
        this.y1A = y1A;
    }

    public double getY2B() {
        return y2B;
    }

    public void setY2B(double y2B) {
        this.y2B = y2B;
    }

    public double getRaggio() {
        double raggio = 0.0;
        raggio = Math.sqrt(Math.pow((x1A - x2B), 2) + Math.pow((y1A - y2B), 2));
        return raggio;
    }

    public double getPerimetro() {
        double perimetro = 0.0;
        perimetro = 2 * Math.PI * getRaggio();
        return perimetro;
    }

    public double getArea() {
        double Area = 0.0;
        Area = Math.PI * Math.pow(getRaggio(), 2);
        return Area;
    }
    
    public String stampa(){
        String t = "";
        t = "x1A: " + x1A + "\ny1A: " + y1A + "\nx2B: " + x2B + "\ny2B: " + y2B;
        return t;
    }
}
