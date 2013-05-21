package factory;

public abstract class Factory {
    public static Factory getFactory(String classname) {
	Factory f = null;

	try {
	    f = (Factory)Class.forName(classname).newInstance();
	} catch (ClassNotFoundException e) {
	    System.err.println(classname + "is not found");
	} catch (Exception e) {
	    e.printStackTrace();
	}
	return f;
    }

    public abstract Link createLink(String c, String u);
    public abstract Tray createTray(String c);
    public abstract Page createPage(String t, String a);
}