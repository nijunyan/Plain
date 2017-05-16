package eee;

class Temp{
	private int a;
	private String name;
	
	public Temp(){
		
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Temp(int v, String n){
		this.a = v;
		this.name = n;
	}
	public void dump(){
		System.out.println(a);
		System.out.println(name);
	}
	
}

public class Operator {
	public static void swap(Object a, Object b){
		Object tmp = a;
		a = b;
		b = tmp;
	}
	public static void swap(Temp a, Temp b){
		Temp tmp = new Temp(a.getA(),a.getName());
		a.setA(b.getA());
		b.setA(tmp.getA()); 
	}
	public static void print(Object o){
		System.out.println(o);
	}
	public static void main(String[] args) throws ClassNotFoundException {
		Temp t = new Temp();
		Class cl = Class.forName("eee.Temp");
		System.out.println(cl.getName());
		for(String arg:args){
			System.out.println(arg);
		}

		byte[] bb = new byte[]{'a','b'}; 
		for (byte b:bb){ 
			System.out.print(b);
		}
		System.out.println();
		String s = new String(bb);
		System.out.println(s);
		Temp t1 = new Temp(1,"");
		Temp t2 = new Temp(2,"");
		swap(t1,t2);
		print(t1.getA());
		print (t2.getA());
	}

}
