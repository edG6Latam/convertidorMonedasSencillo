package monedas;

public class Moneda {

    private String pais;
    private String moneda;
    private double total;

    public Moneda(String pais, String moneda) {
        this.pais = pais;
        this.moneda = moneda;
    }

    public String getPais() {
        return pais;
    }

    public String getMoneda() {
        return moneda;
    }

    public double convertir(double moneda, double cantidad){
      return this.total=moneda*cantidad;
    }

}
