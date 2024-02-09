package java_file;

import java.io.FileWriter;
import java.io.IOException;

public class File_Writer {

	public static void main(String[] args) throws IOException {
		String location="UsingFileWriter.txt";
		String content="Learning Java is Simple!";
		FileWriter filewriter=new FileWriter(location);
		filewriter.write(content);
		filewriter.close();
		
	}

}
