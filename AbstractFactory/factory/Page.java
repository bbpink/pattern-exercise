package factory;
import java.io.*;
import java.util.ArrayList;

public abstract class Page {
    protected String title;
    protected String author;
    protected ArrayList<Item> content = new ArrayList<Item>();

    public Page(String t, String a) {
	this.title = t;
	this.author = a;
    }

    public void add(Item i) {
	this.content.add(i);
    }

    public void output() {
	try {
	    String fn = title + ".html";
	    Writer w = new FileWriter(fn);
	    w.write(this.makeHTML());
	    w.close();
	    System.out.println("sakusei kanryou!");
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }

    public abstract String makeHTML();
}