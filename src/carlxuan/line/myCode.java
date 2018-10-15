package carlxuan.line;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class myCode {

	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = null;
		while ((input = br.readLine()) != null) {
			System.out.println(parseCmdAndExec(input));
		}
	}
 
	static myCode code = null;
	private static String parseCmdAndExec(String input) {
		StringBuilder result = new StringBuilder();
		if (input.matches("\\d+\\s+\\d+\\s*")) {
			String[] configs = input.split("[\\s]+");
			code = new myCode(Integer.parseInt(configs[0].trim()), Integer.parseInt(configs[1].trim()));
		}
		else if (code != null) {
			String[] cmdAndParam = input.split("[\\s]+");
			String cmd = cmdAndParam[0].trim();
			if ("TAKE".equals(cmd)) {
				result.append(code.addCmd().take());
			} else if ("OFFER".equals(cmd)) {
				if(cmdAndParam.length != 2) {
					return "";
				}
				String param = cmdAndParam[1];
				result.append(code.addCmd().offer(param.trim()));
			} else if ("SIZE".equals(cmd)) {
				result.append(code.addCmd().size);
			}
			return result.toString();
		}
		return "";
	}

	private String[] dataQueue;
	private int cmdSize;
	private int cmdCapacity;
	private int size;

	public myCode addCmd() {
		if(cmdSize >= cmdCapacity) {
			return null;
		}
		cmdSize++;
		return this;
	}
	public myCode(int numberOfCmd, int capacity) {
		dataQueue = new String[capacity];
		cmdCapacity = numberOfCmd;
	}

	private boolean offer(String data) {
		if (size < dataQueue.length) {
			dataQueue[size++] = data;
			return true;
		}
		return false;
	}

	private String take() {
		if (size == 0)
			return "";
		String toBeReturn = dataQueue[0];
		int i = 0;
		while (i < size - 1) {
			dataQueue[i] = dataQueue[i + 1];
			i++;
		}
		size--;
		return toBeReturn;
	}

}
