import java.io.*;
import java.util.Properties;

public class FileProperties implements FileIO {
    private Properties p;

    public FileProperties() {
	this.p = new Properties();
    }

    public void readFromFile(String filename) throws IOException {
	this.p.load(new FileInputStream(filename));
    }

    public void writeToFile(String filename) throws IOException {
	this.p.store(new FileOutputStream(filename), "");
    }

    public void setValue(String key, String value) {
	this.p.setProperty(key, value);
    }

    public String getValue(String key) {
	return this.p.getProperty(key);
    }
}