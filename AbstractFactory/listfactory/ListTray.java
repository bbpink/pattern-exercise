package listfactory;
import factory.*;
import java.util.Iterator;

public class ListTray extends Tray {

    public ListTray(String c) {
	super(c);
    }

    public String makeHTML() {
	StringBuffer b = new StringBuffer();
	b.append("<li>\n");
	b.append(this.caption + "\n");
	b.append("<ul>\n");
	Iterator it = tray.iterator();
	while (it.hasNext()) {
	    Item i = (Item)it.next();
	    b.append(i.makeHTML());
	}

	b.append("</ul>\n");
	b.append("</li>\n");

	return b.toString();
    }

}