package pattern.templatemethod;

public class StringDisplay 
				extends AbstractDisplay {
	private String str;
	private int width;
	
	public StringDisplay ( String str ) {
		this.str = str;
		
		//바이트 단위로 계산한 문자열의 길이
		this.width = str.getBytes().length;
	}
	@Override
	public void open() {
		printLine();
	}

	@Override
	public void print() {
		System.out.println( "|" + str + "|");
		
	}

	@Override
	public void close() {
		printLine();
	}

	private void printLine() {
		System.out.print( "+" );
		for( int i = 0; i < width; i++ ) {
			System.out.print( "-" );
			
		}
		System.out.println( "+" );
	}
}
