/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bean;

import java.util.Date;

/**
 *
 * @author zAxA
 */
public class Proceso {

    private String id;
    private String nombre;
    private String tipo;
    private byte prioridad;
    private String usuario;

    private boolean esProgramado;
    private Date fechaProgramacion;

    private String estado;


    public Proceso() {
    }
  
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the prioridad
     */
    public byte getPrioridad() {
        return prioridad;
    }

    /**
     * @param prioridad the prioridad to set
     */
    public void setPrioridad(byte prioridad) {
        this.prioridad = prioridad;
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the esProgramado
     */
    public boolean isEsProgramado() {
        return esProgramado;
    }

    /**
     * @param esProgramado the esProgramado to set
     */
    public void setEsProgramado(boolean esProgramado) {
        this.esProgramado = esProgramado;
    }

    /**
     * @return the fechaProgramacion
     */
    public Date getFechaProgramacion() {
        return fechaProgramacion;
    }

    /**
     * @param fechaProgramacion the fechaProgramacion to set
     */
    public void setFechaProgramacion(Date fechaProgramacion) {
        this.fechaProgramacion = fechaProgramacion;
    }

}
