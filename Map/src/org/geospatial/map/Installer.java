package org.geospatial.map;

import javax.swing.UIManager;
import org.openide.awt.Actions;
import org.openide.windows.OnShowing;

@OnShowing
public class Installer implements Runnable {

	@Override
	public void run() {
		Actions.forID("Window", "org.netbeans.core.windows.actions.ToggleFullScreenAction").actionPerformed(null);
		UIManager.put("ViewTabDisplayerUI", "org.geospatial.map.NoTabsTabDisplayerUI");
		UIManager.put("EditorTabDisplayerUI", "org.geospatial.map.NoTabsTabDisplayerUI");
	}
}
