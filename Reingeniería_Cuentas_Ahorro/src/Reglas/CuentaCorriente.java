package Reglas;
import java.math.BigDecimal;
import java.math.RoundingMode;
import javax.swing.JOptionPane;

/**
 *
 * @authors Roa Porras, Pimiento Escobar, Muñoz Aguilar.
 */
public class CuentaCorriente {
    private double balance = 0;
    
    public void setBalance (double balance) {
        this.balance =  balance;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public void depositar (double consignacion){
        balance = balance + consignacion;
    }
    
    public void retirar(double retiro) {
        if(balance >= retiro){
            balance = round(balance - retiro, 5);
            //balance = balance - retiro;
        }
        else{
             JOptionPane.showMessageDialog(null,
                        "¡No hay suficiente saldo en tu cuenta para retirar $" + String.valueOf(retiro) +"!" ,
                        "Saldo insuficiente",
                        JOptionPane.ERROR_MESSAGE);
        }
    }

    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
    
}
