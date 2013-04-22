package idcard;
import framework.*;

public class IDCard extends Product {
    private String owner;

    IDCard(String owner) {
	System.out.println(owner + "のカードをつくりますー");
	this.owner = owner;
    }

    public void use() {
	System.out.println(owner + "のカードを使ってる！！！");
    }

    public String getOwner() {
	return this.owner;
    }
}