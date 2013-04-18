public class Main {
    public static void main(String args[]) {
	BookShelf bookShelf = new BookShelf();
	bookShelf.appendBook(new Book("abunai hon"));
	bookShelf.appendBook(new Book("blue na hon"));
	bookShelf.appendBook(new Book("choppiri horror"));
	bookShelf.appendBook(new Book("doerai hon"));
	bookShelf.appendBook(new Book("erohon"));
	Iterator it = bookShelf.iterator();
	while (it.hasNext()) {
	    Book b = (Book)it.next();
	    System.out.println(b.getName());
	}
    }
}