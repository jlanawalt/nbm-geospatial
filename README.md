# NetBeans Platform Tutorial for Geospatial Systems

This git repository follows the steps of the NetBeans Platform Tutorial for Geospatial Systems found at https://platform.netbeans.org/tutorials/nbm-geospatial.html

At step 5 of Creating Features the IDE may flag Bundle as not resolved until you save or otherwise get the IDE to compile for org.openide.util.NbBundle.Messages to generate Bundle.

After step 3 of Configuring the Geospatial System, Removing Tabs when I run the application the tabs are not removed. If I delete build/testuserdir and run they are removed. On the second and subsequent runs after deleting testuserdir the tab appears. This may be a timing issue. See https://blogs.oracle.com/geertjan/entry/farewell_to_space_consuming_weird1

I'm using NetBeans 8.0.2 (installed as 8.0.1) with JDK 1.7.0_21. See Output.txt for more information on the setup and output on a run with the tabs appearing.