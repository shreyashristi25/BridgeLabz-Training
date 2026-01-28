package com.junit.test.fileprocessor;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import com.junit.main.fileprocessor.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;


public class FileProcessorTest {

	private final FileProcessor fp = new FileProcessor() ;
	
	@TempDir
	Path tempDir ; //creating  a temporary directory for safe testing
	
	@Test
	void testWriteAndReadFile() throws IOException {
		File file = tempDir.resolve("testfile.txt").toFile() ;
		String content = "Hiiii !" ;
		
		fp.writeToFile(file.getAbsolutePath(), content) ;
		String readContent = fp.readFromFile(file.getAbsolutePath()) ;
		assertEquals(content, readContent, "Contents should match after writing and reading the file.") ;
	}
	
	@Test
    void testFileExistsAfterWriting() throws IOException {
        File file = tempDir.resolve("existsFile.txt").toFile();
        String content = "File existence check";

        fp.writeToFile(file.getAbsolutePath(), content);

        assertTrue(file.exists(), "File should exist after writing");
    }

    @Test
    void testIOExceptionWhenFileDoesNotExist() {
        String nonExistentFile = tempDir.resolve("missing.txt").toFile().getAbsolutePath();

        assertThrows(IOException.class, () -> {
            fp.readFromFile(nonExistentFile);
        }, "Reading a non-existent file should throw IOException");
    }

}
