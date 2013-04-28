import framework.*;

public class Main {

    public static void main(String[] args) {
	Manager m = new Manager();
	UnderlinePen u = new UnderlinePen('-');
	MessageBox as = new MessageBox('*');
	MessageBox sl = new MessageBox('/');
	m.register("a", u);
	m.register("b", as);
	m.register("c", sl);

	Product p1 = m.create("a");
	p1.use("wa-wa-");
	Product p2 = m.create("b");
	p2.use("oryaaaaa");
	Product p3 = m.create("c");
	p3.use("honto-?");
    }
}