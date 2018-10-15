package carlxuan.optimization;

public class TestReplace {

	public static void main(String[] args) {
		testReplace("bc");
	}
	
	private static void testReplace(String str) {
		//replace method will be invoked even it doesn't matches
		System.out.println(str.replace("a", replace()));
	}
	
	private static String replace() {
		System.out.println("Start to replace");
		return "abc";
	}

}
