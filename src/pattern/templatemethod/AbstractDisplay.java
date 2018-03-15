package pattern.templatemethod;

public abstract class AbstractDisplay {
	public abstract void open();
	public abstract void print();
	public abstract void close();
	//오버라이딩 불가
	public final void display() {
		//open() 호출
		open();
		//print() 5회 호출
		for( int i = 0; i < 5; i++ ) {
			print();
		}
		//close() 호출
		close();
	}
}
