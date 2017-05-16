package eee;

import java.util.*;

class TempClass<T>{ 
	public T returnValue(){
		T ele = null;
		
		return ele; 
	}
	public static <T> T addAndReturn(T element, Collection<T> collection){
	    collection.add(element);
	    return element;
	}
}
class Parent{
	
}

class Handle{
	public void processElements(List<? extends Parent> elements){
		
		   for(Parent a : elements){
		      System.out.println(a);
		   }
		}
	
	public void process(List<? super Parent> elements){ 
		   for(Object a : elements){
		      System.out.println(a);
		   }
		}
}
class Son extends Parent{
	
}



public class GenericTest {
	
	public static void main(String[] args) {
		 List<Son> ps = new ArrayList<Son>();
		 ps.add(new Son());
		 ps.add(new Son());
		 new Handle().processElements(ps);
		 
		 List ob = new ArrayList();
		 ob.add(1);
		 ob.add("e");
		 new Handle().process(ob);

	}

}
