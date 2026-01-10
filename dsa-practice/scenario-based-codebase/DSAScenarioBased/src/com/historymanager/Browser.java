package com.historymanager;
import java.util.* ;

public class Browser {
	
	private List<Tab> openTabs = new ArrayList<>();
	private Stack<Tab> closedTabs = new Stack<>();

	//methods to open and close a tab
    public void openTab(String url) {
        openTabs.add(new Tab(url));
        System.out.println("Opened new tab: " + url);
    }

    public void closeTab(int index) {
        if (index >= 0 && index < openTabs.size()) {
            closedTabs.push(openTabs.get(index));
            openTabs.remove(index);
            System.out.println("Closed tab at index " + index);
        } else {
            System.out.println("⚠ Invalid tab index!");
        }
    }

    //methods to restore tab, show tabs and get tab
    public void restoreTab() {
        if (!closedTabs.isEmpty()) {
            Tab restored = closedTabs.pop();
            openTabs.add(restored);
            System.out.println("♻ Restored a closed tab.");
        } else {
            System.out.println("⚠ No closed tabs to restore!");
        }
    }

    public void showTabs() {
        System.out.println("📑 Open Tabs:");
        for (int i = 0; i < openTabs.size(); i++) {
            System.out.println(i + ": " + openTabs.get(i).getCurrentPage());
        }
    }

    public Tab getTab(int index) {
        if (index >= 0 && index < openTabs.size()) {
            return openTabs.get(index);
        }
        return null;
    }

}
