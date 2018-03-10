package iterator.book.main;

import iterator.book.Book;
import iterator.book.BookShelf;
import iterator.interfaces.Iterator;

public class Main {

	public static void main(String[] args) {
		BookShelf bookShelf = new BookShelf( 4 );
		bookShelf.appendBook( new Book( "파이썬 웹 프로그래밍" ) );
		bookShelf.appendBook( new Book( "HTML + CSS3 입문" ) );
		bookShelf.appendBook( new Book( "자사스크립트 핵심 가이드" ) );
		bookShelf.appendBook( new Book( "CentOS" ) );
		
		Iterator it = bookShelf.iterator();
		while( it.hasNext() ) {
			Book book = ( Book ) it.next();
			System.out.println( book.getName() );
		}
		
	}

}
