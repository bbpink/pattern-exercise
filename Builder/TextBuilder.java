public class TextBuilder extends Builder {
    private StringBuffer sb = new StringBuffer();

    public void makeTitle(String title) {
	sb.append("||||||||||||||||||||||");
	sb.append("[" + title + "]\n\n");
    }

    public void makeString(String s) {
	sb.append("@@@" + s + "\n\n");
    }

    public void makeItems(String[] items) {
	for (int i=0; i < items.length; i++) {
	    sb.append("  - " + items[i] + "\n");
	}
	sb.append("\n");
    }

    public void close() {
	sb.append("||||||||||||||||||||||\n");
    }

    public String getResult() {
	return this.sb.toString();
    }
}