public class Main {
    public static void main(String[] args) {
	if (args.length != 1) {
	    usage();
	    System.exit(0);
	}

	if (args[0].equals("plain")) {
	    TextBuilder tb = new TextBuilder();
	    Director d = new Director(tb);
	    d.construct();
	    String res = tb.getResult();
	    System.out.println(res);
	} else if (args[0].equals("html")) {
	    HTMLBuilder hb = new HTMLBuilder();
	    Director d = new Director(hb);
	    d.construct();
	    String res = hb.getResult();
	    System.out.println(res + "が作成されました");
	} else if (args[0].equals("xml")) {
	    XMLBuilder xb = new XMLBuilder();
            Director d = new Director(xb);
            d.construct();
            String res = xb.getResult();
            System.out.println(res + "が作成されました");
	} else {
	    usage();
	    System.exit(0);
	}
    }

    public static void usage() {
	System.out.println("plain or html or xml");
    }
}