package carlxuan.string;

public class AnagramCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean is = new AnagramCheck().isAnagram("word", "owdr");
		System.out.println(is);
	}
	
	public boolean isAnagram(String first, String second)
	{
		char[] firstArr = first.toCharArray();
		StringBuilder sb = new StringBuilder(second);
		for(char i : firstArr){
			if(sb.indexOf(i+"") != -1)
			{
				sb.deleteCharAt(sb.indexOf(i+""));
			}else
			{
				return false;
			}
		}
		return sb.length() == 0? true:false;
	}

}
