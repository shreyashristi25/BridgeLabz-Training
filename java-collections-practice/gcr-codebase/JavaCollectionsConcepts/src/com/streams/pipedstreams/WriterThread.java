package com.streams.pipedstreams;
import java.io.* ;
import java.util.* ;

public class WriterThread extends Thread{

	private PipedOutputStream pout;
    private Scanner sc;

    //constructor
    public WriterThread(PipedOutputStream pout, Scanner sc) {
        this.pout = pout;
        this.sc = sc;
    }

    //Taking input from user and writing to pipe
    public void run() {
        try {
            System.out.println("Type messages (type 'exit' to stop):");
            while (true) {
                String msg = sc.nextLine();
                if (msg.equalsIgnoreCase("exit")) {
                    break;
                }
                pout.write(msg.getBytes());
                pout.write('\n'); 
                pout.flush();
            }
            pout.close();
        } 
        catch (IOException e) {
            System.err.println("Writer Error: " + e.getMessage());
        }
    }

}
