public abstract class Builder {

    boolean titled = false;

    public void makeTitle(String title) {
	if (!this.titled) {
	    this.setTitle(title);
	    this.titled = true;
	}
    }

    public void makeString(String s) {
	if (titled)
	    this.setString(s);
    }

    public void makeItems(String[] items) {
	if (titled)
	    this.setItems(items);
    }

    public void close() {
	if (titled)
	    this.finish();
    }

    protected abstract void setTitle(String t);
    protected abstract void setString(String s);
    protected abstract void setItems(String[] i);
    protected abstract void finish();
}