public class Director {
    private Builder b;

    public Director(Builder builder) {
	this.b = builder;
    }

    public void construct() {
	b.makeTitle("女の子");
	b.makeString("キュート");
	b.makeItems(new String[]{"ショートカット", "ボブ", "恥ずかしがり屋"});
	b.makeString("セクシー");
	b.makeItems(new String[]{"ニーソ", "胸元"});
	b.close();
    }

}