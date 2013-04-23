package idcard;
import framework.*;

public class IDCard extends Product {
    private String owner;
    private int id;

    IDCard(String owner, int id) {
	System.out.println(owner + "(" + id + ")のカードをつくりますー");
	this.owner = owner;
	this.id = id;
    }

    public void use() {
	System.out.println(owner + "(" + this.id + ")のカードを使ってる！！！");
    }

    public String getOwner() {
	return this.owner;
    }
}