package com.streams.pipedstreams;
import java.io.* ;

public class ReaderThread extends Thread{

	private PipedInputStream pin;

	//constructor
    public ReaderThread(PipedInputStream pin) {
        this.pin = pin;
    }

    //reading from the pipe and prints messages
    public void run() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(pin))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println("Reader received: " + line);
            }
        } catch (IOException e) {
            System.err.println("Reader Error: " + e.getMessage());
        }
    }

}
