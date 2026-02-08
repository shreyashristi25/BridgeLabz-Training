package com.multithreading.downloadmanager;
import java.util.* ;

public class DownloadManager {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//taking number of files and files as user input to download
        System.out.print("Enter number of files to download: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        String[] fileNames = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter file name " + (i+1) + ": ");
            fileNames[i] = sc.nextLine();
        }

        // Starting downloads after collecting all names
        Thread[] threads = new Thread[n];
        for (int i = 0; i < n; i++) {
            threads[i] = new Thread(new FileDownloader(fileNames[i]), "Thread-" + (i+1));
            threads[i].start();
        }

        // Waiting for all downloads to finish
        for (int i = 0; i < n; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("All downloads complete!");
        sc.close();

	}

}
