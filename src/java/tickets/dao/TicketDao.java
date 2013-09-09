/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tickets.dao;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import tickets.hibernate.HibernateManager;
import tickets.pojo.Ticket;
import tickets.pojo.Usuario;

/**
 *
 * @author Administrador
 */
public class TicketDao extends HibernateManager {
    
    public TicketDao(){
        myClass = new Ticket();
    }
    
    public List<Ticket> getList(Usuario usuario){
         ArrayList<Ticket> lista = new ArrayList<Ticket>(); 
           // obtener la sesion actual  
           Session session = getSession();  
           try {  
               // comenzar la transaccion  
               session.beginTransaction();  
               // cargar objeto por clave  
               lista =(ArrayList<Ticket>) session.createCriteria(
                       myClass.getClass())
                       .createCriteria("cliente", "c")
                       .add(Restrictions.eq("c.id", usuario.getId()))
                       .list();  
               // confirmar transaccion  
               session.getTransaction().commit();  
           } catch (Exception e) {  
               System.out.println("Error en getElementById: " + e);  
               // deshacer transaccion  
               this.rollback();  
           }  
           return lista;  
    }
    
}
