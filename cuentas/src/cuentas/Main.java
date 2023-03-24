package cuentas;
/**
 * Este código gestiona una cuenta bancaria
 * @author Sergio Brais
 */

public class Main {
    /**
     * Método main. Crea una nueva cuenta y comprueba el estado de la misma mostrándolo en pantalla.
     * @param args
     */
    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;
        /**
         * Constructor de la cuenta
         */
        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        /**
         * Devuelve el saldo de la cuenta
         */
        System.out.println("El saldo actual es"+ saldoActual );
        operativa_cuenta(cuenta1, null);
    }

    /**
     * La clase operativa_cuenta trabaja con el saldo actual de la misma para retirar o ingresar una cantidad definida
     * @param cantidad indica la cantida con la que se trabajará.
     * @param cuenta1 es el objeto que hace referencia a la cuenta bancaria actual
    */
    private static void operativa_cuenta(CCuenta cuenta1, Float cantidad) {
        /**
         * Probará si es posible retirar la cantidad indicada sino devolvera "Fallo al retirar"
         */
        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        /**
         * Probará si es posible ingresar la cantidad indicada sino devolvera "Fallo al ingresar"
         */
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
