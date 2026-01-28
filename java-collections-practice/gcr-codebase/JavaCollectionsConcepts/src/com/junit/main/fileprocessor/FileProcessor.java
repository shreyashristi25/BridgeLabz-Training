package com.junit.main.fileprocessor;
import java.io.* ;
import java.nio.file.* ;

public class FileProcessor {

	//method to write a content to a file
	public void writeToFile(String filePath, String content) throws IOException {
		FileWriter fw = new FileWriter(filePath) ;
		fw.write(content);
		fw.close() ;
	}
	
	//method to read content from a file
	public String readFromFile(String filePath) throws IOException{
		return new String(Files.readAllBytes(new File(filePath).toPath())) ;
	}
}
