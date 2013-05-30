public class Display {

    private DisplayImpl impl;
    public Display(DisplayImpl im) {
	this.impl = im;
    }

    public void open() {
	this.impl.rawOpen();
    }

    public void print() {
	this.impl.rawPrint();
    }

    public void close() {
	this.impl.rawClose();
    }

    public final void display() {
	this.open();
	this.print();
	this.close();
    }

}