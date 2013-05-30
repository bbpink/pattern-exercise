public class CountDisplay extends Display {

    public CountDisplay(DisplayImpl im) {
	super(im);
    }

    public void multiDisplay(int c) {
	this.open();
	for (int i=0; i < c; i++)
	    this.print();
	close();
    }
}