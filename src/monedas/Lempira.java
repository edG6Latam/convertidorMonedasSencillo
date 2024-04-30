package monedas;

public class Lempira extends Moneda {

    private double lempiraADolar=0.041;
    private double lempiraAYuan=0.29;
    private double lempiraARublo=3.77;

    public Lempira(String pais, String moneda) {
        super(pais, moneda);
    }

    public double getLempiraADolar() {
        return lempiraADolar;
    }

    public double getLempiraAYuan() {
        return lempiraAYuan;
    }

    public double getLempiraARublo() {
        return lempiraARublo;
    }
}
