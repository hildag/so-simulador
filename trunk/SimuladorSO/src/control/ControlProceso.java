/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package control;

import bean.Proceso;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zAxA
 */
public class ControlProceso {

    private List<Proceso> listaProceso;

    public ControlProceso() {
        listaProceso = new ArrayList<Proceso>();
    }
       

    public void agregarProceso(Proceso proceso) {
        listaProceso.add(proceso);
    }

    public void eliminarProceso(String id) {

    }

    public void cambiarEstado(String estado) {
        
    }

    public List getListadoProceso() {
        return listaProceso;
    }

}
