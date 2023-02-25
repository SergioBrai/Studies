package cuentas;
/**
 * 
 * @author Sergio Brais
 */

public class Main {

    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        operativa_cuenta(cuenta1, null);
    }

    /**
     * @param cantidad
     * @param cuenta1
    */
    private static void operativa_cuenta(CCuenta cuenta1, java.lang.Float cantidad) {
        //Probará si es posible retirar la cantidad indicada sino devolvera "Fallo al retirar"
        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        //Probará si es posible ingresar la cantidad indicada sino devolvera "Fallo al ingresar"
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
