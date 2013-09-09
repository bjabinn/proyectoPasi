/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tickets.bean;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.html.HtmlDataTable;
import javax.faces.context.FacesContext;
import tickets.bean.utils.AbstractBean;
import tickets.dao.UsuarioDao;
import tickets.pojo.Usuario;

/**
 *
 * @author Administrador
 */
@ManagedBean

public class UsuariosBean  extends  AbstractBean{
    
    private UsuarioDao dao;
    private HtmlDataTable dataTable;
    public UsuariosBean(){
        dao = new UsuarioDao();
    }
    
    public ArrayList<Usuario> getUsuarios(){
        ArrayList<Usuario> tmp = (ArrayList<Usuario>) dao.getList();
        return tmp;
    }

    public HtmlDataTable getDataTable() {
        return dataTable;
    }

    public void setDataTable(HtmlDataTable dataTable) {
        this.dataTable = dataTable;
    }
    
    
    public String editar(){
        Usuario user = (Usuario)dataTable.getRowData();
        getSession().put("usuario", user);
        return "usuariosForm";
    }
    
    public String eliminar(){
        Usuario user = (Usuario)dataTable.getRowData();
        dao.delete(user);
        return null;
    }
    
}
