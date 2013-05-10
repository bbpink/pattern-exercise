import java.io.*;

public class XMLBuilder extends Builder {
    private String fn;
    private PrintWriter pw;

    public void setTitle(String title) {
	fn = title + ".xml";

	try {
	    pw = new PrintWriter(new FileWriter(fn));
	} catch (IOException e) {
	    e.printStackTrace();
	}
	pw.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?><tekitouxml>");
    }

    public void setString(String s) {
	pw.println("<header>" + s + "</header>");
    }

    public void setItems(String[] items) {
	pw.println("<contents>");
	for (int i=0; i < items.length; i++) {
	    pw.println("<item>" + items[i] + "</item>");
	}
	pw.println("</contents>");
    }

    public void finish() {
	pw.println("</tekitouxml>");
	pw.close();
    }

    public String getResult() {
	return fn;
    }
}