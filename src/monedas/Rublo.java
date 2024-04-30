package monedas;

public class Rublo extends Moneda{
    private double rubloALempira=0.27;
    private double rubloAYuan=0.079;
    private double rubloADolar=0.011;

    public Rublo(String pais, String moneda) {
        super(pais, moneda);
    }

    public double getRubloALempira() {
        return rubloALempira;
    }

    public double getRubloAYuan() {
        return rubloAYuan;
    }

    public double getRubloADolar() {
        return rubloADolar;
    }
}
