package com.historymanager;
import java.util.* ;
public class BrowserBuddy {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Browser browser = new Browser();
        boolean running = true;

        //getting user choice as input , calling methods and displaying out
        while (running) {
            System.out.println("--- BrowserBuddy Menu ---");
            System.out.println("1. Open Tab");
            System.out.println("2. Close Tab");
            System.out.println("3. Restore Tab");
            System.out.println("4. Show Tabs");
            System.out.println("5. Visit Page in Tab");
            System.out.println("6. Back in Tab");
            System.out.println("7. Forward in Tab");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter URL to open: ");
                    String url = sc.nextLine();
                    browser.openTab(url);
                    break;

                case 2:
                    browser.showTabs();
                    System.out.print("Enter tab index to close: ");
                    int closeIndex = sc.nextInt();
                    browser.closeTab(closeIndex);
                    break;

                case 3:
                    browser.restoreTab();
                    break;

                case 4:
                    browser.showTabs();
                    break;

                case 5:
                    browser.showTabs();
                    System.out.print("Enter tab index: ");
                    int tabIndex = sc.nextInt();
                    sc.nextLine();
                    
                    Tab tab = browser.getTab(tabIndex);
                    if (tab != null) {
                        System.out.print("Enter URL to visit: ");
                        String newUrl = sc.nextLine();
                        tab.visit(newUrl);
                        System.out.println(" Current page: " + tab.getCurrentPage());
                    }
                    break;

                case 6:
                    browser.showTabs();
                    System.out.print("Enter tab index: ");
                    int backIndex = sc.nextInt();
                    
                    Tab backTab = browser.getTab(backIndex);
                    if (backTab != null) {
                        backTab.back();
                        System.out.println(" Current page: " + backTab.getCurrentPage());
                    }
                    break;

                case 7:
                    browser.showTabs();
                    System.out.print("Enter tab index: ");
                    int forwardIndex = sc.nextInt();
                    
                    Tab forwardTab = browser.getTab(forwardIndex);
                    if (forwardTab != null) {
                        forwardTab.forward();
                        System.out.println(" Current page: " + forwardTab.getCurrentPage());
                    }
                    break;

                case 8:
                    running = false;
                    System.out.println(" Exiting BrowserBuddy...");
                    break;

                default:
                    System.out.println(" Invalid choice!");
            }
        }
        sc.close();
	}
}
