/** La clase CCuenta representa una cuenta bancaria. Permite realizar operaciones como ingresos, retiros y consulta de saldo.
 * 
 */
public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    
    /**
     * Constructor de la clase CCuenta.
     * 
     * @param nombre       El nombre del titular de la cuenta.
     * @param cuenta       El número de cuenta.
     * @param saldo        El saldo inicial de la cuenta.
     * @param tipoInterés  El tipo de interés de la cuenta.
     */

    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    public double estado()
    {
        return saldo;
    }

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
