package factory;

public abstract class Item {
    protected String caption;

    public Item(String c) {
	this.caption = c;
    }

    public abstract String makeHTML();
}
