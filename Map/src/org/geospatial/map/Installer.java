package org.geospatial.map;

import org.openide.awt.Actions;
import org.openide.windows.OnShowing;

@OnShowing
public class Installer implements Runnable {

	@Override
	public void run() {
		Actions.forID("Window", "org.netbeans.core.windows.actions.ToggleFullScreenAction").actionPerformed(null);
	}
}
