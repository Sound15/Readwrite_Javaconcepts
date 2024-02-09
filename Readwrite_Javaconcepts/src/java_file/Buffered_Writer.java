package java_file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Buffered_Writer {

	public static void main(String[] args) throws IOException {
		String location="Using BufferedWriter.txt";
		String content="Winter is coming";
		FileWriter fileWriter=new FileWriter(location);
		BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
		bufferedWriter.write(content);
		bufferedWriter.close();
	

	}

}
