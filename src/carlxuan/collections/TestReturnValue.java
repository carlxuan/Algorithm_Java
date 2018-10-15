package carlxuan.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestReturnValue {

	public static void main(String[] args) {
//		testSet();
//		testList();
		testMap();
	}
	
	private static void testList() {
		List<Name> list = new ArrayList<>();
		System.out.println(list.add(new Name("a",12)));
		System.out.println(list.add(new Name("a",15)));
		System.out.println(list.add(new Name("b",12)));
		System.out.println(list.remove(new Name("b",12)));
		System.out.println(list.remove(new Name("b",13)));
	}
	
	private static void testMap() {
		Map<Name, String> set = new HashMap<>();
		System.out.println(set.put(new Name("a",12), "x"));
		System.out.println(set.put(new Name("a",15), "y"));
		System.out.println(set.put(new Name("b",12), "z"));
		
//		System.out.println(set.remove(new Name("a",12)));
//		System.out.println(set.remove(new Name("a",15), "y"));
//		System.out.println(set.get(new Name("c", 12)));
		System.out.println(set.keySet().remove(new Name("a",12)));
	}
	
	private static void testSet() {
		Set<Name> set = new HashSet<>();
		System.out.println(set.add(new Name("a",12)));
		System.out.println(set.add(new Name("a",15)));
		System.out.println(set.add(new Name("b",12)));
		
	}

	static class Name {
		public String name;
		public int age;
		public Name(String name, int age) {
			this.name = name;
			this.age = age;
		}
		
		@Override
		public int hashCode() {
			return age;
		}
		
		@Override
		public boolean equals(Object name) {
			return ((Name)name).age == this.age;
		}
	}
}
