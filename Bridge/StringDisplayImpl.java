public class StringDisplayImpl extends DisplayImpl {

    private String s;
    private int width;

    public StringDisplayImpl(String str) {
	this.s = str;
	this.width = this.s.getBytes().length;
    }

    public void rawOpen() {
	printLine();
    }

    public void rawPrint() {
	System.out.println("|" + this.s + "|");
    }

    public void rawClose() {
	printLine();
    }

    private void printLine() {
	System.out.print("+");
	for (int i=0; i < this.width; i++)
	    System.out.print("-");
	System.out.println("+");
    }

}