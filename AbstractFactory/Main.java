import factory.*;

public class Main {
    public static void Main(String[] args) {
	if (args.length != 2) {
	    System.out.println("usage: java Main listfactory.ListFactory\n java Main tablefactory.TableFactory");
	    System.exit(0);
	}

	Factory factory = Factory.getFactory(args[0]);

	Link blog1 = factory.createLink("bbpink近況", "http://sevensenses.jp/bbpink/");
	Link blog2 = factory.createLink("bbpink余興", "http://d.hatena.ne.jp/ssbbpink/");
	Link ss = factory.createLink("sevensenses", "http://sevensenses.jp/");
	Link github = factory.createLink("github", "https://github.com/bbpink");
	Link twitter = factory.createLink("twitter", "https://twitter.com/");
	Link lastfm = factory.createLink("lastfm", "http://www.lastfm.jp/user/ssbbpink");

	Tray bbs = factory.createTray("bbpinks");
	bbs.add(blog1);
	bbs.add(ss);

	Tray techs = factory.createTray("techs");
	techs.add(blog2);
	techs.add(github);

	Tray snss = factory.createTray("snss");
	snss.add(twitter);
	snss.add(lastfm);

	Page p = factory.createPage("ProfilePage", "bbpink");
	p.add(bbs);
	p.add(techs);
	p.output();

    }
}