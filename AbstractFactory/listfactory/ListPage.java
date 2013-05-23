package listfactory;
import factory.*;
import java.util.Iterator;

public class ListPage extends Page {

    public ListPage(String t, String a) {
	super(t, a);
    }

    public String makeHTML() {
	StringBuffer b = new StringBuffer();
	b.append("<html><head><title>" + this.title + "</title></head>\n");
	b.append("<body>\n");
	b.append("<h1>" + this.title + "</h1>\n");
	b.append("<ul>\n");

	Iterator it = this.content.iterator();
	while (it.hasNext()) {
	    Item i = (Item)it.next();
	    b.append(i.makeHTML());
	}

	b.append("</ul>\n");
	b.append("<hr><address>" + this.author + "</address>");
	b.append("</body></html>\n");
	return b.toString();
    }
}