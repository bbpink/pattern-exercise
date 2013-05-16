package factory;
import java.util.ArrayList;

public abstract class Tray extends Item {
    protected ArrayList<Item> tray = new ArrayList<Item>();

    public Tray(String c) {
	super(c);
    }

    public void add(Item i) {
	tray.add(i);
    }
}