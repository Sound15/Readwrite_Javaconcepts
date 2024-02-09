package java_file;

import java.io.FileOutputStream;
import java.io.IOException;

public class File_Output_Stream {

	public static void main(String[] args) throws IOException {
		String location="Using FOS.TXT";
		String content="Share this if you like";
		FileOutputStream outputStream=new FileOutputStream(location);
		byte[] writeThis=content.getBytes();
		outputStream.write(writeThis);
		outputStream.close();
		
		
	}

}

