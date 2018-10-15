package carlxuan.nio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.SynchronousQueue;

public class ReadBackAndForth {

	public static void main(String[] args) throws IOException {
		readFile();
//		readByIO();
	}

	private static void readByIO() throws FileNotFoundException, IOException {
		try(InputStream in = new FileInputStream(new File("/home/carl/test/testNIO.txt")))
		{
			byte[] b = new byte[8];
			while(in.read(b) != -1) {				
				System.out.print(new String(b));
			}
		}
	}
	private static void readFile() throws IOException {
		RandomAccessFile aFile = new RandomAccessFile("/home/carl/test/testNIO.txt", "rw");
		FileChannel inChannel = aFile.getChannel();
//		inChannel.position(8);
//		inChannel.position(12);
		//create buffer with capacity of 48 bytes
		ByteBuffer buf = ByteBuffer.allocate(48);
		int bytesRead = inChannel.read(buf); //read into buffer.
		while (bytesRead != -1) {

			buf.position(6);
		  buf.flip();  //make buffer ready for read

		  while(buf.hasRemaining()){
		      System.out.print((char) buf.get()); // read 1 byte at a time
		  }

		  buf.clear(); //make buffer ready for writing
		  bytesRead = inChannel.read(buf);
		}
		aFile.close();
	}
}
