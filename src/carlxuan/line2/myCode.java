package carlxuan.line2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class myCode {
	   public static void main (String[] args) throws java.lang.Exception
	    {
//	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	        StringBuilder sb = new StringBuilder();
//		    String input = null;
//		    while ((input = br.readLine()) != null) {
//		      sb.append(input + "|");
//		    }
	        System.out.println(getTwoSum(""));
	    }
	   
	   private static String getTwoSum(String input) {
		   input = "1 2 3 4|7|";
		   String[] params = input.split("\\|");
		   String arrPart = params[0];
		   int target = Integer.parseInt(params[1]);
		   String arrParts[] = arrPart.split("\\s+");
		   int[] arr = new int[arrParts.length];
		   for(int i = 0; i < arrParts.length;i++) {
			   if(arrParts[i].matches("\\d+")) {
				   arr[i] = Integer.parseInt(arrParts[i]);
			   }
		   }

		   int[] newArr = new int[arr.length];
		   System.arraycopy(arr, 0, newArr, 0, arr.length);
		   Arrays.sort(newArr);
		   List<int[]> resultList = process(newArr, target, arr);
		   return getBestResult(resultList);
	   }
	   
	   private static String getBestResult(List<int[]> list) {
		   if(list.size() == 1) {
			   return list.get(0)[0]+ " " +list.get(0)[1];
		   }
		   int minIndex = 0;
		   int listIndex = 0;
		   for(int i = 0; i< list.size();i++) {
			   int[] resultArr = list.get(i);
			   for(int j = 0; j < resultArr.length; j++) {   
				   if(resultArr[3] < minIndex) {
					   minIndex = resultArr[3];
					   listIndex = i;
				   }else if(resultArr[4] < minIndex) {
					   minIndex = resultArr[4];
					   listIndex = i;
				   }
			   }
		   }
		   return list.get(listIndex)[0]+ " " +list.get(listIndex)[1]; 
	   }
	   
	   private static List<int[]> process(int[] arr, int target, int[] originalArr) {
		   List<int[]> list = new ArrayList<>();
		   int i = 0;
		   int j = arr.length-1;
		   while(i < j) {
			   if(arr[i] + arr[j] > target) {
				   i++;
			   }else if(arr[i] + arr[j] < target) {
				   j--;
			   }else { 
				   int[] result = new int[2];
				   result[0] = arr[i];
				   result[1] = arr[j];
				   for(int x = 0; x<originalArr.length; x++) {
					   if(originalArr[x] == arr[i]) {
						   result[3] = x;
					   }else if(originalArr[x] == arr[i]) {
						   result[4] = x;
					   }
				   }
				   list.add(result);
			   }
		   }
		   return list;
	   }
}
