/*
 The database will be opened (or created if not exists yet) when the web application starts, 
by instantiating an EntityManagerFactory.
The database will be closed when the web application stops
(or when the web server shuts down), by closing that EntityManagerFactory.
 */
package guest;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import javax.persistence.*;
//import javax.servlet.*;

/**
 * Web application lifecycle listener.
 *
 * @author User
 */
@WebListener()
public class GuestListener implements ServletContextListener {
    
    // Prepare the EntityManagerFactory & Enhance:
    @Override
    public void contextInitialized(ServletContextEvent e) {
        com.objectdb.Enhancer.enhance("guest.*");
        EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("$objectdb/db/guest.odb");
        e.getServletContext().setAttribute("emf", emf);
    }
    
    // Release the EntityManagerFactory:
    @Override
    public void contextDestroyed(ServletContextEvent e) {
        EntityManagerFactory emf =
            (EntityManagerFactory)e.getServletContext().getAttribute("emf");
        emf.close();
    }
   
}
