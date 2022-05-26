/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fu.listener;

import fu.ultis.MyApplicationHelper;
import java.io.IOException;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Web application lifecycle listener.
 *
 * @author ASUS
 */
public class MyApplicationListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        // 1. get ServletContext
        ServletContext context = sce.getServletContext();
        try {
            //2. get siteMaps
            MyApplicationHelper.getSiteMap(context);
        } catch (IOException ex) {
            context.log("MyApplicationListener_IOException" + ex.getMessage());
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        ServletContext context = sce.getServletContext();
        context.removeAttribute("SITE_MAPS");
    }
}
