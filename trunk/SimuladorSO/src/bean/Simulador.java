/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bean;

/**
 *
 * @author zAxA
 */
public class Simulador {

    private byte quantum;
    private short cantidadProcesos;
    private byte sobrecarga;
    private byte maximaCantidadCaracteres;
    private String caracteresEspeciales;

    /**
     * @return the quantum
     */
    public byte getQuantum() {
        return quantum;
    }

    /**
     * @param quantum the quantum to set
     */
    public void setQuantum(byte quantum) {
        this.quantum = quantum;
    }

    /**
     * @return the cantidadProcesos
     */
    public short getCantidadProcesos() {
        return cantidadProcesos;
    }

    /**
     * @param cantidadProcesos the cantidadProcesos to set
     */
    public void setCantidadProcesos(short cantidadProcesos) {
        this.cantidadProcesos = cantidadProcesos;
    }

    /**
     * @return the sobrecarga
     */
    public byte getSobrecarga() {
        return sobrecarga;
    }

    /**
     * @param sobrecarga the sobrecarga to set
     */
    public void setSobrecarga(byte sobrecarga) {
        this.sobrecarga = sobrecarga;
    }

    /**
     * @return the maximaCantidadCaracteres
     */
    public byte getMaximaCantidadCaracteres() {
        return maximaCantidadCaracteres;
    }

    /**
     * @param maximaCantidadCaracteres the maximaCantidadCaracteres to set
     */
    public void setMaximaCantidadCaracteres(byte maximaCantidadCaracteres) {
        this.maximaCantidadCaracteres = maximaCantidadCaracteres;
    }

    /**
     * @return the caracteresEspeciales
     */
    public String getCaracteresEspeciales() {
        return caracteresEspeciales;
    }

    /**
     * @param caracteresEspeciales the caracteresEspeciales to set
     */
    public void setCaracteresEspeciales(String caracteresEspeciales) {
        this.caracteresEspeciales = caracteresEspeciales;
    }
}
