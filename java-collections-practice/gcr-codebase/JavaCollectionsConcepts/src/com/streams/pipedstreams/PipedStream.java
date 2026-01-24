package com.streams.pipedstreams;
import java.io.* ;
import java.util.* ;

public class PipedStream {

	public static void main(String[] args) {
		try {
            Scanner sc = new Scanner(System.in);

            // Connecting streams , creating new threads and starting threads
            PipedOutputStream pout = new PipedOutputStream();
            PipedInputStream pin = new PipedInputStream(pout);

            WriterThread writer = new WriterThread(pout, sc);
            ReaderThread reader = new ReaderThread(pin);

            reader.start();
            writer.start();

        } 
		catch (IOException e) {
            System.err.println("Error connecting streams: " + e.getMessage());
        }


	}

}
