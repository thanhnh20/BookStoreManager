/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fu.ultis;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import javax.servlet.ServletContext;


/**
 *
 * @author ASUS
 */
public class MyApplicationHelper {
    public static void getSiteMap(ServletContext context) throws IOException{
        // 1. get SiteMaps file
        String siteMapsFile = context.getInitParameter("SITE_MAPS_FILE_PATH");
        // 2. load Properties
        InputStream is = null;
        is = context.getResourceAsStream(siteMapsFile);
        Properties prop = new Properties();
        prop.load(is);
        // 3. set attribute
        context.setAttribute("SITE_MAPS", prop);
    }
}
