# NetBeans Platform Tutorial for Geospatial Systems

This git repository follows the steps of the NetBeans Platform Tutorial for Geospatial Systems found at https://platform.netbeans.org/tutorials/nbm-geospatial.html

At step 5 of Creating Features the IDE may flag Bundle as not resolved until you save or otherwise get the IDE to compile for org.openide.util.NbBundle.Messages to generate Bundle.

After step 3 of Configuring the Geospatial System, Removing Tabs when I run the application the tabs are not removed. If I delete build/testuserdir and run they are removed. On the second and subsequent runs after deleting testuserdir the tab appears. This may be a timing issue. See https://blogs.oracle.com/geertjan/entry/farewell_to_space_consuming_weird1

I'm using NetBeans 8.0.2 (installed as 8.0.1) with JDK 1.7.0_21. See Output.txt for more information on the setup and output on a run with the tabs appearing.

I tried NetBeans 8.1 on JDK 1.8_25 with the same results. It seems more sleep is the answer. About seven times more does it on my system under either JDK and either NetBeans version. 3250ms is working currently. It seems to pause on the loading screen for a few seconds due to this. I noticed the solution when it worked after putting breakpoints on the sleep line and on the UIManager.put so it took a while longer to start up, waiting for me to continue.