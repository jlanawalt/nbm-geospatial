package org.geospatial.map;

import static java.lang.Thread.sleep;
import javax.swing.UIManager;
import org.openide.modules.OnStart;
import org.openide.util.Exceptions;

@OnStart
public class OnStartInstaller implements Runnable {

    @Override
    public void run() {
        try {
            sleep(500);
        } catch (InterruptedException ex) {
            Exceptions.printStackTrace(ex);
        }
        UIManager.put("ViewTabDisplayerUI", "org.geospatial.map.NoTabsTabDisplayerUI");
        UIManager.put("EditorTabDisplayerUI", "org.geospatial.map.NoTabsTabDisplayerUI");
    }
    
}
