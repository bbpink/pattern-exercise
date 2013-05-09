import java.io.*;

public class HTMLBuilder extends Builder {
    private String fn;
    private PrintWriter pw;

    public void setTitle(String title) {
	fn = title + ".html";

	try {
	    pw = new PrintWriter(new FileWriter(fn));
	} catch (IOException e) {
	    e.printStackTrace();
	}
	pw.println("<html><head><title>" + title + "</title></head><body>");
	pw.println("<h1>" + title + "</h1>");
    }

    public void setString(String s) {
	pw.println("<p>" + s + "</p>");
    }

    public void setItems(String[] items) {
	pw.println("<ul>");
	for (int i=0; i < items.length; i++) {
	    pw.println("<li>" + items[i] + "</li>");
	}
	pw.println("</ul>");
    }

    public void finish() {
	pw.println("</body></html>");
	pw.close();
    }

    public String getResult() {
	return fn;
    }
}