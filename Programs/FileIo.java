package sept_16;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIo {

	public static void main(String[] args) throws IOException {

		FileInputStream in = new FileInputStream("D:\\Garry.txt");
//		FileOutputStream out = new FileOutputStream(null);

		int c;
		while ((c = in.read()) != -1) {

			System.out.print((char) c);

		}

	}

}
