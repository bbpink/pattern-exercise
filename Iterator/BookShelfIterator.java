public class BookShelfIterator implements Iterator {
    private BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
	this.bookShelf = bookShelf;
	this.index = 0;
    }

    public boolean hasNext() {
	return (index < this.bookShelf.getLength());
    }

    public Object next() {
	Book book = this.bookShelf.getBookAt(this.index);
	this.index++;
	return book;
    }
}