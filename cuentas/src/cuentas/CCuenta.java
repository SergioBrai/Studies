
package cuentas;

/**
* @author Sergio Brais
*/
public class CCuenta {

    /**
     * @return the nombre devuelve  el nombre de la cuenta
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre define el nombre de la cuenta
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cuenta devuelve los datos de la cuenta actual
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta sirve para sobreescribir los datos de la cuenta actual
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo devuelve el saldo actual de la cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo sobreescribe el valor anterior del saldo por el actual
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInterés devuelve el tipo de interés generado
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    
    /**
     * Constructor de la clase CCuenta
     */
    public CCuenta() {
    }

    /**
     * ´La clase CCuenta tiene los siguientes parámetros
     * @param nom nombre de la cuenta
     * @param cue cuenta con la que estamos trabajando
     * @param sal saldo de la cuenta
     * @param tipo tipo de interés de la cuenta
     */
    
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }
    
    /**
     * Define el saldo actual utilizando el método getSaldo()
     * @return getSaldo();
     */
    public double estado() {
        return getSaldo();
    }

    /**
     * Condicional que comprueba si la cantidad a ingresar es válida
     * 
     * @param cantidad
     * @throws Exception 
     */
    public void ingresar(double cantidad) throws Exception {
        //Se comprobará la cantidad a ingresar, si es negativa dará error, pero si es positiva hará el ingreso
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        /**
         * Establece el saldo actual tras el ingreso del dinero
         */
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Comprueba si el valor a retirar es positivo y menor al total actual de la cuenta
     * @param cantidad
     * @throws Exception 
     */
    public void retirar(double cantidad) throws Exception {
        /**
         * Devuelve error su la cantidad a retirar es menor a 0
         */
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        /**
         * Si el saldo es menor que la cantidad a retirar devuelve el error correspondiente
          */
        if (estado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        /**
         * Establece el saldo actual tras la retirada del dinero
         */
        setSaldo(getSaldo() - cantidad);
    }
}