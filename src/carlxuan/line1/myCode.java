package carlxuan.line1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class myCode {
	  public static void main(String[] args) throws java.lang.Exception {
//		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//		    StringBuilder sb = new StringBuilder();
//		    String input = null;
//		    while ((input = br.readLine()) != null) {
//		      sb.append(input + "|");
//		    }
		    System.out.println(getMax(""));
		  }

		  static long window;
		  static long[] arr;
		  public static String getMax(String input) {
			  input = "2|1|2|-1|3|";
		    String[] params = input.split("|");
		    System.out.println(Arrays.toString(params));
		    if (params.length == 0)
		      throw new IllegalArgumentException();
		    arr = new long[params.length-1];
		    window = Long.parseLong(params[0].trim());
		    for (int i = 1; i < params.length; i++) {
		      if (params[i].matches("[-]?\\d+")) {
		        arr[i-1] = Long.parseLong(params[i]);
		      }
		    }
		    if(arr.length >= window) {
		      return getMaxByWindow();
		    }
		    return "";
		  }
		  
		  static long max = -3000000001L;
		  private static void resetMax()
		  {
		    max = -3000000001L;
		  }
		  private static String getMaxByWindow() {
		    StringBuilder sb = new StringBuilder();
		    for(int i = 0; i < arr.length && window<=arr.length-i; i++) {
		      resetMax();
		      for(int j = i; j < i+window && j< arr.length; j++) {
		        if(arr[j] > max) {
		          max = arr[j];
		        }
		      }
		      if(max != -3000000001L) { 
		        sb.append(max+"\n");
		      }
		    }
		    return sb.toString();
		  }
}
