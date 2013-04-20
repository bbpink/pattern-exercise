import java.io.*;

public class Main {
    public static void main(String[] args) {
	FileIO f = new FileProperties();
	try {
	    f.readFromFile(args[0]);
	    f.setValue("year", "2014");
	    f.setValue("month", "4");
	    f.setValue("day", "20");
	    f.writeToFile(args[1]);
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }
}