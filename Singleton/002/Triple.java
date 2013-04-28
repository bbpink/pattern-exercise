public class Triple {

    private static Triple[] t = new Triple[3];
    t[0] = new Triple();
    t[1] = new Triple();
    t[2] = new Triple();

    private Triple() {
    }

    public static Triple getInstance(int index) {
	return t[index];
    }


}