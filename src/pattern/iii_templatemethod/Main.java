package pattern.iii_templatemethod;

public class Main {
	public static void main(String[] args) {
		AbstractDisplay ad1 = new CharDisplay( 'h' );
		AbstractDisplay ad2 = new StringDisplay( "hello, world" );
		ad1.display();
		ad2.display();
	}
}
