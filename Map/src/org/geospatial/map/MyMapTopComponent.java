package org.geospatial.map;

import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.util.NbBundle.Messages;
import org.openide.windows.TopComponent;

@TopComponent.Description(preferredID = "MyMapTopComponent", persistenceType = TopComponent.PERSISTENCE_ALWAYS)
@TopComponent.Registration(mode = "editor", openAtStartup = true)
@ActionID(category = "Window", id = "org.geospatial.map.MyMapTopComponent")
@ActionReferences({
	@ActionReference(path = "Menu/Window", position = 0)})
@TopComponent.OpenActionRegistration(displayName = "#CTL_MyMapAction")
@Messages("CTL_MyMapAction=Open Map")
public class MyMapTopComponent extends TopComponent {

	@Messages("CTL_MyMapName=Map")
	public MyMapTopComponent() {
		setDisplayName(Bundle.CTL_MyMapName());
	}
}
