package monedas;

public class Yuan extends Moneda{

    private double yuanALempira=3.40;
    private double yuanADolar=0.14;
    private double yuanARublo=12.89;

    public Yuan(String pais, String moneda) {
        super(pais, moneda);
    }

    public double getYuanALempira() {
        return yuanALempira;
    }

    public double getYuanADolar() {
        return yuanADolar;
    }

    public double getYuanARublo() {
        return yuanARublo;
    }
}
