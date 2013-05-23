package listfactory;
import factory.*;

public class ListLink extends Link {
    public ListLink(String c, String u) {
	super(c, u);
    }

    public String makeHTML() {
	return "  <li><a href=\"" + this.url + "\">" + this.caption + "</a></li>\n";
    }

}