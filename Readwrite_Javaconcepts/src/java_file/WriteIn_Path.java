package java_file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WriteIn_Path {

	public static void main(String[] args) throws IOException {
		String location="UsingPath.txt";
		String content="Learning is Fun";
		Path path=Paths.get(location);
		Files.write(path, content.getBytes());
		
		

	}

}
