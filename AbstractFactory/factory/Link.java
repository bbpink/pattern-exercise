package factory;

public abstract class Link extends Item {
    protected String url;

    public Link(String c, String u) {
	super(c);
	this.url = u;
    }
}