package java_file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Read_file {

	public static void main(String[] args) throws IOException {
		String location ="C:\\Users\\a850360\\OneDrive - Eviden\\Documents\\sound.txt";
		FileReader filereader=new FileReader(location);
		BufferedReader reader=new BufferedReader(filereader);
		String currentline;
		while((currentline =reader.readLine())!=null) {
			System.out.println(currentline);
		}

	}

}
