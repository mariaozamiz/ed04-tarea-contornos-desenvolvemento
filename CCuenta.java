/** La clase CCuenta representa una cuenta bancaria. Permite realizar operaciones como ingresos, retiros y consulta de saldo.
 * 
 */
public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    
    /**
     * Constructor por defecto de la clase CCuenta
     */

    public CCuenta()
    {
    }

    /**
     * Constructor con parámetros de la clase CCuenta
     * 
     * @param nom	Nombre del titular
     * @param cue	Número de cuenta
     * @param sal	Saldo inicial de la cuenta
     * @param tipo	Tipo de interés de la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Devuelve el saldo de la cuenta
     * 
     * @return Saldo
     */
    public double estado()
    {
        return saldo;
    }

    /**
     * Permite ingresar dinero en la cuenta
     * 
     * @param cantidad		cantidad en euros	
     * @throws Exception	lanza excepcion si la cantidad es negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Permite retirar dinero de la cuenta
     * 
     * @param cantidad		cantidad en euros
     * @throws Exception	lanza excepcion si la cantidad es negativa o no hay saldo suficiente
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
