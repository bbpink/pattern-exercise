public class TicketMaker {

    private int ticket = 1000;
    private static TicketMaker me = new TicketMaker();

    private TicketMaker() {
    }

    public static TicketMaker getInstance() {
	return me;
    }

    public int getNextTickerNumber() {
	return this.ticket++;
    }

}

