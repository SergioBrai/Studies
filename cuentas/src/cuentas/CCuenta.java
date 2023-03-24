
package cuentas;

/**
* @author Sergio Brais
*/
public class CCuenta {

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre define el nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInterés
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

    
    //Constructor de la clase cuenta
    public CCuenta() {
    }

    /**
     * @param nom
     * @param cue
     * @param sal
     * @param tipo 
     */
    
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }
    
    /**
     * 
     * @return getSaldo();
     */
    public double estado() {
        return getSaldo();
    }

    /**
     * 
     * @param cantidad
     * @throws Exception 
     */
    public void ingresar(double cantidad) throws Exception {
        //Se comprobará la cantidad a ingresar, si es negativa dará error, pero si es positiva hará el ingreso
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * 
     * @param cantidad
     * @throws Exception 
     */
    public void retirar(double cantidad) throws Exception {
        //Devuelve error su la cantidad a retirar es menor a 0
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        //Si el saldo es menos que la cantidad a retirar devuelve el error correspondiente
        if (estado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        setSaldo(getSaldo() - cantidad);
    }
}