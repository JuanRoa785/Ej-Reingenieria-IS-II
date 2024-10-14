package Reglas;

/**
 *
 * @authors Roa Porras, Pimiento Escobar, Muñoz Aguilar.
 */
public class CuentaAhorros extends CuentaCorriente {

    private double tasaInteres;

    public CuentaAhorros(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    public double getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    @Override
    public void depositar(double consignacion) {
        //double newBalance = this.getBalance() + (consignacion*(1+(tasaInteres/100)));// Da error: Probar 50 con tasa de 10%
        double newBalance = this.getBalance() + consignacion + (consignacion * (tasaInteres / 100));
        this.setBalance(newBalance);
    }

}
