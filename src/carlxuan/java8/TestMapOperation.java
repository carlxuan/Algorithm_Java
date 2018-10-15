package carlxuan.java8;

import java.util.HashMap;
import java.util.Map;

public class TestMapOperation {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("a", "aaa");
		map.put("b", "bbb");
		map.put("c", "ccc");
		map.put("d", "ddd");
		map.put("e", "eee");
//		testRemovedByKey(map);
		testRemovedByValue(map);
	}
	
	private static void testRemovedByKey(Map<String, String> map) {
		map.keySet().remove("c");
		map.keySet().remove("e");
		System.out.println(map);
	}

	private static void testRemovedByValue(Map<String, String> map) {
		map.values().remove("ddd");
		map.values().remove("eee");
		System.out.println(map);
	}
}
