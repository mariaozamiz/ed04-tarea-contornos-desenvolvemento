public class Main {

    public static void main(String[] args, String nombre, String cuenta, int saldo, int tipoInteres) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta(nombre,cuenta,saldo,tipoInteres);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        operativa_cuenta(cuenta1, 0.0f);
    }

	private static void operativa_cuenta(CCuenta cuenta1, float cantidad) {
		try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
	}
}
