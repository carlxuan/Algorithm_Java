package carlxuan.bitset;

import java.util.Formatter;

public class ConvertIntegerToBinary {

	public static void main(String[] args) {
		usingAPIToConvert();
		DIYConvert();
	}

	private static void usingAPIToConvert() {
		int a = 1024539;
		System.out.println(Integer.toBinaryString(a));
	}

	private static void DIYConvert() {
		int a = 1024539;
		int firstByte = (a & 0xFF000000) >> 24;  // This is 0
		int secondByte = (a & 0xFF0000) >> 16;
		int thirdByte = (a & 0xFF00) >> 8;
		int fourthByte = a & 0xFF;
		String formatStr = String.format("%04d%08d%08d", Integer.parseInt(Integer.toBinaryString(secondByte)),
				Integer.parseInt(Integer.toBinaryString(thirdByte)),
				Integer.parseInt(Integer.toBinaryString(fourthByte)));
		System.out.println(formatStr);
	}

}
