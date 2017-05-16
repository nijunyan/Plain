package eee;

class Outer{
	class Inner{
		
	}
}

public class NestedTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer out = new Outer();
		Outer.Inner inner = out.new Inner();
	}

}
