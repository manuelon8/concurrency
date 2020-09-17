package memoryStore;

public class Item {
	
	private int value1;
	private int value2;
	
	
	
	
	public  Item(int value1, int value2) {
		super();
		this.value1 = value1;
		this.value2 = value2;
	}
	public void setValue1(int v) {
	value1=v;
	}
	public void setValue2(int v) {
	value2=v;
	}
	public int getValue1() {
	return value1;
	}
	public int getValue2() {
	return value2;
	}


}
