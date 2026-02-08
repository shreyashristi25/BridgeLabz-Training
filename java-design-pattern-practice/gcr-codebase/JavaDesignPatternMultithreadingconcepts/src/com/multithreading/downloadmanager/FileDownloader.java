package com.multithreading.downloadmanager;
import java.util.* ;

public class FileDownloader implements Runnable {

	private String fileName ;
	private  Random random = new Random() ;
	
	//constructor
	public FileDownloader(String fileName) {
        this.fileName = fileName;
    }


	@Override
	public void run() {
		for( int progress =0; progress <= 100; progress+=5) {
			System.out.println("[" + Thread.currentThread().getName() + "] Downloading " 
                               + fileName + ": " + progress + "%") ;
			try {
				Thread.sleep(random.nextInt(300));
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
