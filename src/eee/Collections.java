package eee;
import java.util.*;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*List<Integer> intlist = new ArrayList();
		intlist.add(1);
		Set<Integer> tree = new TreeSet();
		tree.add(1);
		tree.add(3);
		tree.addAll(tree);
		 
		for (Integer t : tree) {
			System.out.println(t);
		}
		
		Map<String, Integer> map = new HashMap();
		map.put("eee", 1);
		for(String key : map.keySet()){
			System.out.println(map.get(key));
		}
		
		String os = "13-19-10-";
		StringBuffer sb = new StringBuffer(os);
		
		while(sb.indexOf("-")!=-1){
			sb.replace(sb.indexOf("-"), sb.indexOf("-")+1, "");
			System.out.println(sb.toString());
		}
		System.out.println(sb.toString());*/
		
		//Set order
		/*Set<Integer> treeset = new TreeSet<Integer>();
		treeset.add(3);
		treeset.add(1);
		treeset.add(5);
		for(Integer ts: treeset){
			System.out.println(ts);
		}*/
		
		/*List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add(0,"000");
		Iterator it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}*/
		
		/*NavigableSet original = new TreeSet();
		original.add("1");
		original.add("2");
		original.add("3");

		//ceiling will be "2".
		Object ceiling = original.ceiling("2");
		System.out.println(ceiling);
		//floor will be "2".
		Object floor = original.floor("2");
		System.out.println(floor);*/
		
		/*Map<String,String> map = new HashMap<>();
		map.put("0", "a");
		map.put("1", "b");
		map.put("2", "c");
		
		for(String s:map.values()){
			System.out.println(s);
		}
		for(String k:map.keySet()){
			System.out.println(map.get(k));
		}*/
		/*
		Map<String,String> smap = new TreeMap<>();
		smap.put("0", "a");
		smap.put("2", "c");
		smap.put("1", "b");
		
		for(String s:smap.values()){
			System.out.println(s);
		}
		for(String k:smap.keySet()){
			System.out.println(smap.get(k));
		}*/
		
		/*NavigableSet<String> set = new TreeSet<String>();
		set.add("a");
		set.add("b");
		set.add("c");
		
		Set dset = set.descendingSet();
		dset.add("d");
		Iterator it = dset.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}		*/
		
		/*NavigableMap<String,String> original = new TreeMap<>();
		original.put("1", "1");
		original.put("2", "2");
		Map.Entry<String, String> en = original.lastEntry();
		System.out.println(en.getKey()+" "+en.getValue());*/
		
		/*Queue<Integer> q = new LinkedList<>();
		q.add(1);
		q.add(3);
		q.add(2);
		Iterator it = q.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		while(!q.isEmpty()){
			int e = q.remove();
			System.out.println(e);
		}*/
		Map<String, Integer> map = new HashMap();
		map.put("eee", 1);
		for(String key : map.keySet()){
			System.out.println(map.get(key));
		}
		for(Integer value : map.values()){
			System.out.println(value);
		}
		
	}

}
