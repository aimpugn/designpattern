package iterator.interfaces;

public interface Iterator {
	//다음 요소가 존재하는지 조사
	public abstract boolean hasNext();
	
	//다음 요소 얻기
	//다음 요소 반환하도록 내부에서 다음으로 진행시켜두기
	public abstract Object next();
}
