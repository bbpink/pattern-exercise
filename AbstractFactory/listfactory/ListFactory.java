package listfactory;
import factory.*;

public class ListFactory extends Factory {

    public Link createLink(String c, String u) {
	return new ListLink(c, u);
    }

    public Tray createTray(String c) {
	return new ListTray(c);
    }

    public Page createPage(String t, String a) {
	return new ListPage(t, a);
    }

}