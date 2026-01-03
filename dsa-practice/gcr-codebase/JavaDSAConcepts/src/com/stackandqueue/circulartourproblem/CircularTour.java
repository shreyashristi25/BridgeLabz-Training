package com.stackandqueue.circulartourproblem;

public class CircularTour {

	//method to find starting point (starting pump)
	public int findStartingPump(int[] petrol, int[] distance) {
        int n = petrol.length;
        int totalSurplus = 0;
        int currentSurplus = 0;
        int start = 0;

        for (int i = 0; i < n; i++) {
            int diff = petrol[i] - distance[i];
            totalSurplus += diff;
            currentSurplus += diff;

            if (currentSurplus < 0) {
                start = i + 1;
                currentSurplus = 0;
            }
        }

        return (totalSurplus >= 0) ? start : -1;
	}
}
