package carlxuan.common.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		readLines();
	}

	public static void readLines() throws IOException {
		try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in));) {
			String tmp;
			while ((tmp = in.readLine()) != null) {			
				System.out.println( tmp);
			}
		}
	}

}
