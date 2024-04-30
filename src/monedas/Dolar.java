package monedas;

public class Dolar extends Moneda {

    private double dolarALempira=24.69;
    private double dolarAYuan=7.25;
    private double dolarARublo=93.17;

    public Dolar(String pais, String moneda) {
        super(pais, moneda);
    }

    public double getDolarALempira() {
        return dolarALempira;
    }

    public double getDolarAYuan() {
        return dolarAYuan;
    }

    public double getDolarARublo() {
        return dolarARublo;
    }
}
