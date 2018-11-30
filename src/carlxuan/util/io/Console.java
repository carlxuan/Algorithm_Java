package carlxuan.util.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Console implements IO{

	@Override
	public String readAll() throws IOException {
		return readLine();
	}

	@Override
	public String readLine() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		return reader.readLine();
	}
	
	public static void main(String[] args) throws IOException {
		Console c = new Console();
		System.out.println(c.readAll());
	}

}
