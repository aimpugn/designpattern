package pattern.iterator.book;

import pattern.iterator.interfaces.Aggregate;
import pattern.iterator.interfaces.Iterator;


public class BookShelf implements Aggregate {
	private Book[] books;
	private int last = 0;
	
	public BookShelf(int maxsize) {
		this.books = new Book[ maxsize ];
	}
	
	/**
	 * 
	 * @param index 인덱스
	 * @return 인덱스에 해당하는 책
	 */
	public Book getBookAt( int index ) {
		return books[ index ];
	}

	/**
	 * 책을 추가한다<p>
	 * 책이 추가되면 마지막 인덱스 증가 
	 * @param book 추가할 책
	 */
	public void appendBook( Book book ) {
		this.books[ last ] = book;
		last++;
	}
	
	/**
	 * @return BookShelf의 길이
	 */
	public int getLength() {
		return last;
	}

	/**
	 * {@link BookShelf#books}를 순회하기 위한 반복자 인스턴스
	 */
	@Override
	public Iterator iterator() {
		return new BookShelfIterator( this );
	}
}
